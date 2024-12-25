package zad25;

public class Eagle extends Bird {
    public Eagle(String birdName, int birdAge) {
        super(birdName, birdAge);
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

        if (min.getBirdAge() > second.getBirdAge()) {
            min = second;
        }

        if (min.getBirdAge() > third.getBirdAge()) {
            min = third;
        }

        return min;
    }

    public static void main(String[] args) {
        Eagle eagle1 = new Eagle("Eagle", 30);
        Eagle eagle2 = new Eagle("Eagle", 31);
        Eagle eagle3 = new Eagle("Eagle", 29);

        Triple<Eagle> tripleEagle = new Triple<>(eagle1, eagle2, eagle3);

        System.out.println(Eagle.findMin(tripleEagle));
    }
}
