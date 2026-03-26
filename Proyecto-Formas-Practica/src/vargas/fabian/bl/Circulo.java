package vargas.fabian.bl;

public class Circulo extends Figura{
    private double radio;

    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro(){
        return 2*Math.PI * radio;
    }

    public double calcularArea(){
        return Math.PI * radio * radio;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Círculo: " + nombre);
        System.out.println("Radio: " + radio);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }

    @Override
    public String toString() {
        return super.toString() + ", Radio: " + radio;
    }

}
