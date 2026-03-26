package vargas.fabian.bl;

public class Isosceles extends Triangulo{
    public Isosceles(String nombre, double lado1, double lado2, double lado3) {
        super(nombre, lado1, lado2, lado3);
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Triángulo Isósceles: " + nombre);
        System.out.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }

    @Override
    public String toString() {
        return "Triángulo Isósceles: " + nombre + ", Lados: " + lado1 + ", " + lado2 + ", " + lado3;
    }
}
