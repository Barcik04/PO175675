public class TestCounter {
    public static void main(String[] args) {
        Counter counter = new Counter(9);
        int n = 90;

        counter.increase(n);
        System.out.println(counter.getNumber());

        Counter counter2 = new Counter(2);
        counter2.add(counter);
        System.out.println(counter2.getNumber());

        counter.changevalue(19);


        Modifier modifier = new Modifier();
        modifier.changeValue(counter);
    }

}
