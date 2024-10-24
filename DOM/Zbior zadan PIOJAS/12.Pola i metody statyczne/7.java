public class Settings {
    private double version;
    private String language;

    public Settings(double version, String language) {
        this.version = version;
        this.language = language;
    }

    public void setVersion(double version) {
        this.version = version;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public static Settings defaultSettings() {
        return new Settings(1.0, "Polish");
    }

    @Override
    public String toString() {
        return "Version: " + version + ", Language: " + language;
    }

    public static void main(String[] args) {
        Settings settings = defaultSettings();
        System.out.println(settings);

        settings.setLanguage("English");
        settings.setVersion(1.1);
        System.out.println(settings);

        settings = Settings.defaultSettings();
        System.out.println(settings);

    }
}
