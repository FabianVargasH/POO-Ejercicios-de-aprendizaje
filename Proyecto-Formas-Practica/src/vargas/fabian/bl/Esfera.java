package vargas.fabian.bl;

public class Esfera extends Cuerpo{
    private double radio;
    public Esfera(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    @Override
    public double calcularArea() {
        return 4 * Math.PI * radio * radio;
    }
    @Override
    public double calcularVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
    @Override
    public void imprimirInformacion() {
        System.out.println("Esfera: " + nombre);
        System.out.println("Radio: " + radio);
        System.out.println("Área superficial: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Volumen: " + calcularVolumen());
    }
    @Override
    public String toString() {
        return "Esfera: " + nombre + ", Radio: " + radio;
    }
}
