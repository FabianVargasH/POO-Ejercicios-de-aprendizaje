package vargas.fabian.bl;

public class Rombo extends Figura{
    private double diagonalMayor;
    private double diagonalMenor;
    private double lado;

    public Rombo(String nombre, double diagonalMayor, double diagonalMenor, double lado) {
        super(nombre);
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    // Getters y Setters
    public double getDiagonalMayor() {
        return diagonalMayor;
    }
    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }
    public double getDiagonalMenor() {
        return diagonalMenor;
    }
    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Rombo: " + nombre);
        System.out.println("Diagonal Mayor: " + diagonalMayor);
        System.out.println("Diagonal Menor: " + diagonalMenor);
        System.out.println("Lado: " + lado);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }
}
