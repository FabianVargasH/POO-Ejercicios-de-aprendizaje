import java.io.*;

public class Main {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        PersonaA persona = new PersonaA();

        ProcesadorAlimentos herramienta = new ProcesadorAlimentos();

        System.out.print("Ingrese el alimento: ");
        String alimento = entrada.readLine();

        System.out.print("Ingrese el estado del alimento (Congelado/Entero/Procesado): ");
        String estado = entrada.readLine();

        persona.procesarAlimentos(alimento, estado, herramienta); // Consecuencia de la dependencia
    }
}