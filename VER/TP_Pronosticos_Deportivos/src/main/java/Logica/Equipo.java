
package Logica;


public class Equipo {
   
    //atributos
    String nombre = "Elias";
    String descripcion = "codea rock";
    
    //constructor
    public Equipo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    
    //get (traer/ver  datos ) y set (coocar/establecer datos )

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    
    //metodos 
    
    
}
