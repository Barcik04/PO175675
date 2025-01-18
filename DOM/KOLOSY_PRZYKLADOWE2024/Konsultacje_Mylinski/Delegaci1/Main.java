package Delegaci1;

public class Main {
    public static void main(String[] args) {
        Uzytkownik u1 = new Uzytkownik(new Email());
        u1.powiadomOModernizacji("modernizacja w toku...");

        u1.setPowiadomienie(new GolabPocztowy());
        u1.powiadomOModernizacji("modernizacja w toku...");
    }
}
