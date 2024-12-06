package zad4;

import java.time.LocalDate;
import java.util.Arrays;

public class Product implements Comparable<Product>{
    private String name;
    private int clientNumber;
    private LocalDate productionDate;

    public Product(String name, int clientNumber, LocalDate productionDate) {
        this.name = name;
        this.clientNumber = clientNumber;
        this.productionDate = productionDate;
    }

    @Override
    public int compareTo(Product other) {
        return this.productionDate.compareTo(other.productionDate);
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", clientNumber: " + this.clientNumber + ", productionDate: " + this.productionDate;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product("Raman", 1099, LocalDate.of(1990, 1, 1)),
                new Product("Babinicz", 1021, LocalDate.of(2006, 6, 15)),
                new Product("Kokosza", 966, LocalDate.of(2000, 12, 19)),
        };

        Arrays.sort(products);

        for (Product pr : products) {
            System.out.println(pr);
        }
    }
}
