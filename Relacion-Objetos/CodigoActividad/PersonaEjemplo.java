public class PersonaEjemplo {

    private Calculadora calculadora;

    public PersonaEjemplo() {
        calculadora = new Calculadora();
    }

    public double calcularArea(double r) {
        return calculadora.calcularArea(r);
    }

    public double calcularArea(double d1, double d2) {
        return calculadora.calcularArea(d1, d2);
    }

    public double calcularArea(double a, double b, double c) {
        return calculadora.calcularArea(a, b, c);
    }
}
