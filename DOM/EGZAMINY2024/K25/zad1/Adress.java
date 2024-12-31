package zad1;

import java.util.Objects;

public class Adress {
    private String street;
    private String city;
    private String zipcode;
    private String country;

    public Adress(String street, String city, String zipcode, String country) {
        if (city == null) this.city = "";
        else this.city = city;
        if (zipcode == null) this.zipcode = "";
        else this.zipcode = zipcode;
        if (country == null) this.country = "";
        else this.country = country;
        if(street == null) this.street = "";
        else this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street == null) this.street = "";
        else this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null) this.city = "";
        else this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        if (zipcode == null) this.zipcode = "";
        else this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null) this.country = "";
        else this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return Objects.equals(street, adress.street) && Objects.equals(city, adress.city) && Objects.equals(zipcode, adress.zipcode) && Objects.equals(country, adress.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, zipcode, country);
    }

    @Override
    public String toString() {
        return "street: " + street + ", city: " + city + ", zipcode: " + zipcode + ", country: " + country;
    }
}
