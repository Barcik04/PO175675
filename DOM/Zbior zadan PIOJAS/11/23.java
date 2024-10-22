import java.util.ArrayList;

public class TemperatureHistory {
    private ArrayList<Double> temperatures;

    public TemperatureHistory() {
    }

    public ArrayList<Double> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(ArrayList<Double> temperatures) {
        this.temperatures = new ArrayList<>(temperatures);
    }

    public void addTemperature(double temperature) {
        this.temperatures.add(temperature);
    }

    public void removeTemperature(int indexTemp) {
        this.temperatures.remove(indexTemp);
    }

    public double calculateAverageTemperature() {
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        return sum / temperatures.size();
    }

    public static void main(String[] args) {
        ArrayList<Double> temperatures1 = new ArrayList<>();
        temperatures1.add(11.0);
        temperatures1.add(20.0);
        temperatures1.add(30.0);

        TemperatureHistory history1 = new TemperatureHistory();
        history1.setTemperatures(temperatures1);
        history1.addTemperature(50.0);
        history1.removeTemperature(0);
        System.out.println(history1.getTemperatures());

        double avg1 = history1.calculateAverageTemperature();
        System.out.println(avg1);
    }
}
