package zad2;

public class MemoryTester {
    public static void main(String[] args) {
        RAMManager ram = new RAMManager();
        ram.allocateMemory(7);
        ram.freeMemory();
        System.out.println(MemeoryManager.getMemoryType());

        DiskManager disk = new DiskManager();
        disk.allocateMemory(7);
    }
}
