package zad1;

public class TestUserAccount {
    public static void main(String[] args) {
        Adress ad1 = new Adress("Baltycka", "Olsztyn", "10-802", "Poland");
        UserAccount user1 = new UserAccount("Igor", "Igor@gmail.com", ad1);
        UserAccount user2 = new UserAccount("Mike", "Mike@gmail.com", ad1);
        UserAccount user3 = new UserAccount("Igor", "Igor@gmail.com", ad1);

        System.out.println(ad1);
        System.out.println("\n" + user1);


        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));

        System.out.println(user1.hashCode());
    }
}
