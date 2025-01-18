package Delegaci1;

public class GolabPocztowy implements Powiadomienie {
    @Override
    public void wyslij(String powiadomienie) {
        System.out.println("Wiadomosc od golebia");
        System.out.println(powiadomienie);
    }
}
