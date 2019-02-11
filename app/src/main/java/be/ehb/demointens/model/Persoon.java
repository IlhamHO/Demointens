package be.ehb.demointens.model;

import java.io.Serializable;

public class Persoon implements Serializable {
    private String naam;
    private String tel;
    private String homepage;

    public Persoon() {
    }

    public Persoon(String naam, String tel, String homepage) {
        this.naam = naam;
        this.tel = tel;
        this.homepage = homepage;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getHomepage() {
        return homepage;
    }


    @Override
    public String toString() {
        return naam;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;

    }
}
