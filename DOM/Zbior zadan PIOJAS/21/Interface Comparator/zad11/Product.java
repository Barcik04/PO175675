package zad11;

import java.util.ArrayList;
import java.util.Comparator;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", price: " + price;
    }

    public static class PriceComparator implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            return Double.compare(p1.getPrice(), p2.getPrice());
        }
    }

    public static class NameComparator implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Milk", 1.99));
        products.add(new Product(2, "Pepsi", 2.99));
        products.add(new Product(3, "Cola ", 2.99));
        products.add(new Product(4, "Avocado", 4.99));


        products.sort(new PriceComparator().thenComparing(new NameComparator()));

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
