package zad8;

import java.time.LocalDate;
import java.util.Arrays;

public class FoodProduct implements Comparable<FoodProduct>{
    private String name;
    private double price;
    private LocalDate expirationDate;

    public FoodProduct(String name, double price, LocalDate expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public int compareTo(FoodProduct other) {
        return this.expirationDate.compareTo(other.expirationDate);
    }

    @Override
    public String toString() {
        return "name: " + name + ", price: " + price + ", expirationDate: " + expirationDate;
    }

    public static void main(String[] args) {
        FoodProduct[] products = {
                new FoodProduct("Apple", 154.0, LocalDate.of(2021, 1, 1)),
                new FoodProduct("Pineapple", 1.0, LocalDate.of(2020, 1, 2)),
                new FoodProduct("Peach", 115.0, LocalDate.of(2020, 1, 3)),
        };

        Arrays.sort(products);

        for (FoodProduct product : products) {
            System.out.println(product);
        }
    }
}

