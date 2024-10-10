import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String word1 = "Jurek Ogorek";
        String toLowerCase = word1.toLowerCase();
        ArrayList<Character> listOfChars = new ArrayList<>();

        for (int i = 0; i < toLowerCase.length(); i++) {
            if (checkIfMultiAppear(listOfChars, toLowerCase.charAt(i)) && (toLowerCase.charAt(i) != ' ')) {
                int result = countFrequency(toLowerCase, toLowerCase.charAt(i));
                System.out.println("Letter " + toLowerCase.charAt(i) + " counts " + result + " times.");
            }
        }
    }

    public static int countFrequency(String word, char a) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == a) {
                count++;
            }
        }

        return count;
    }

    public static boolean checkIfMultiAppear(ArrayList<Character> listOfChars, char a) {
        for (int i = 0; i < listOfChars.size(); i++) {
            if (listOfChars.get(i) == a) {
                return false;
            }
        }
        if (a != ' ') {
            listOfChars.add(a);
        }
        return true;
    }
}
