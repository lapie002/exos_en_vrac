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
public class Exercice5 {
    
    
    public static void launch()
    {
        int compteur = 10;
        boolean limite = false;
        
        // tant que limite est faux on rentre dans la boucle
        while(!limite){
            
            System.out.println(compteur);
            compteur++;
            
            //la limite est atteinte quand le compteur atteint 101
            // d ou la condition : compteur>100
            //on passe limite a true
            if(compteur>100)
            {
                limite = true;
            }
        }
    }
}
