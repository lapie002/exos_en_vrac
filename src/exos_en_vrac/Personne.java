/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exos_en_vrac;

/**
 *
 * @author lapie
 */
public class Personne {
    
    /*attributs*/
    
    int id;
    String nom;
    String prenom;
    int age;
    String adresse;
    boolean matrimonial; 
    Pays paysdenaissance;
    
    
    /* constructeur */
    public Personne(int id, String nom, String prenom, int age, String adresse, boolean matrimonial, Pays paysdenaissance) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
        this.matrimonial = matrimonial;
        this.paysdenaissance = paysdenaissance;
    }
    
    
    
    
    
    
    /*setters*/

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setMatrimonial(boolean matrimonial) {
        this.matrimonial = matrimonial;
    }

    public void setPaysdenaissance(Pays paysdenaissance) {
        this.paysdenaissance = paysdenaissance;
    }
    
    
    
    /*getters*/
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getAdresse() {
        return adresse;
    }

    public boolean isMatrimonial() {
        return matrimonial;
    }

    public Pays getPaysdenaissance() {
        return paysdenaissance;
    }
    
    
    
    public String toString()
    {
        String str = "Je suis " + nom + " " + prenom + " et j ai " + age + " ans.";
        return str;
    }
 
    
}
