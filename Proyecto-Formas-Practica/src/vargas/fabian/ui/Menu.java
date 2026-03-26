package vargas.fabian.ui;

import vargas.fabian.bl.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    private Coleccion coleccion;
    private BufferedReader reader;

    public Menu() {
        this.coleccion = new Coleccion();
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n=== SISTEMA DE FIGURAS GEOMÉTRICAS ===");
            System.out.println("1. Agregar figura");
            System.out.println("2. Agregar cuerpo");
            System.out.println("3. Listar figuras");
            System.out.println("4. Listar cuerpos");
            System.out.println("5. Mostrar información completa");
            System.out.println("6. Calcular totales");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    agregarFigura();
                    break;
                case 2:
                    agregarCuerpo();
                    break;
                case 3:
                    coleccion.listarFiguras();
                    break;
                case 4:
                    coleccion.listarCuerpos();
                    break;
                case 5:
                    coleccion.mostrarInformacionCompleta();
                    break;
                case 6:
                    mostrarTotales();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }

    private int leerEntero() {
        try {
            return Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            return -1;
        }
    }

    private double leerDouble() {
        try {
            return Double.parseDouble(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            return 0;
        }
    }

    private String leerString() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            return "";
        }
    }

    private void agregarFigura() {
        System.out.println("\n=== AGREGAR FIGURA ===");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Rombo");
        System.out.println("5. Triángulo");
        System.out.print("Seleccione tipo: ");

        int tipo = leerEntero();

        System.out.print("Nombre: ");
        String nombre = leerString();

        Figura figura = null;

        switch (tipo) {
            case 1:
                System.out.print("Radio: ");
                double radio = leerDouble();
                figura = new Circulo(nombre, radio);
                break;
            case 2:
                System.out.print("Base: ");
                double base = leerDouble();
                System.out.print("Altura: ");
                double altura = leerDouble();
                figura = new Rectangulo(nombre, base, altura);
                break;
            case 3:
                System.out.print("Lado: ");
                double lado = leerDouble();
                figura = new Cuadrado(nombre, lado);
                break;
            case 4:
                System.out.print("Diagonal Mayor: ");
                double diagMayor = leerDouble();
                System.out.print("Diagonal Menor: ");
                double diagMenor = leerDouble();
                System.out.print("Lado: ");
                double ladoRombo = leerDouble();
                figura = new Rombo(nombre, diagMayor, diagMenor, ladoRombo);
                break;
            case 5:
                System.out.print("Lado 1: ");
                double l1 = leerDouble();
                System.out.print("Lado 2: ");
                double l2 = leerDouble();
                System.out.print("Lado 3: ");
                double l3 = leerDouble();
                figura = Triangulo.crearTriangulo(nombre, l1, l2, l3);
                break;
            default:
                System.out.println("Tipo no válido");
                return;
        }

        coleccion.agregarFigura(figura);
        System.out.println("Figura agregada exitosamente");
    }

    private void agregarCuerpo() {
        System.out.println("\n=== AGREGAR CUERPO ===");
        System.out.println("1. Cubo");
        System.out.println("2. Cilindro");
        System.out.println("3. Tetraedro");
        System.out.println("4. Esfera");
        System.out.print("Seleccione tipo: ");

        int tipo = leerEntero();

        System.out.print("Nombre: ");
        String nombre = leerString();

        Cuerpo cuerpo = null;

        switch (tipo) {
            case 1:
                System.out.print("Lado: ");
                double lado = leerDouble();
                cuerpo = new Cubo(nombre, lado);
                break;
            case 2:
                System.out.print("Radio: ");
                double radio = leerDouble();
                System.out.print("Altura: ");
                double altura = leerDouble();
                cuerpo = new Cilindro(nombre, radio, altura);
                break;
            case 3:
                System.out.print("Lado: ");
                double ladoTet = leerDouble();
                cuerpo = new Tetraedro(nombre, ladoTet);
                break;
            case 4:
                System.out.print("Radio: ");
                double radioEsf = leerDouble();
                cuerpo = new Esfera(nombre, radioEsf);
                break;
            default:
                System.out.println("Tipo no válido");
                return;
        }

        coleccion.agregarCuerpo(cuerpo);
        System.out.println("Cuerpo agregado exitosamente");
    }

    private void mostrarTotales() {
        System.out.println("\n=== TOTALES ===");
        System.out.println("Área total: " + coleccion.calcularAreaTotal());
        System.out.println("Perímetro total: " + coleccion.calcularPerimetroTotal());
        System.out.println("Volumen total: " + coleccion.calcularVolumenTotal());
    }
}
