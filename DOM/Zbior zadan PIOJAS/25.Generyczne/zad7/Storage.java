package zad7;

public class Storage<T> {
    private T item;

    public void store(T item) {
        this.item = item;
    }

    public T retrieve() {
        return item;
    }

    public static void main(String[] args) {
        Storage<String> storageStr = new Storage<>();
        Storage<Integer> storageInt = new Storage<>();

        storageInt.store(12);
        System.out.println(storageInt.retrieve());

        storageStr.store("Skrala");
        System.out.println(storageStr.retrieve());
    }
}
