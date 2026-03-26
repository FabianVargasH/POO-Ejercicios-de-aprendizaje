package vargas.fabian.bl;

public class Cuadrado extends Rectangulo{
    public Cuadrado(String nombre, double lado){
        super(nombre, lado, lado);
    }

    public double getLado(){
        return base;
    }

    public void setLado(double lado){
        this.base = lado;
        this.altura = lado;
    }
    @Override
    public void imprimirInformacion() {
        System.out.println("Cuadrado: " + nombre);
        System.out.println("Lado: " + base);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }
    @Override
    public String toString() {
        return "Cuadrado: " + nombre + ", Lado: " + base;
    }
}
