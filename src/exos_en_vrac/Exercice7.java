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
public class Exercice7 {
    
    public static void launch(){
            
        String bonjour = new String("Bonjour");
        String bonsoir = new String("Bonsoir");
        
        Scanner sc = new Scanner(System.in);
        
        boolean morning;
        
        
        System.out.println("c est le matin true/false : ");
        /* 
            matin = true
            matin = false (donc c est le soir)
        */
        morning = sc.nextBoolean();
        
        if(morning == true)
        {
            
            System.out.println(bonjour + " vous");
            
        }
        else{
            
            System.out.println(bonsoir + " vous");
            
        }
    }
}
