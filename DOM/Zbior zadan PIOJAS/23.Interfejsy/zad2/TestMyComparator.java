package zad2;

public class TestMyComparator implements MyComparator{
    @Override
    public int compare(int a, int b) {
        return Integer.compare(a, b);
    }
}
