public class EmpleadoRH extends Empleado {
        // Constructor
    public EmpleadoRH(String nombre, String apellidos, String puesto) {
        super(nombre, apellidos, puesto);
    }
    
    public void contratarEmpleado(String nombreCandidato, String puestoCandidato) {
        System.out.println(nombre + " " + apellidos + " (RRHH) está contratando a " + 
                          nombreCandidato + " para el puesto de " + puestoCandidato);
    }
    
    public void trabajar() {
        System.out.println(nombre + " " + apellidos + " está trabajando en el departamento de RRHH");
    }
    
}
