/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;
import zooAnimales.Mamifero;

/**
 *
 * @author usuario
 */
public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales=new ArrayList<Animal>();

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = new ArrayList<>();
    }

    public Zona() {
        
    }
 
    public void agregarAnimales(Animal animal){
        if(animales != null){
            animales.add(animal);
        }
        //return null;
    }
    
    public int cantidadAnimales(){
        return animales.size();
    }

    public String getNombre() {
        return nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

   
}
