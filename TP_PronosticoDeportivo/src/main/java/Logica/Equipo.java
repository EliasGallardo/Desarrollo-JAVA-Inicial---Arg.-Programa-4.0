package Logica;

public class Equipo {
    
    //atributos
   private String nombre;
   private String descirpcion;

    //consructores
    public Equipo(String nombre, String descirpcion) {
        this.nombre = nombre;
        this.descirpcion = descirpcion;
    }

    // get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescirpcion() {
        return descirpcion;
    }

    public void setDescirpcion(String descirpcion) {
        this.descirpcion = descirpcion;
    }
    
    
}
