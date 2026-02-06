public class Cliente {
    private String nombre;
    private String apellidos;
    private int cedula;
    private String sexo;
    private String ubicacion;

    public Cliente (String pNombre, String pApellidos, int pCedula, String pSexo, String pUbicacion){ //Constructor completo
        nombre = pNombre;
        apellidos = pApellidos;
        cedula = pCedula;
        sexo = pSexo;
        ubicacion = pUbicacion;
    }
    public Cliente (String pNombre, String pApellidos, int pCedula, String pUbicacion){ //Constructor parcial
        nombre = pNombre;
        apellidos = pApellidos;
        cedula = pCedula;
        ubicacion = pUbicacion;

    }
    public Cliente(){ //Constructor por defecto

    }

    //Semana 3
    //Getters
    public String getNombre(){
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombreCompleto(){
        return nombre + " " + apellidos;
    }

    public int getCedula(){
        return cedula;
    }
    public String getSexo(){
        return sexo;
    }
    public String getUbicacion(){
        return ubicacion;
    }

    //Setters
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    public void setApellidos(String nuevoApellidos){
        apellidos = nuevoApellidos;
    }
    public void setCedula(int nuevaCedula){
        cedula = nuevaCedula;
    }
    public void setSexo(String nuevoSexo){
        sexo = nuevoSexo;
    }
    public void setUbicacion(String nuevaUbicacion){
        ubicacion = nuevaUbicacion;
    }

    //equals()
    public boolean equals(Cliente clienteComparar){
        return apellidos.equals(clienteComparar.apellidos) && cedula == clienteComparar.cedula;
    }

    //toString
    public String toString() {
        return "Nombre: " + nombre +
                "\nApellidos: " + apellidos +
                "\nCedula: " + cedula +
                "\nSexo: " + sexo + "\n";
    }



    //Metodo creado en semana 2
    public void suscribirse(Suscripcion suscripcion){
        System.out.println(nombre + " " + apellidos + " adquirió una suscripción " + suscripcion.getTipo());
    }
}
