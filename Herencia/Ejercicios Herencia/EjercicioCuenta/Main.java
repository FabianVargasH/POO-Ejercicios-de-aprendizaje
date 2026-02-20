public class Main {
    public static void main(String[] args) {

        CuentaAhorros miCuenta = new CuentaAhorros("Carlos", 500);
        
        System.out.println("Saldo inicial: $" + miCuenta.getSaldo());

        miCuenta.retirar(200);  // Debería funcionar
        miCuenta.retirar(250);  // No debería funcionar (dejaría $50)
        miCuenta.retirar(50);   // Debería funcionar (de $300 a $250)
        
        System.out.println("Saldo final: $" + miCuenta.getSaldo());
    }
}