package zad2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<WeatherForecast> forecasts = new ArrayList<>();
        forecasts.add(new WeatherForecast(1, "01-02-2025", 8.2));
        forecasts.add(new WeatherForecast(2, "02-03-2025", 8.2));
        forecasts.add(new WeatherForecast(3, "03-04-2025", 9.2));
        forecasts.add(new WeatherForecast(4, "04-05-2025", 1.2));
        forecasts.add(new WeatherForecast(5, "05-06-2025", 0.2));

        forecasts.sort(new TemperatureComparator().thenComparing(new DateComparator()));
        for (WeatherForecast forecast : forecasts) {
            System.out.println(forecast);
        }
    }
}
