package classroom;

public class Grupo {
	static Persona[] estudiantes;
    static Persona profesor;
    Asignatura asignatura;
    int codigo;
    String horario;
    
    Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        Grupo.estudiantes = estudiantes;
        Grupo.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        Persona[] personas = new Persona[cantidadEstudiantes];
        
        Grupo.profesor = profesor;
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
        for (int i = 0; i < Grupo.estudiantes.length; i++) {
            if (Grupo.estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                Grupo.estudiantes[i]=estudianteNuevo;
                break;
            }
        }
    }

    public static void cambiarEstudiante(int indice, Persona estudiante) {
         estudiantes[indice]=estudiante;
    }

}
