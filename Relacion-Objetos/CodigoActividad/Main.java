import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                PersonaEjemplo persona = new PersonaEjemplo();

        System.out.println("Cantidad de datos a ingresar (1, 2 o 3): ");
        int cantidad = Integer.parseInt(entrada.readLine());

        double area = 0;
        switch(cantidad){
            case 1:
                System.out.print("Ingrese el radio: ");
                double r = Double.parseDouble(entrada.readLine());
                area = persona.calcularArea(r);
                break;
            case 2:
                System.out.print("Ingrese la diagonal mayor: ");
                double d1 = Double.parseDouble(entrada.readLine());
                System.out.print("Ingrese la diagonal menor: ");
                double d2 = Double.parseDouble(entrada.readLine());
                area = persona.calcularArea(d1, d2);
                break;
            case 3:
                System.out.print("Ingrese el lado 1: ");
                double a = Double.parseDouble(entrada.readLine());
                System.out.print("Ingrese el lado 2: ");
                double b = Double.parseDouble(entrada.readLine());
                System.out.print("Ingrese el lado 3: ");
                double c = Double.parseDouble(entrada.readLine());
                area = persona.calcularArea(a, b, c);
                break;
            default:
                System.out.println("Cantidad inválida");
                break;
        }

        System.out.println("Area calculada: " + area);
    }
}
