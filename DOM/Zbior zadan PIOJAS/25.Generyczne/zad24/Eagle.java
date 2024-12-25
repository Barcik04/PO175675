package zad24;

public class Eagle extends Bird {
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static <T extends Bird> T findMin(Triple<? extends T> triple) {
        T first = triple.getA();
        T second = triple.getB();
        T third = triple.getC();

        T min = first;

        if (second.getAge() < min.getAge()) {
            min = second;
        }

        if (third.getAge() < min.getAge()) {
            min = third;
        }

        return min;
    }

    public static void main(String[] args) {
        Eagle eagle1 = new Eagle("Bill Eagle", 1);
        Eagle eagle2 = new Eagle("Bill Eagle", 0);
        Eagle eagle3 = new Eagle("Bill Eagle", 3);

        Triple<Eagle> tripleEagle = new Triple<>(eagle1, eagle2, eagle3);

        System.out.println(findMin(tripleEagle));
    }
}
