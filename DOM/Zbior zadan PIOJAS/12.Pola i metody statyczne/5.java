public class Configuration {
    static double applicationVersion = 1.0;

    public static void setApplicationVersion(double version) {
        applicationVersion = version;
    }

    public static double getApplicationVersion() {
        return applicationVersion;
    }

    public static void main(String[] args) {
        Configuration.setApplicationVersion(1.2);
        System.out.println(Configuration.getApplicationVersion());
    }
}
