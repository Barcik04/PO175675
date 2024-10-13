public class Main {
    public static void main(String[] args) {
        String word = "avaJ tsej anjaf";
        StringBuilder func = reverseEachWord(word);
        System.out.println(func);
    }

    public static StringBuilder reverseEachWord(String word) {
        StringBuilder newWord = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                temp.append(word.charAt(i));
            } else {
                temp.reverse();
                temp.append(' ');
                newWord.append(temp);
                temp.delete(0, temp.length());
            }
        }
        temp.reverse();
        newWord.append(temp);

        return newWord;
    }
}
