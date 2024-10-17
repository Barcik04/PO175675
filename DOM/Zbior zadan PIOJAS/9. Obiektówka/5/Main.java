public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(14, 12);

        Time resultTime = time1.addTime(4, 17);
        System.out.println(resultTime);
        resultTime = time1.addTime(14, 17);
        System.out.println(resultTime);
        resultTime = time1.addTime(1, 127);
        System.out.println(resultTime);
    }
}