public class Cuenta {
    protected String titular;
    protected double saldo;
    
    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser positiva");
        } else if (cantidad > saldo) {
            System.out.println("Fondos insuficientes. Saldo actual: $" + saldo);
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        }
    }
    
    // Getters
    public String getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
}
