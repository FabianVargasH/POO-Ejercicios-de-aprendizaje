package vargas.fabian.bl;

public class Rectangulo extends Figura{
    protected double base;
    protected double altura;

    public Rectangulo(String nombre, double base, double altura){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    @Override
    public double calcularPerimetro(){
        return 2*(base+altura);
    }
    @Override
    public double calcularArea(){
        return base*altura;
    }

    @Override
    public void imprimirInformacion(){
        System.out.println("Rectángulo: " + nombre);
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }
    @Override
    public String toString() {
        return super.toString() + ", Base: " + base + ", Altura: " + altura;
    }

}
