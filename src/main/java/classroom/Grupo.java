package classroom;

public class Grupo {
    static Persona[] estudiantes;
    Persona profesor;
    Asignatura asignatura;
    int codigo;
    String horario;
    
    Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        Persona[] personas = new Persona[cantidadEstudiantes];
        
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura) {

        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
    }

    public static void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                estudiantes[i]=estudianteNuevo;
                break;
            }
        }
    }

    public static void cambiarEstudiante(int indice, Persona estudiante) {
         estudiantes[indice]=estudiante;
         if (estudiantes[indice].getCedula() == estudiante.getCedula()){
             estudiantes[indice].setCedula(0);
         }
    }

}
