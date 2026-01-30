public class Cliente {
    String nombre;
    String apellidos;
    int cedula;
    String sexo;
    String ubicacion;

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

    public void suscribirse(Suscripcion suscripcion){
        System.out.println(nombre + " " + apellidos + " adquirió una suscripción " + suscripcion.tipo);
    }
}
