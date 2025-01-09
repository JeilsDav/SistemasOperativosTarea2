package models;

public class Process {
    private int size;
    private boolean isAssigned;
    private int assignedPartition;

    public Process(int size) {
        this.size = size;
        this.isAssigned = false;
        this.assignedPartition = -1;
    }

    public int getSize() {
        return size;
    }

    public boolean isAssigned() {
        return isAssigned;
    }

    public void assign(int partitionIndex) {
        this.isAssigned = true;
        this.assignedPartition = partitionIndex;
    }

    public int getAssignedPartition() {
        return assignedPartition;
    }
}