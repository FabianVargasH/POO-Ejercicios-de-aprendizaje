public class Rectangulo extends Figura {

    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo(){
        return largo;
    }
    
    public void setLargo(double radio){
        this.largo = largo;
    }
    
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea(){
        return largo * ancho;
    }

    public double calcularPerimetro(){
        return 2 * (largo + ancho);
    }

    public String toString(){
        return "Soy un rectangulo de area" + calcularArea() + " y de perimetro: " + calcularPerimetro();
    }

    public boolean equals(Rectangulo rectanguloComparar){
         return largo == rectanguloComparar.largo && ancho == rectanguloComparar.ancho;
    }
}