/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooAnimales;
import gestion.Zona;
import gestion.Zoologico;
/**
 *
 * @author usuario
 */
public class Animal {
    
    public static int totalAnimales=0;
    private String nombre;
    private int edad;
    protected String habitat;
    private String genero;
    private Zona[ ] zona;

    public Animal() {
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        
        totalAnimales++;
    }
    
    public Animal(String nombre, int edad, String genero) {
        
        this.nombre = nombre;
        this.edad = edad;
 
        this.genero = genero;
        
        totalAnimales++;
    }
    
    public String movimiento(){
        return("desplazarse");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getGenero() {
        return genero;
    }
    
    
   public static String totalPorTipo(){
       return"Mamiferos: "+Mamifero.cantidadMamiferos() + "\n" +"Aves: " + Ave.cantidadAves() + "\n" + 
               "Reptiles: " + Reptil.cantidadReptiles() + "\n" + "Peces: " + Pez.cantidadPeces()+ "\n"
               + "Anfibios: " + Anfibio.cantidadAnfibios();
       
   }

    @Override
    public String toString() {
        if (zona!=null && Zona.getZoo()!=null){
        return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + zona +", en el" + Zona.getZoo();
        }
        else
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
    }
   
   
    
    
}
