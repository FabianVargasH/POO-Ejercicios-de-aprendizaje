import java.io.*;

public class Main {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {

        String barra = "- - - - - - - - - - - - - - - - - - - - -";
        Cliente clienteUno = new Cliente( //Cliente que utiliza el constructor completo
            "Julio",
            "Hidalgo Chaves",
            118739255,
            "Masculino",
            "San Carlos"
        );

        System.out.println(barra);
        System.out.println("Ejemplo de funcionamiento de los tres constructores");
        System.out.println("\nEjemplo de constructor completo: " + "\nNombre: " + clienteUno.nombre + "\nApellidos: " + clienteUno.apellidos + 
        "\nCedula: " + clienteUno.cedula + "\nSexo: " + clienteUno.sexo + "\nUbicacion: " + clienteUno.ubicacion);

        Cliente clienteDos = new Cliente(//Cliente que utiliza el constructor parcial
            "Maria",
            "Rodriguez Sanchez",
            227642199,
            "Desamparados"
        );

        System.out.println("\nEjemplo de constructor parcial: " + "\nNombre: " + clienteDos.nombre + "\nApellidos: " + clienteDos.apellidos + 
        "\nCedula: " + clienteDos.cedula + "\nUbicacion: " + clienteDos.ubicacion);

        Cliente clienteTres = new Cliente();//Constructor por defecto
        System.out.println("\nEjemplo de constructor por defecto: " + clienteTres);
        System.out.println(barra);

        System.out.println("Ejemplo del constructor de suscripciones");
        Suscripcion suscripcionUno= new Suscripcion("Individual", 3500, 1);
        System.out.println("Suscripcion Uno" + "Tipo de plan: " + suscripcionUno.tipo + "\nCosto: " + suscripcionUno.costo + "\nPeriodicidad: " + suscripcionUno.periodicidad);
        Suscripcion suscripcionDos= new Suscripcion("Premium Duo", 8000, 2);
        System.out.println("\nSuscripcion Dos\n" + "Tipo de plan: " + suscripcionDos.tipo + "\nCosto: " + suscripcionDos.costo + "\nPeriodicidad: " + suscripcionDos.periodicidad);
        Suscripcion suscripcionTres= new Suscripcion("Premium Family", 10000, 4);
        System.out.println("\nSuscripcion tres\n" +"Tipo de plan: " + suscripcionTres.tipo + "\nCosto: " + suscripcionTres.costo + "\nPeriodicidad: " + suscripcionTres.periodicidad);
        System.out.println(barra);

        System.out.println("\nPrueba de funcionalidad");
        clienteUno.suscribirse(suscripcionUno);
        clienteDos.suscribirse(suscripcionDos);
        clienteTres.suscribirse(new Suscripcion("Premium Family", 10000, 4));
        System.out.println(barra);
        
    }
}