import java.io.*;

public class Main {

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
        System.out.println("\nEjemplo de constructor completo: \nNombre: " + clienteUno.getNombre() + "\nApellidos: " + clienteUno.getApellidos() + 
        "\nCedula: " + clienteUno.getCedula() + "\nSexo: " + clienteUno.getSexo() + "\nUbicacion: " + clienteUno.getUbicacion());

        Cliente clienteDos = new Cliente(//Cliente que utiliza el constructor parcial
            "Maria",
            "Rodriguez Sanchez",
            227642199,
            "Desamparados"
        );

        System.out.println("\nEjemplo de constructor parcial: " + "\nNombre: " + clienteDos.getNombre() + "\nApellidos: " + clienteDos.getApellidos() + 
        "\nCedula: " + clienteDos.getCedula() + "\nUbicacion: " + clienteDos.getUbicacion());

        Cliente clienteTres = new Cliente();//Constructor por defecto
        System.out.println("\nEjemplo de constructor por defecto: " + clienteTres);
        System.out.println(barra);

        System.out.println("Ejemplo del constructor de suscripciones");
        Suscripcion suscripcionUno= new Suscripcion("Individual", 3500, 1);
        System.out.println("Suscripcion Uno" + "Tipo de plan: " + suscripcionUno.getTipo() + "\nCosto: " + suscripcionUno.getCosto() + "\nPeriodicidad: " + suscripcionUno.getPeriodicidad());

        Suscripcion suscripcionDos= new Suscripcion("Premium Duo", 8000, 2);
        System.out.println("\nSuscripcion Dos\n" + "Tipo de plan: " + suscripcionDos.getTipo() + "\nCosto: " + suscripcionDos.getCosto() + "\nPeriodicidad: " + suscripcionDos.getPeriodicidad());
        
        Suscripcion suscripcionTres= new Suscripcion("Premium Family", 10000, 4);
        System.out.println("\nSuscripcion tres\n" +"Tipo de plan: " + suscripcionTres.getTipo() + "\nCosto: " + suscripcionTres.getCosto() + "\nPeriodicidad: " + suscripcionTres.getPeriodicidad());
        System.out.println(barra);

        System.out.println("\nPrueba de funcionalidad");
        clienteUno.suscribirse(suscripcionUno);
        clienteDos.suscribirse(suscripcionDos);
        clienteTres.suscribirse(new Suscripcion("Premium Family", 10000, 4));
        System.out.println(barra);

        //Clase semana 3
        System.out.println("Prints del codigo de semana 3:");
        System.out.println("El primer cliente es " +clienteUno.getNombre() + " " + clienteUno.getApellidos());
        System.out.println("El primer cliente es " +clienteUno.getNombreCompleto());

        clienteDos.setNombre("Jack");
        System.out.println("Nombre del cliente dos despues del set: " + clienteDos.getNombre());

        Cliente clienteCuatro = new Cliente(            
            "Julio",
            "Hidalgo Chaves",
            118739255,
            "Masculino",
            "San Carlos");

        System.out.println(clienteUno.equals(clienteCuatro));

        //Clase jueves semana 3
        System.out.println(clienteCuatro);
        System.out.println(suscripcionTres);
    }
}