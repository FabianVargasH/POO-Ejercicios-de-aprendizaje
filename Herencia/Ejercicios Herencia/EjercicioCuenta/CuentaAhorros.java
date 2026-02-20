public class CuentaAhorros extends Cuenta {
    
    public CuentaAhorros(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }
    public void retirar(double cantidad) {
        System.out.println("=== CUENTA DE AHORROS ===");
        
        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser positiva");
            mostrarSaldo();
            return;
        }

        if (saldo < 100) {
            System.out.println("No puedes retirar. Saldo mínimo requerido: 100");
            System.out.println("   Tu saldo actual es: " + saldo);
            return;
        }

        double saldoDespues = saldo - cantidad;
        if (saldoDespues < 100) {
            System.out.println("No puedes retirar $" + cantidad);
            System.out.println("   Después del retiro tu saldo sería: " + saldoDespues);
            System.out.println("   El saldo mínimo permitido es 100");
            System.out.println("   Puedes retirar máximo: " + (saldo - 100));
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
