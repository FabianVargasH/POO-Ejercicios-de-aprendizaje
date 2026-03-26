package vargas.fabian.bl;

public class Escaleno extends Triangulo{
    public Escaleno(String nombre, double lado1, double lado2, double lado3) {
        super(nombre, lado1, lado2, lado3);
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Triángulo Escaleno: " + nombre);
        System.out.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }

    @Override
    public String toString() {
        return "Triángulo Escaleno: " + nombre + ", Lados: " + lado1 + ", " + lado2 + ", " + lado3;
    }
}
