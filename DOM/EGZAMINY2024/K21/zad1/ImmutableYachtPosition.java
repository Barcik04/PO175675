package zad1;

public final class ImmutableYachtPosition {
    private final double latitude;
    private final double longitude;
    private final double altitude;

    public ImmutableYachtPosition(double latitude, double longitude, double altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    @Override
    public String toString() {
        return "latitude: " + latitude + ", longitude: " + longitude + ", altitude: " + altitude;
    }

    public ImmutableYachtPosition move(double latitudeChange, double longitudeChange, double altitudeChange) {
        return new ImmutableYachtPosition(latitudeChange + this.latitude, longitudeChange + this.longitude, altitudeChange + this.altitude);
    }
}
