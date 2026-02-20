public class Figura{
    protected String nombre;

    public Figura(){
        this.nombre = "Figura generica";
    }
    public double calcularArea(){
        System.out.println("El area de la figura es: ");
        return 0.0;
    }
    public double calcularPerimetro(){
        System.out.println("El perimetro de la figura es: ");
        return 0.0;
    }
    public void mostrarInformacion(){
        System.out.println("Figura: " + nombre);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}