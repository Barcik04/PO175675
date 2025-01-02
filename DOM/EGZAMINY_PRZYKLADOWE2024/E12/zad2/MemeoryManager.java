package zad2;

public interface MemeoryManager {
    void allocateMemory(int size);
    default void freeMemory() {
        System.out.println("Memory freed");
    }
    public static String getMemoryType() {
        return "Memory type";
    }
}
