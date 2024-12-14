package zad9;

public class TextProcessor implements DataProcessor {
    @Override
    public String processData(String data) {
        StringBuilder builder = new StringBuilder();
        if (data == null) {
            return "null";
        }
        for (int i = data.length() - 1; i >= 0; i--) {
            builder.append(data.charAt(i));
        }

        return builder.toString();
    }

    @Override
    public boolean isValid(String data) {
        return data.isEmpty();
    }
}
