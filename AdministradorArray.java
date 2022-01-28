/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2;

import java.util.ArrayList;

/**
 *
 * @author jcgof
 */
public class AdministradorArray {

    ArrayList<Animales> array = new ArrayList();

    public void crear(Animales a) {
        String nombreC;
        String nombre;
        String habitat;
        String alimentacion;
        String descripcion;
        String geografia;
        int vida;
        for (int i = 0; i < array.size(); i++) {

        }
    }

    public boolean eliminar(Animales a) {
        boolean encontrado = false;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNombreC().equals(a.getNombreC())) {
                encontrado = true;
                array.remove(i);
            }
        }
        return encontrado;
    }

    public boolean modificarNombreC(Animales a) {
        boolean encontrado = false;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNombreC().equals(a.getNombreC())) {
                encontrado = true;
                array.get(i).setNombreC(a.getNombre());
            }
        }
        return encontrado;
    }

    public void modificarunAtributo(Animales a) {

    }

    public void modificarTodo(Animales a) {

    }

    public void listarPosicion(int pos) {
        System.out.println(array.get(pos).toString());
    }

    public void listaCompleta() {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).toString());
        }

    }

    public void ListanombreCientifico(Animales a) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNombreC().equals(a.getNombreC())) {
                System.out.println(array.toString());
            }
        }
    }

    public void cadenaAlimenticia(int posA, int posB) {
        
       Animales a = array.get(posA);
       if(a.getAlimentacion().contains("Carnivoro")){
           array.get(posA).setVida(1+a.getVida());
           array.remove(posB);
       }
    }

}
