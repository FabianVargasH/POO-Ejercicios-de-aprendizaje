public class Main {
    public static void main(String[] args) {

        Circulo miCirculo = new Circulo(7);
        Rectangulo miRectangulo = new Rectangulo(13, 8);
        Figura[] misFiguras = new Figura[10]; //Ligado Dinamico (Polimorfismo)

        System.out.println(miCirculo.calcularArea());

        misFiguras[0] =  miCirculo;
        misFiguras[1] = miRectangulo;

        for(int i = 0; i <= 2;i++){
            System.out.println(misFiguras[i].calcularArea());
        }

        
    }
}