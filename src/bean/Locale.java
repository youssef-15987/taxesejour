/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author user
 */
public class Locale {
    private long id;
    private String reference;
    private String adresse;
    private String rue;

    public Locale() {
    }

    public Locale(long id, String reference, String adresse, String rue) {
        this.id = id;
        this.reference = reference;
        this.adresse = adresse;
        this.rue = rue;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    @Override
    public String toString() {
        return "Locale{" + "id=" + id + ", reference=" + reference + ", adresse=" + adresse + ", rue=" + rue + '}';
    }
    
}
