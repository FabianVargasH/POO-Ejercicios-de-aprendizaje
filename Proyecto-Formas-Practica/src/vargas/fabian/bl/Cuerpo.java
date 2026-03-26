package vargas.fabian.bl;

public abstract class Cuerpo implements Forma{
    protected String nombre;
    public Cuerpo(String nombre) {
        this.nombre = nombre;
    }
    public abstract double calcularVolumen();
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Cuerpo: " + nombre;
    }
}
