public class Mascota {
    private String nombre;
    private String especie;
    private String edad;

    public Mascota(String pNombre, String pEspecie, String pEdad){
        nombre = pNombre;
        especie = pEspecie;
        edad = pEdad;
    }

    //Setter y getters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String pNombre){
        nombre = pNombre;
    }

    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String pEspecie){
        especie = pEspecie;
    }

    public String getEdad(){
        return edad;
    }
    public void setEdad(String pEdad){
        edad = pEdad;
    }
}
