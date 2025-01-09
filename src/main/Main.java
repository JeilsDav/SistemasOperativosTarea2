package main;

import models.Partition;
import models.Process;
import services.MemoryManager;
import services.OutputManager;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Partition> partitions = new ArrayList<>();
        ArrayList<Process> processes = new ArrayList<>();

        try {
            // Solicitar datos al usuario
            partitions = OutputManager.inputPartitions(scanner);
            processes = OutputManager.inputProcesses(scanner);

            // Asignar procesos a particiones
            MemoryManager memoryManager = new MemoryManager(partitions, processes);
            memoryManager.assignProcesses();

            // Mostrar resultados
            OutputManager.displayResults(memoryManager);
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no válida. Por favor, ingrese números enteros.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}