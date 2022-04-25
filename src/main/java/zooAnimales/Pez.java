/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooAnimales;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Pez extends Animal{
private static ArrayList<Pez> listado=new ArrayList<Pez>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas,int cantidadAletas ) {
        super(nombre,edad,habitat,genero);
        this.salmones = 0;
        this.bacalaos = 0;
        this.colorEscamas = colorEscamas;
        this.cantidadAletas=cantidadAletas;
        this.listado.add(this);
    }

    public Pez() {
        this.listado.add(this);
    }
    
    
    @Override
    public String movimiento(){
        return("nadar");
    }    
    
    
    public static int cantidadPeces(){
        return listado.size();
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }
    
    
    
    public static Pez crearSalmon(){
        salmones++;
        Pez pez = new Pez();
        pez.colorEscamas="rojo";
        pez.cantidadAletas=6;
        pez.habitat="oceano";
        return pez;
    }
    
    public static Pez crearSalmon(String test, int numero, String genero){
        salmones++;
        Pez pez = new Pez();
        pez.colorEscamas="rojo";
        pez.cantidadAletas=6;
        pez.habitat="oceano";
        return pez;
    }
    
    public static Pez crearBacalao(){
        bacalaos++;
        Pez pez = new Pez();
        pez.colorEscamas="gris";
        pez.cantidadAletas=6;
        pez.habitat="oceano";
        return pez;
        
    }
    
    public static Pez crearBacalao(String test, int numero, String genero){
        bacalaos++;
        Pez pez = new Pez();
        pez.colorEscamas="gris";
        pez.cantidadAletas=6;
        pez.habitat="oceano";
        return pez;
        
    }
     @Override
    public String getNombre() {
        return super.getNombre();
    }
}