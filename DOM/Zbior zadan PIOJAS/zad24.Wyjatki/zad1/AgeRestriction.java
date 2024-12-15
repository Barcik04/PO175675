package zad1;

public class AgeRestriction {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("You can only buy this product if youre 18 or older");
        }
        System.out.println("zakupiono produkt");
    }

    public static void main(String[] args) {
        int[] ages = {12, 18, 19, 33, 1};

        for (int i : ages) {
            try {
                checkAge(i);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
