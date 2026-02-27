public class CuentaAhorros extends Cuenta {
    
    public CuentaAhorros(String titular, double saldoInicial) {
        super(titular, saldoInicial);
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
        System.out.println("CUENTA DE AHORROS");
        
        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser positiva");
            mostrarSaldo();
            return;
        }

        if (saldo < 100) {
            System.out.println("No puede retirar. Saldo mínimo requerido: 100");
            System.out.println(" Su saldo actual es: " + saldo);
            return;
        }

        double saldoDespues = saldo - cantidad;
        if (saldoDespues < 100) {
            System.out.println("No puede retirar " + cantidad);
            mostrarSaldo();
            return;
        }
        
        saldo -= cantidad;
        System.out.println("Retiro exitoso de " + cantidad);
        mostrarSaldo();
    }
    
    private void mostrarSaldo() {
        System.out.println("   Saldo actual: " + saldo);
    }
}