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
public class Reptil extends Animal {
    private static ArrayList<Reptil> listado=new ArrayList<Reptil>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;
    

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas,int largoCola ) {
        super(nombre,edad,habitat,genero);
        this.iguanas = 0;
        this.serpientes = 0;
        this.colorEscamas = colorEscamas;
        this.largoCola=largoCola;
        this.listado.add(this);
    }

    public Reptil() {
        this.listado.add(this);
    }
    
    
    @Override
    public String movimiento(){
        return("reptar");
    }    
    
    
    public static int cantidadReptiles(){
        return Reptil.listado.size();
    }
    
    public static Reptil crearIguana(){
        iguanas++;
        Reptil reptil = new Reptil();
        reptil.colorEscamas="verde";
        reptil.largoCola=3;
        reptil.habitat="humedal";
        return reptil;
    }
    public static Reptil crearIguana(String test, int numero, String genero){
        iguanas++;
        Reptil reptil = new Reptil();
        reptil.colorEscamas="verde";
        reptil.largoCola=3;
        reptil.habitat="humedal";
        return reptil;
    }
    public static Reptil crearSerpiente(){
        serpientes++;
        Reptil reptil = new Reptil();
        reptil.colorEscamas="blanco";
        reptil.largoCola=1;
        reptil.habitat="jungla";
        return reptil;
        
    }
    
    public static Reptil crearSerpiente(String test, int numero, String genero){
        serpientes++;
        Reptil reptil = new Reptil();
        reptil.colorEscamas="blanco";
        reptil.largoCola=1;
        reptil.habitat="jungla";
        return reptil;
        
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }
    
    
     @Override
    public String getNombre() {
        return super.getNombre();
    }
}

