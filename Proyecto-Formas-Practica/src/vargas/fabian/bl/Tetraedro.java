package vargas.fabian.bl;

public class Tetraedro extends Cuerpo{
    private Triangulo cara;
    public Tetraedro(String nombre, double lado) {
        super(nombre);
        this.cara = Triangulo.crearTriangulo("Cara del tetraedro", lado, lado, lado);
    }
    public double getLado() {
        return cara.getLado1();
    }
    public void setLado(double lado) {
        cara = Triangulo.crearTriangulo("Cara del tetraedro", lado, lado, lado);
    }
    @Override
    public double calcularPerimetro() {
        return cara.calcularPerimetro() * 4;
    }
    @Override
    public double calcularArea() {
        return cara.calcularArea() * 4;
    }
    @Override
    public double calcularVolumen() {
        double lado = getLado();
        return (Math.pow(lado, 3) * Math.sqrt(2)) / 12;
    }
    @Override
    public void imprimirInformacion() {
        System.out.println("Tetraedro: " + nombre);
        System.out.println("Lado: " + getLado());
        System.out.println("Área superficial: " + calcularArea());
        System.out.println("Perímetro total: " + calcularPerimetro());
        System.out.println("Volumen: " + calcularVolumen());
    }
    @Override
    public String toString() {
        return "Tetraedro: " + nombre + ", Lado: " + getLado();
    }
}
