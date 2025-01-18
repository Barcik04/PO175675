package Rekord1;

public record Person(String imie, int age) {
    public Person{
        if (age < 0) {
            throw new IllegalArgumentException("wiek musi byc nieujemny");
        }
    }

    public void przywitanie() {
        System.out.println("Witaj jestem " + imie);
    }
}
