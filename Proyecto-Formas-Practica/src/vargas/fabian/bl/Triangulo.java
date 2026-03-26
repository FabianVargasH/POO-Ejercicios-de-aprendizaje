package vargas.fabian.bl;

public abstract class Triangulo extends Figura {
    protected double lado1;
    protected double lado2;
    protected double lado3;

    public Triangulo(String nombre, double lado1, double lado2, double lado3) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Getters y Setters
    public double getLado1() { return lado1; }
    public void setLado1(double lado1) { this.lado1 = lado1; }
    public double getLado2() { return lado2; }
    public void setLado2(double lado2) { this.lado2 = lado2; }
    public double getLado3() { return lado3; }
    public void setLado3(double lado3) { this.lado3 = lado3; }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public static Triangulo crearTriangulo(String nombre, double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return new Equilatero(nombre, lado1);
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return new Isosceles(nombre, lado1, lado2, lado3);
        } else {
            return new Escaleno(nombre, lado1, lado2, lado3);
        }
    }
}
