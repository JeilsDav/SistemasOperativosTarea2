package models;

public class Partition {
    private int size;
    private boolean isFree;
    private int fragmentation;

    public Partition(int size) {
        this.size = size;
        this.isFree = true;
        this.fragmentation = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isFree() {
        return isFree;
    }

    public void allocate(int processSize) {
        this.isFree = false;
        this.fragmentation = size - processSize;
    }

    public void free() {
        this.isFree = true;
        this.fragmentation = 0;
    }

    public int getFragmentation() {
        return fragmentation;
    }
}