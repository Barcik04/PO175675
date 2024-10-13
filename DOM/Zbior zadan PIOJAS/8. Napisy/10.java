public class Main {
    public static void main(String[] args) {
        String word = "biizaiiizniiciaajaaummzjjjzziiim";
        StringBuilder func = wordWithOutRepeat(word);
        System.out.println(func);

    }

    public static StringBuilder wordWithOutRepeat(String word) {
        StringBuilder builderWord = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            boolean isSame = false;
            for (int j = 0; j < builderWord.length(); j++) {
                if (builderWord.charAt(j) == character) {
                    isSame = true;
                    break;
                }
            }
            
            if (!isSame) {
                    builderWord.append(character);
            }
        }


        return builderWord;
    }
}
