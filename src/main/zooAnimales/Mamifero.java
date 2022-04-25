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
public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado=new ArrayList<Mamifero>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre,edad,habitat, genero);
        this.caballos = caballos;
        this.leones = leones;
        this.pelaje = pelaje;
        this.patas = patas;
        this.listado.add(this);
    }

    public Mamifero() {
        Mamifero.listado.add(this);
    }
    
    public static int cantidadMamiferos(){
        return listado.size();
    }
    
    public static Mamifero crearCaballo(){
        caballos++;
        Mamifero mamifero = new Mamifero();
        mamifero.pelaje=true;
        mamifero.patas=4;
        mamifero.habitat="pradera";
        return mamifero;
        
    }
    public static Mamifero crearCaballo(String test, int numero, String genero){
        caballos++;
        Mamifero mamifero = new Mamifero();
        mamifero.pelaje=true;
        mamifero.patas=4;
        mamifero.habitat="pradera";
        return mamifero;
        
    }
    
    
    
    public static Mamifero crearLeon(){
        leones++;
        Mamifero mamifero = new Mamifero();
        mamifero.pelaje=true;
        mamifero.patas=4;
        mamifero.habitat="selva";
        return mamifero;
      
    }
    public static Mamifero crearLeon(String test, int numero, String genero){
        leones++;
        Mamifero mamifero = new Mamifero();
        mamifero.pelaje=true;
        mamifero.patas=4;
        mamifero.habitat="selva";
        return mamifero;
    }

    public static int getCaballos() {
        return caballos;
    }

    public static int getLeones() {
        return leones;
        
    
        
    
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public int getPatas() {
        return patas;
    }
    
    @Override
    public String getNombre() {
        return super.getNombre();
    }
}
