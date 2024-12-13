package zad4;

import java.util.Calendar;
import java.util.Date;

public class Smartphone implements Cloneable {
    private String brand;
    private String model;
    private Date productionDate;

    public Smartphone(String brand, String model, Date productionDate) {
        this.brand = brand;
        this.model = model;
        this.productionDate = productionDate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Smartphone cloned = (Smartphone) super.clone();
        cloned.productionDate = new Date(productionDate.getTime());
        return cloned;
    }

    @Override
    public String toString() {
        return "brand: " + brand + ", model: " + model + ", productionDate: " + productionDate;
    }


    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1815, Calendar.JANUARY, 18);
        Date originalDate = calendar.getTime();

        Smartphone s1 = new Smartphone("Samsung", "S6", originalDate);

        try {
            Smartphone s2 = (Smartphone) s1.clone();
            calendar.set(1845, Calendar.NOVEMBER, 21);
            s1.setProductionDate(calendar.getTime());

            System.out.println("s1 Phone = " + s1);
            System.out.println("s2 Phone = " + s2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }

}

