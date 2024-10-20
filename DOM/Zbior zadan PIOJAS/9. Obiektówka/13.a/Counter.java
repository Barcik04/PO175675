public class Counter {
    int number;

    public Counter(int number) {
        this.number = number;
    }

    public void increase(int n) {
        number += n;
    }

    public void add(Counter otherCounter) {
        this.number += otherCounter.number;
    }

    public void changevalue(int n) {
        n += number;
        System.out.println(n);
    }

    public int getNumber() {
        return number;
    }
}
