/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2;

/**
 *
 * @author jcgof
 */
public class Animales {

    public String nombreC;
    public String nombre;
    public String habitat;
    public String alimentacion;
    public String descripcion;
    public String geografia;
    public int vida;

    public Animales(String nombreC, String nombre, String habitat, String alimentacion, String descripcion, String geografia, int vida) {
        this.nombreC = nombreC;
        this.nombre = nombre;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.descripcion = descripcion;
        this.geografia = geografia;
        if (vida > 0) {
            this.vida = vida;
        }
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGeografia() {
        return geografia;
    }

    public void setGeografia(String geografia) {
        this.geografia = geografia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Animales :\n" + "Nombre Cientifico: " + nombreC + 
                "\n Nombre Comun: " + nombre + "\n Habitat: " 
                + habitat + "\n Alimentacion: " + alimentacion 
                + "\n Descripcion: " + descripcion + 
                "\n Geografia:" + geografia +
                "\n Vida=" + vida ;
    }
    
    
    
    
    
    
}
