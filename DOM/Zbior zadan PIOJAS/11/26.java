import java.util.Arrays;

public class Warehouse {
    private int[] productsQuantities;

    public Warehouse(int size) {
        this.productsQuantities = new int[size];
    }

    public int[] getProductsQuantities() {
        return productsQuantities;
    }

    public void setProductsQuantities(int[] productsQuantities) {
        this.productsQuantities = productsQuantities;
    }

    public void addProducts(int index, int quantity) {
        this.productsQuantities[index] += quantity;
    }

    public void totalProducts() {
        int sum = 0;
        for (int prod : productsQuantities) {
            sum += prod;
        }
        System.out.println(sum);
    }

    @Override
    public String toString() {
        return Arrays.toString(productsQuantities);
    }


    public static void main(String[] args) {
        int[] product = new int[5];
        for (int i = 0; i < product.length; i++) {
            product[i] = i;
        }

        Warehouse warehouse = new Warehouse(5);
        warehouse.setProductsQuantities(product);
        System.out.println(warehouse);
        warehouse.addProducts(1, 2);
        System.out.println(warehouse);
        warehouse.totalProducts();
    }
}
