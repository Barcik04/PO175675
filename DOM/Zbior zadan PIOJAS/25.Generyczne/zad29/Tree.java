package zad29;

public class Tree extends Plant {
    private double height;

    public Tree(String name, int age, double height) {
        super(name, age);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + ", height: " + height;
    }

    public static void findMinMaxHeight(Tree[] trees, Pair<? super Tree> pair) {
        Tree min = trees[0];
        Tree max = trees[0];

        for (Tree tree : trees) {
            if (tree.getHeight() < min.getHeight()) {
                min = tree;
            }

            if (tree.getHeight() > max.getHeight()) {
                max = tree;
            }
        }

        pair.setFirst(min);
        pair.setSecond(max);
    }

    public static void main(String[] args) {
        Tree[] trees = {
                new Tree("Bob", 10, 2),
                new Tree("Baobab", 12, 2.99),
                new Tree("Conifer", 110, 9.11),
                new Tree("Lambad", 1, 0.12)
        };

        Pair<Tree> pair = new Pair<>();
        findMinMaxHeight(trees, pair);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
