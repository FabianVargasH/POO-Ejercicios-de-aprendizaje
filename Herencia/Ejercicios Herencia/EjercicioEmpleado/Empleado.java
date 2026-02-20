public class Empleado{
    protected String nombre;
    protected String apellidos;
    protected String puesto;
    protected int HORAS_TRABAJADAS_DIA = 8;
    protected double PAGO_HORA = 5000;

    public Empleado(String nombre, String apellidos, String puesto){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
    }

    public void trabajar(){
        System.out.println(nombre + " " + apellidos + " esta trabajando como " + puesto);
    }
    public double calcularSalario(){
        int diasMes = 4*5;
        double salario = diasMes * HORAS_TRABAJADAS_DIA * PAGO_HORA;
        return salario;
    }
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public int getHORAS_TRABAJADAS_DIA() {
        return HORAS_TRABAJADAS_DIA;
    }
    
    public void setHORAS_TRABAJADAS_DIA(int horas) {
        this.HORAS_TRABAJADAS_DIA = horas;
    }
    
    public double getPAGO_HORA() {
        return PAGO_HORA;
    }
    
    public void setPAGO_HORA(double pago) {
        this.PAGO_HORA = pago;
    }

}