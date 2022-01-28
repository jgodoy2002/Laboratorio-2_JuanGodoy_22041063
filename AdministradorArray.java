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
    
    public boolean eliminar(Animales a)
    {
        
    }
    
    public boolean modificarNombreC(Animales a){
        boolean encontrado=false;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getNombreC().equals(a.getNombreC()))
            {
                encontrado=true;
                array.get(i).setNombreC(a.getNombre());
            }
        }
        return encontrado;
    }
    
    public void modificarunAtributo(Animales a){
        
    }
    
    public void modificarTodo(Animales a){
        
    }
    
    public void listarPosicion(int pos){
        
    }
    
    public void listaCompleta(){
        
    }
    
    public void ListanombreCientifico(){
        
    }
    
}
