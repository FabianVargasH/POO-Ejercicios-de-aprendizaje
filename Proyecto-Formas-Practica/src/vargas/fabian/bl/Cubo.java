package vargas.fabian.bl;

public class Cubo extends Cuerpo{
    private Cuadrado cara;
    public Cubo(String nombre, double lado) {
        super(nombre);
        this.cara = new Cuadrado("Cara del cubo", lado);
    }
    public double getLado() {
        return cara.getLado();
    }
    public void setLado(double lado) {
        cara.setLado(lado);
    }
    @Override
    public double calcularPerimetro() {
        return cara.calcularPerimetro() * 6;
    }
    @Override
    public double calcularArea() {
        return cara.calcularArea() * 6;
    }
    @Override
    public double calcularVolumen() {
        return Math.pow(cara.getLado(), 3);
    }
    @Override
    public void imprimirInformacion() {
        System.out.println("Cubo: " + nombre);
        System.out.println("Lado: " + cara.getLado());
        System.out.println("Área superficial: " + calcularArea());
        System.out.println("Perímetro total: " + calcularPerimetro());
        System.out.println("Volumen: " + calcularVolumen());
    }
    @Override
    public String toString() {
        return "Cubo: " + nombre + ", Lado: " + cara.getLado();
    }
}
