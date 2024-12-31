package zad1;

import java.util.Objects;

public class UserAccount {
    private String username;
    private String email;
    private Adress adress;

    public UserAccount(String username, String email, Adress adress) {
        if (username == null) this.username = "";
        else this.username = username;
        if (email == null) this.email = "";
        else this.email = email;
        this.adress = adress != null ? adress : new Adress("", "", "", "");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username != null ? username : "";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email != null ? email : "";
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress != null ? adress : new Adress("", "", "", "");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccount that = (UserAccount) o;
        return Objects.equals(username, that.username) && Objects.equals(email, that.email) && Objects.equals(adress, that.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, adress);
    }

    @Override
    public String toString() {
        return "username: " + username + ", email: " + email + "\n" + "adress: "  + adress;
    }
}
