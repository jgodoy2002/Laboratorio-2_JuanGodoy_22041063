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
    
     static ArrayList<Animales> animales;
    
    public static void main(String args[]){
        Animales am = new Animales("TigreDeKungFu","Po","Templado","Bamboo","Es un panda que hace kung fu GUAU","China",10);
        animales.add(am);
        System.out.println(animales);
    }
}
