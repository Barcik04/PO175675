package zad1;

public class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box<Integer> boxInt = new Box<>();
        boxInt.setValue(2);
        System.out.println(boxInt.getValue());
    }
}
