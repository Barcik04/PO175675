package zad1;

import java.util.ArrayList;

public class TestWeatherForecast {
    public static void main(String[] args) {
        ArrayList<WeatherForecast> forecasts = new ArrayList<>();
        forecasts.add(new WeatherForecast(1, "01.01.2025", 2.0));
        forecasts.add(new WeatherForecast(2, "02.02.2025", 3.3));
        forecasts.add(new WeatherForecast(3, "03.01.2025", 3.3));

        forecasts.sort(new TemperatureComparator().thenComparing(new DateComparator()));
        for (WeatherForecast forecast : forecasts) {
            System.out.println(forecast);
        }
    }
}
