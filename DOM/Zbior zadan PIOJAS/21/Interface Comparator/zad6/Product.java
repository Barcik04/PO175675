package zad6;

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
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price;
    }

    public static class ComparatorProduct implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            int result = Double.compare(p1.getPrice(), p2.getPrice());
            if (p1.getPrice() == p2.getPrice()) {
                return Integer.compare(p1.getId(), p2.getId());
            }
            return result;
        }
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Raman", 199.09));
        products.add(new Product(2, "Haram", 12.09));
        products.add(new Product(0, "Raman", 12.09));

        products.sort(new ComparatorProduct());

        for (Product prod : products) {
            System.out.println(prod);
        }
    }
}
