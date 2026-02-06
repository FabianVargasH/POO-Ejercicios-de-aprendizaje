public class Herramienta {
    private String nombre;

    public Herramienta(String pNombre){
        nombre = pNombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void reparar(){
        System.out.println("Reparando con la herramienta: " + nombre);
    }
}
