public class Persona {
    private String nombre;
    private String apellidos;
    private Pasaporte pasaporte = null; 
    private Mascota mascota = null;

    public Persona(String pNombre, String pApellidos){
        nombre = pNombre;
        apellidos = pApellidos;
        pasaporte = null;
    }
    public void sacarPasaporte(String pNumero, String pNacionalidad, String pFechaEmision, String pFechaVencimiento, boolean pEstaVigente){
        pasaporte = new Pasaporte(pNumero, pNacionalidad, pFechaEmision, pFechaVencimiento, pEstaVigente);
        if(pEstaVigente){
            System.out.println(nombre + " " + apellidos + " obtuvo un pasaporte");
        }else{
            System.out.println(nombre + " " + apellidos + " obtuvo un pasaporte VENCIDO");
        }  
    }

    public void tomarVuelo(String pPais){
        if(pasaporte != null && pasaporte.isEstaVigente()){
            System.out.println(nombre + " " + apellidos + " toma un vuelo a " + pPais);
        }else{
            System.out.println(nombre + " " + apellidos + " no pudo tomar un vuelo, porque su pasaporte no esta vigente");
        }
    }
    public void jugar(){
        if(mascota != null){
            System.out.println(nombre + " " + apellidos + " juega con " + mascota.getNombre() + ", su " + mascota.getEspecie());
        }else{
            System.out.println(nombre + " " + apellidos + " no tiene una mascota con la que jugar");
        }
    }

    public void adoptarMascota(Mascota pMascota){
        mascota = pMascota;
        System.out.println(nombre + " " + apellidos + " ha adoptado a " + mascota.getNombre() + ", un " + mascota.getEspecie() + " de " + mascota.getEdad() + " años");
    }

    public void soldar(MaquinaSoldar pMaquina, String pMetal){
        System.out.println(nombre + " " + apellidos +  " intenta soldar: " + pMetal); 
        pMaquina.soldar(pMetal);
    }

    //Getter y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String pNombre){
        nombre = pNombre;
    }

    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String pApellidos){
        apellidos = pApellidos;
    }

    public Pasaporte getPasaporte(){
        return pasaporte;
    }
    public void setPasaporte(Pasaporte pPasaporte){
        pasaporte = pPasaporte;

    }
}