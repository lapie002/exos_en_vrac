/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exos_en_vrac;

import java.util.Scanner;

/**
 *
 * @author lapie
 */
public class Exercice4 {
    
    public static void launch()
    {
        
        boolean flag;
        int compteur = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("entre l'etat de flag : ");
        /* 
            flag = true
            flag = false 
        */
        flag = sc.nextBoolean();
        
        if(flag == true)
        {
            compteur--;
             
            //compteur = compteur - 1; 
        }
        if(flag == false)
        {
            compteur++;
             
            //compteur = compteur + 1; 
        }
        
        /* expression ternaire */
        // x = 10 
        // y = 5
        
        // a = 10
        // b = 20
        //int max = (x < y) ? a : b;
        
        flag = (flag == true) ? true : false; 
        
        
        if(flag == true)
        {
            compteur++;
        }
        if(flag == false)
        {
            compteur--;
        }
        
        System.out.println("compteur vaut = " + compteur);
    }
}
