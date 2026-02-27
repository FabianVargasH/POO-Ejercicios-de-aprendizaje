public class Main {
    public static void main(String[] args) {
        
        CuentaAhorros cuenta = new CuentaAhorros("Juan", 500);
        
        // Probar depósito
        cuenta.depositar(200);
        
        // Probar retiro válido
        cuenta.retirar(300);
        
        // Probar retiro inválido (dejaría saldo < 100)
        cuenta.retirar(400);
    }
}