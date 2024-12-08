package zad21;

public class Company extends Client{
    private int numberOfEmployees;

    public Company(String lastName, double balance, int numberOfEmployees) {
        super(lastName, balance);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public int compareTo(Client other) {
        int result = super.compareTo(other);
        if (result == 0) {
            return Integer.compare(this.numberOfEmployees, ((Company) other).numberOfEmployees);
        }
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + " numberOfEmployees: " + numberOfEmployees;
    }
}
