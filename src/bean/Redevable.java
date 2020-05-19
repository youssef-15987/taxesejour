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
public class Redevable {
   private Long id;
   private String raisonSociale;
   private String identifiantFiscale;

    public Redevable() {
    }

    public Redevable(Long id, String raisonSociale, String identifiantFiscale) {
        this.id = id;
        this.raisonSociale = raisonSociale;
        this.identifiantFiscale = identifiantFiscale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getIdentifiantFiscale() {
        return identifiantFiscale;
    }

    public void setIdentifiantFiscale(String identifiantFiscale) {
        this.identifiantFiscale = identifiantFiscale;
    }

    @Override
    public String toString() {
        return "Redevable{" + "id=" + id + ", raisonSociale=" + raisonSociale + ", identifiantFiscale=" + identifiantFiscale + '}';
    }
   
}
