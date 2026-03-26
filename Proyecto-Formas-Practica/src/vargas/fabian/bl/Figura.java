package vargas.fabian.bl;

public abstract class Figura implements Forma{
    protected String nombre;

    public Figura(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String toString(){
        return "Figura: " + nombre;
    }
}
