package zad2;

public record BusRoute(String routeNumber, String startLocation, String endLocation) {
    public BusRoute {
        if (routeNumber == null) {
            throw new NullPointerException("routeNumber");
        }
    }

    public boolean isLongRoute() {
        return routeNumber.length() > 4;
    }

    public void printDetails() {
        System.out.println("Route number: " + routeNumber + " start: " + startLocation + " end: " + endLocation);
    }
}
