package classroom;

public class Persona {

    int cedula;
    String nombre;
    int totalPersonas;

    
    Persona(){
    	this.cedula = 0;
    	this.nombre = "Sin nombre";
    	totalPersonas++;
    }
    
    Persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, int cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(int cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.cedula = 1;
        this.nombre = "";
        totalPersonas++;
    }
    
    int getCedula() {

        return cedula;
    }

    void setCedula(int cedula) {
        this.cedula = cedula;
    }
    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
