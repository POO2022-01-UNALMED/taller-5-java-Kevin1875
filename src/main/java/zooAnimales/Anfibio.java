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
public class Anfibio extends Animal {
private static ArrayList<Anfibio> listado=new ArrayList<Anfibio>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel,boolean venenoso ) {
        super(nombre,edad,habitat,genero);
        this.ranas = 0;
        this.salamandras = 0;
        this.colorPiel = colorPiel;
        this.venenoso=venenoso;
        this.listado.add(this);
    }

    public Anfibio() {
        this.listado.add(this);
        
    }
   
    
    
    @Override
    public String movimiento(){
        return("saltar");
    }    
    
    
    public static int cantidadAnfibios(){
        return listado.size();
    }
    
    public static Anfibio crearRana(){
        ranas++;
        Anfibio anfibio = new Anfibio();
        anfibio.colorPiel="rojo";
        anfibio.venenoso=true;
        anfibio.habitat="selva";
        return anfibio;
    }
    public static Anfibio crearRana(String test, int numero, String genero){
        ranas++;
        Anfibio anfibio = new Anfibio();
        anfibio.colorPiel="rojo";
        anfibio.venenoso=true;
        anfibio.habitat="selva";
        return anfibio;
    }
    
    public static Anfibio crearSalamandra(){
        salamandras++;
        Anfibio anfibio = new Anfibio();
        anfibio.colorPiel="negro y amarillo";
        anfibio.venenoso=false;
        anfibio.habitat="selva";
        return anfibio;
        
    }
    
    public static Anfibio crearSalamandra(String test, int numero, String genero){
        salamandras++;
        Anfibio anfibio = new Anfibio();
        anfibio.colorPiel="negro y amarillo";
        anfibio.venenoso=false;
        anfibio.habitat="selva";
        return anfibio;
        
    }
     @Override
    public String getNombre() {
        return super.getNombre();
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }
    
    
}