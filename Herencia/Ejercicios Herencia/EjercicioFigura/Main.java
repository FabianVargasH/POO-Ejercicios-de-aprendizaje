public class Main {
    public static void main(String[] args) {
        // Crear las figuras con valores directos
        Rectangulo rectangulo = new Rectangulo(5.0, 3.0);
        Circulo circulo = new Circulo(4.0);
        
        // Mostrar resultados
        System.out.println("Area del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
        
        System.out.println("Area del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
    }
}
