/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

/**
 *
 * @author usuario
 */
public class Zoologico {
    private  String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<Zona>();
    

    public Zoologico() {
   
    }
    
    public Zoologico(String nombre, String ubicacion){
        
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.zonas=new ArrayList<>();
    }
    
    public void agregarZonas(Zona zonas){
        this.zonas.add(zonas);
        
     
    }
    
    public int cantidadTotalAnimales(){
        int a=0;
        for (int i = 0; i<this.zonas.size();i++) {
           a += this.zonas.get(i).cantidadAnimales();
           
           
       
     
       }  
        return a;
    }  

    
   public ArrayList<Zona> getZona(){
       return this.zonas;
   }

    public String getNombre() {
        return nombre;
    }
      
    
  
    
    
}
