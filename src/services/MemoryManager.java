package services;

import models.Partition;
import models.Process;

import java.util.ArrayList;

public class MemoryManager {
    private ArrayList<Partition> partitions;
    private ArrayList<Process> processes;

    public MemoryManager(ArrayList<Partition> partitions, ArrayList<Process> processes) {
        this.partitions = partitions;
        this.processes = processes;
    }

    public void assignProcesses() {
        for (Process process : processes) {
            for (int i = 0; i < partitions.size(); i++) {
                Partition partition = partitions.get(i);
                if (partition.isFree() && process.getSize() <= partition.getSize()) {
                    partition.allocate(process.getSize());
                    process.assign(i + 1); // Particiones numeradas desde 1
                    break;
                }
            }
        }
    }

    public ArrayList<Partition> getPartitions() {
        return partitions;
    }

    public ArrayList<Process> getProcesses() {
        return processes;
    }
}