import java.util.Calendar;

public class Car {
    // Pola klasy
    private String brand;
    private String model;
    private int productionYear;

    // Konstruktor, który sprawdza poprawność wartości
    public Car(String brand, String model, int productionYear) {
        // Sprawdzamy, czy brand nie jest nullem ani pusty, jeśli tak - ustawiamy pusty napis
        if (brand == null || brand.trim().isEmpty()) {
            this.brand = "";
        } else {
            this.brand = brand;
        }

        // Sprawdzamy, czy model nie jest nullem ani pusty, jeśli tak - ustawiamy pusty napis
        if (model == null || model.trim().isEmpty()) {
            this.model = "";
        } else {
            this.model = model;
        }

        // Pobranie aktualnego roku
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        // Sprawdzamy, czy productionYear nie jest większy niż aktualny rok
        if (productionYear > currentYear) {
            this.productionYear = currentYear; // Jeśli rok produkcji jest większy, ustawiamy bieżący rok
        } else {
            this.productionYear = productionYear;
        }
    }

    // Gettery
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    // Settery
    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            this.brand = "";
        } else {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            this.model = "";
        } else {
            this.model = model;
        }
    }

    public void setProductionYear(int productionYear) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (productionYear > currentYear) {
            this.productionYear = currentYear;
        } else {
            this.productionYear = productionYear;
        }
    }

    // Metoda toString do wyświetlania informacji o samochodzie
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }

    public static void main(String[] args) {
        // Przykład użycia
        Car car1 = new Car("Toyota", "Corolla", 2025); // Rok większy niż bieżący
        System.out.println(car1); // Wynik: Car{brand='Toyota', model='Corolla', productionYear=2024}

        Car car2 = new Car(null, "Civic", 2010); // Brand jest nullem
        System.out.println(car2); // Wynik: Car{brand='', model='Civic', productionYear=2010}

        Car car3 = new Car("Honda", "", 2023); // Model jest pusty
        System.out.println(car3); // Wynik: Car{brand='Honda', model='', productionYear=2023}
    }
}
