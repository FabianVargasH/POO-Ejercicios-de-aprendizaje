public class PersonaA {

    public void procesarAlimentos(String alimento, String estado, ProcesadorAlimentos procesador) {
        // Construcción de objetos
        procesador.procesar(alimento, estado);
    }

    // Establecer otra relación de dependencia en Persona, que la haga utilizar una Calculadora para el
    // cálculo de algunas fórmulas. Todas las fórmulas se invocarán mediante la rutina calcularArea(),
    // la cual debe estar sobrecargada para recibir uno, dos o tres argumentos.
    // 1 > Radio
    // 2 > Diagonal mayor, diagonal menor
    // 3 > Lados de un triángulo
}