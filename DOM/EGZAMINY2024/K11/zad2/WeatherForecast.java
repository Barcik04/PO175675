package zad2;

public class WeatherForecast {
    private int id;
    private String date;
    private double temperature;

    public WeatherForecast(int id, String date, double temperature) {
        this.id = id;
        this.date = date;
        this.temperature = temperature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Date: " + date + ", Temperature: " + temperature;
    }
}
