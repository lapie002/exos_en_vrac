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


public class Exercice3 {
    
    public static void launch(){
    
        Scanner sc = new Scanner(System.in);
        
        boolean flag;
        
        
        System.out.println("entre l'etat de l'interupteur : ");
        /* 
            allumer = true
            eteint = false 
        */
        flag = sc.nextBoolean();
        
        if(flag == true)
        {
            
            System.out.println("l'interupteur est allumé ");
            
        }
        else{
            
            System.out.println("l'interupteur est eteint ");
            
        }
        
        
        
        
    
    }
    
}
