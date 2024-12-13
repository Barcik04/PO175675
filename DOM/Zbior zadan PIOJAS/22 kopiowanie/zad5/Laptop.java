package zad5;

import java.util.Calendar;
import java.util.Date;

public class Laptop implements Cloneable {
    private String brand;
    private String model;
    private Date purchaseDate;

    public Laptop(String brand, String model, Date purchaseDate) {
        this.brand = brand;
        this.model = model;
        this.purchaseDate = purchaseDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Laptop cloned = (Laptop) super.clone();
        cloned.purchaseDate = new Date(purchaseDate.getTime());
        return cloned;
    }

    @Override
    public String toString() {
        return "brand: " + brand + ", model: " + model + ", purchaseDate: " + purchaseDate;
    }


    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1876, Calendar.OCTOBER, 29);
        Date originalDate = calendar.getTime();

        Laptop l1 = new Laptop("Xiaiomi", "KL10", originalDate);

        try {
            Laptop l2 = (Laptop) l1.clone();
            calendar.set(1999, Calendar.JULY, 12);
            l1.setPurchaseDate(calendar.getTime());

            System.out.println("l1: " + l1);
            System.out.println("l2: " + l2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }
}
