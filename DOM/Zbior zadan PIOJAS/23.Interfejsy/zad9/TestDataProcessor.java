package zad9;

public class TestDataProcessor {
    public static void main(String[] args) {
        TextProcessor tp = new TextProcessor();

        String processedText = tp.processData("Bolek");
        System.out.println(processedText);


        boolean validationText = tp.isValid("Bolek");
        System.out.println(validationText);

        NumberProcessor np = new NumberProcessor();

        String processedNumber = np.processData("Bolek");
        System.out.println(processedNumber);


        boolean validNumber = np.isValid("2");
        System.out.println(validNumber);
    }
}
