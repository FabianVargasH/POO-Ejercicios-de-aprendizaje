package vargas.fabian.bl;

public class Equilatero extends Triangulo{
    public Equilatero(String nombre, double lado) {
        super(nombre, lado, lado, lado);
    }
    @Override
    public void imprimirInformacion() {
        System.out.println("Triángulo Equilátero: " + nombre);
        System.out.println("Lado: " + lado1);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }
    @Override
    public String toString() {
        return "Triángulo Equilátero: " + nombre + ", Lado: " + lado1;
    }
}
