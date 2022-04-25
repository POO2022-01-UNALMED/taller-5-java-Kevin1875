/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooAnimales;
import gestion.Zoologico;
import gestion.Zona;

/**
 *
 * @author usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      	       
              Animal a1 = new Anfibio();
		Animal a2 = new Ave();
		Animal a3 = new Mamifero();
		Animal a4 = new Pez();
		Animal a5 = new Reptil();
                
                System.out.println(a5.movimiento());
    }
}
