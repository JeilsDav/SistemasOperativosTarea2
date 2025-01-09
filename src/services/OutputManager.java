package services;

import models.Partition;
import models.Process;

import java.util.ArrayList;
import java.util.Scanner;

public class OutputManager {

    public static ArrayList<Partition> inputPartitions(Scanner scanner) {
        ArrayList<Partition> partitions = new ArrayList<>();
        int numPartitions;

        while (true) {
            try {
                System.out.print("Ingrese el número de particiones: ");
                numPartitions = Integer.parseInt(scanner.nextLine());
                if (numPartitions <= 0) throw new IllegalArgumentException("El número de particiones debe ser mayor que 0.");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no válida. Por favor, ingrese un número entero.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        for (int i = 0; i < numPartitions; i++) {
            while (true) {
                try {
                    System.out.print("Tamaño de la partición " + (i + 1) + ": ");
                    int size = Integer.parseInt(scanner.nextLine());
                    if (size <= 0) throw new IllegalArgumentException("El tamaño de la partición debe ser mayor que 0.");
                    partitions.add(new Partition(size));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Entrada no válida. Por favor, ingrese un número entero.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
        return partitions;
    }

    public static ArrayList<Process> inputProcesses(Scanner scanner) {
        ArrayList<Process> processes = new ArrayList<>();
        int numProcesses;

        while (true) {
            try {
                System.out.print("Ingrese el número de procesos: ");
                numProcesses = Integer.parseInt(scanner.nextLine());
                if (numProcesses <= 0) throw new IllegalArgumentException("El número de procesos debe ser mayor que 0.");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no válida. Por favor, ingrese un número entero.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        for (int i = 0; i < numProcesses; i++) {
            while (true) {
                try {
                    System.out.print("Tamaño del proceso " + (i + 1) + ": ");
                    int size = Integer.parseInt(scanner.nextLine());
                    if (size <= 0) throw new IllegalArgumentException("El tamaño del proceso debe ser mayor que 0.");
                    processes.add(new Process(size));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Entrada no válida. Por favor, ingrese un número entero.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
        return processes;
    }

    public static void displayResults(MemoryManager memoryManager) {
        System.out.println("\nResultados:");
        System.out.println("Procesos asignados:");
        for (int i = 0; i < memoryManager.getProcesses().size(); i++) {
            Process process = memoryManager.getProcesses().get(i);
            if (process.isAssigned()) {
                System.out.println("Proceso " + (i + 1) + " (Tamaño: " + process.getSize() + ") -> Partición " + process.getAssignedPartition());
            } else {
                System.out.println("Proceso " + (i + 1) + " (Tamaño: " + process.getSize() + ") -> No asignado");
            }
        }

        System.out.println("\nFragmentación interna:");
        for (int i = 0; i < memoryManager.getPartitions().size(); i++) {
            Partition partition = memoryManager.getPartitions().get(i);
            if (!partition.isFree()) {
                System.out.println("Partición " + (i + 1) + ": " + partition.getFragmentation() + " unidades no utilizadas");
            }
        }
    }
}