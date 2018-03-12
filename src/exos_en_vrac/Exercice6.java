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
public class Exercice6 {

    
    public static void launch()
    {
        // tableauDeBoolean est un tableau contenant que des variable de type boolean
        boolean[] tableauDeBooleanVrai = new boolean[10];
        
        boolean[] tableauDeBooleanFaux = new boolean[10];
        
        boolean[] tableauDeBooleanVraiEtFaux = new boolean[10];
        
        // c est pareil que ca (autre maniere de declarer un tableau)
        // boolean tableauDeBoolean[] = new boolean[10];
        
        // un compteur pour la limite de la taille du tableau
        int compteurVrai = 0;
        int compteurFaux = 0;
        int compteurVraiEtFaux = 0;
        
        //une boucle initialisation de chaque entrée du tableau a vrai
        while(compteurVrai<10){
            tableauDeBooleanVrai[compteurVrai] = true;
            compteurVrai++;
        }
        
        //une boucle initialisation de chaque entrée du tableau a faux
        while(compteurFaux<10){
            tableauDeBooleanFaux[compteurFaux] = false;
            compteurFaux++;
        }
        
       //une boucle initialisation de chaque entrée du tableau qui contient des boolean vrai et faux
        while(compteurVraiEtFaux<10){
            
            // si compteurVraiEtFaux est un nombre pair genre 2, 4, 6, 8.
            // on affecte au tableau la valeur vrai
            if(compteurVraiEtFaux%2 == 0){
                tableauDeBooleanVraiEtFaux[compteurVraiEtFaux] = true;
            }
            //sinon on affecte au tableau la valeur faux
            else{
                tableauDeBooleanVraiEtFaux[compteurVraiEtFaux] = false;
            }
            
            compteurVraiEtFaux++;
        }
        

        
        System.out.println("--------Premier tableau-----------------");
        System.out.print(afficherTableau(tableauDeBooleanVrai));
        System.out.println("");
        System.out.println("-----------Second tableau--------------");
        System.out.print(afficherTableau(tableauDeBooleanFaux));
        System.out.println("");
        System.out.println("-----------Troisieme tableau--------------");
        System.out.print(afficherTableau(tableauDeBooleanVraiEtFaux));
        System.out.println("");
        
    }
    
    
    // methode utile pour afficher le contenu d un tableau passé en parametre
    public static String afficherTableau(boolean untableau[])
    {
        String chaine = "";

        for(int i = 0; i<untableau.length;i++){

            chaine = chaine + "tableau[" + i + "] => " + untableau[i] + "; ";
        }
        return chaine;
    }
    
    
}
