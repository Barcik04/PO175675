package zad19;

public class Engine implements Cloneable {
    private int moc;
    private String type;
    private String serialNumber;

    public Engine(int moc, String type, String serialNumber) {
        this.moc = moc;
        this.type = type;
        this.serialNumber = serialNumber;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "moc: " + moc + ", type: " + type + ", serialNumber: " + serialNumber;
    }
}
