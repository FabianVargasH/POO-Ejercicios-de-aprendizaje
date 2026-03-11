import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws Exception {
        menuHipotenusa();
    }
    
    public static double dividir(double dividendo, double divisor) {
        if(divisor == 0) throw new ArithmeticException("No se puede dividir entre 0");
        return dividendo/divisor;
    }

    public static double raizCuadrada(double num) {
        if(num <= 0) throw new ArithmeticException("Las raices de un numero menor a 0 no son permitidas");
        return Math.sqrt(num);
    }

    public static double hipotenusa(double cateto1, double cateto2){
        if(cateto1<=0 || cateto2 <= 0){
            throw new ArithmeticException();
        }
        return Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
    }

    public static void menuHipotenusa() throws IOException{
        while(true){
            System.out.println("--Menu de calculo de hipotenusa");
            System.out.println("1. Calcular hipotenusa");
            System.out.println("0. Salir");
            System.out.print("Ingrese su elección: ");
            int opcion = Integer.parseInt(entrada.readLine());
            if(opcion == 0){
                break;
            }
            if(opcion ==1){
                try{
                    System.out.println("Ingrese el primer cateto");
                    double cateto1 = Double.parseDouble(entrada.readLine());
                    System.out.println("Ingrese el segundo cateto");
                    double cateto2 = Double.parseDouble(entrada.readLine());
                    System.out.println(hipotenusa(cateto1, cateto2));
                }catch(NumberFormatException e){
                    System.out.println("El dato ingresado no tiene formato de número");
                }catch(ArithmeticException e){
                    System.out.println("Los datos ingresados no son adecuados");
                }catch(Exception e){
                    System.out.println("Pasó un error inesperado");
                }
            }else {
                System.out.println("Su elección no es válida");
            }
        }
    }
}