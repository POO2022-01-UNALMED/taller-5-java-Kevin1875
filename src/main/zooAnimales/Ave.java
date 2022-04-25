package zooAnimales;


import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Ave extends Animal{
    private static ArrayList<Ave> listado=new ArrayList<Ave>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre,edad,habitat,genero);
        this.halcones = 0;
        this.aguilas = 0;
        this.colorPlumas = colorPlumas;
        this.listado.add(this);
    }

    public Ave() {
        this.listado.add(this);
        this.halcones = 0;
        this.aguilas = 0;
    }
    
    
    @Override
    public String movimiento(){
        return("volar");
    }    
    
    
    public static int cantidadAves(){
        return listado.size();
    }
    
    public static Ave crearHalcon(){
        halcones++;
        Ave ave = new Ave();
        ave.colorPlumas="cafe glorioso";
        ave.habitat="montanas";
        return ave;
    }
    
     public static Ave crearHalcon(String test, int numero, String genero){
        halcones++;
        Ave ave = new Ave();
        ave.colorPlumas="cafe glorioso";
        ave.habitat="montanas";
        return ave;
    }
    
    public static Ave crearAguila(){
        aguilas++;
        Ave ave = new Ave();
        ave.colorPlumas="blanco y amarillo";
        ave.habitat="montanas";
        return ave;
        
    }
    public static Ave crearAguila(String test, int numero, String genero){
        aguilas++;
        Ave ave = new Ave();
        ave.colorPlumas="blanco y amarillo";
        ave.habitat="montanas";
        return ave;
        
    }

    public String getColorPlumas() {
        return colorPlumas;
    }
    
    
     @Override
    public String getNombre() {
        return super.getNombre();
    }
}