import java.io.*;

public class Main{
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException {
        Persona persona1 = new Persona("Fabian", "Vargas Hidalgo");
        Persona persona2 = new Persona("Romario","Salas Cerdas");

        Mascota mascota1 = new Mascota("Max", "Perro", "3");
        
        String[] metalesPermitidos = {"hierro", "acero", "aluminio"};
        MaquinaSoldar maquinaSoldar = new MaquinaSoldar("Miller Electric", "ME123x", 220.5, metalesPermitidos);

        System.out.println("- - - Tramite para pasaportes - - -");
        persona1.sacarPasaporte("AB175216", "Costarricense", "01/01/2024", "01/01/2034", true);
        persona2.sacarPasaporte("CD129612", "Costarricense", "01/01/2020", "01/01/2023", false);

        System.out.println("\n- - - Viajes internacionales de las personas - - -");
        persona1.tomarVuelo("España");
        persona2.tomarVuelo("Belgica");

        System.out.println("\n - - - Mascotas - - -");
        persona1.adoptarMascota(mascota1);
        persona2.adoptarMascota(mascota1);
        persona1.jugar();
        persona2.jugar();

        System.out.println("\n - - - Soldadura - - -");
        persona1.soldar(maquinaSoldar, "hierro");
        persona1.soldar(maquinaSoldar, "titanio");

        System.out.println("- - Fin :) - -");        
    }
}