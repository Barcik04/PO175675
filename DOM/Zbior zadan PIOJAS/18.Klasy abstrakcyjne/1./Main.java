public class Main {
    public static void main(String[] args) {
        Hammer hammer = new Hammer("Husqvarna", 1974);
        ScrewDriver screwDriver = new ScrewDriver("Babinicz", 1911);

        hammer.use();
        screwDriver.use();
    }
}