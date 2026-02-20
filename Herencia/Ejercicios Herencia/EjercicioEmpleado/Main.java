public class Main {
    public static void main(String[] args) {
        // Crear un empleado normal
        Empleado e1 = new Empleado("Juan", "Pérez", "Programador");
        System.out.println("Salario de Juan: " + e1.calcularSalario());
        e1.trabajar();
        
        System.out.println();
        
        // Crear un empleado de RH
        EmpleadoRH e2 = new EmpleadoRH("Ana", "García", "Reclutadora");
        System.out.println("Salario de Ana: " + e2.calcularSalario());
        e2.trabajar();
        e2.contratarEmpleado("Carlos", "Diseñador");
    }
}