/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author jcgof
 */
public class Main {
    static ArrayList<Animales> array = new ArrayList();
    public static void main(String args[]) {
        Animales animales = new Animales("Tigresa","Po","Helado", "Kung fu","Diez","test",1);
        array.add( new Animales("Tigresa","Po","Helado", "Kung fu","Diez","test",1));
        
        System.out.println(array);
     
    }
    
    
    
    
}
