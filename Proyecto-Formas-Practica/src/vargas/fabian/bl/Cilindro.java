package vargas.fabian.bl;

public class Cilindro extends Cuerpo{
    private Circulo base;
    private double altura;
    public Cilindro(String nombre, double radio, double altura) {
        super(nombre);
        this.base = new Circulo("Base del cilindro", radio);
        this.altura = altura;
    }
    public double getRadio() {
        return base.getRadio();
    }
    public void setRadio(double radio) {
        base.setRadio(radio);
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double calcularPerimetro() {
        return 2 * base.calcularPerimetro() + altura * 2;
    }
    @Override
    public double calcularArea() {
        return 2 * base.calcularArea() + base.calcularPerimetro() * altura;
    }
    @Override
    public double calcularVolumen() {
        return base.calcularArea() * altura;
    }
    @Override
    public void imprimirInformacion() {
        System.out.println("Cilindro: " + nombre);
        System.out.println("Radio: " + base.getRadio());
        System.out.println("Altura: " + altura);
        System.out.println("Área superficial: " + calcularArea());
        System.out.println("Perímetro total: " + calcularPerimetro());
        System.out.println("Volumen: " + calcularVolumen());
    }
    @Override
    public String toString() {
        return "Cilindro: " + nombre + ", Radio: " + base.getRadio() + ", Altura: " + altura;
    }
}
