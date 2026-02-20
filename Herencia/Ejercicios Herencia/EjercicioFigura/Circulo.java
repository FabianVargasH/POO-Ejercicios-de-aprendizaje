public class Circulo extends Figura {
    private double radio;
    private double PI = 3.14159;
    
    public Circulo(double radio) {
        super(); 
        this.nombre = "Círculo";
        this.radio = radio;
    }
    
    public double calcularArea() {
        return PI * radio * radio;
    }
    
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
    
    public void mostrarInformacion() {
        System.out.println("=== CÍRCULO ===");
        System.out.println("Radio: " + radio);
        System.out.println("Diámetro: " + (2 * radio));
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
    
    // Getters y Setters
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
}