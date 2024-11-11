package computers;

public class Desktop extends Computer {
    private String caseType;

    public Desktop(String brand, String processor, String caseType) {
        super(brand, processor);
        this.caseType = caseType;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCase Type: " + this.caseType + "\n";
    }
}
