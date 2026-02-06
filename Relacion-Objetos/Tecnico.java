public class Tecnico {
    private String nombre;

    public Tecnico(String pNombre){
        nombre = pNombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void utilizarHerramienta(Herramienta herramientaTemp){
        System.out.println(nombre + " está reparando el equipo");
        herramientaTemp.reparar();
    }
    
}
