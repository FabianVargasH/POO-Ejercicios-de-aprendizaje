public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double calcularArea(){
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro(){
        return 2  * Math.PI * radio;
    }
    public boolean equals(Circulo circuloComparar){
        return radio ==  circuloComparar.radio;
    }
}