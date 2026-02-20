public class Animal{
    protected String nombre;
    protected byte edad;

    public Animal(String pNombre, byte pEdad){
        nombre = pNombre;
        edad = pEdad;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String pNombre){
        nombre = pNombre;
    }

    public byte getEdad(){
        return edad;
    }
    public void setEdad(byte pEdad){
        edad = pEdad;
    }

    public String toString(){
        return "Nombre: " + nombre+
        "Edad: " + edad;
    }
}