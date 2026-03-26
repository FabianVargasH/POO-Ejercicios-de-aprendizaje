package vargas.fabian.bl;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Coleccion {
    private ArrayList<Figura> figuras;
    private ArrayList<Cuerpo> cuerpos;

    public Coleccion() {
        this.figuras = new ArrayList<>();
        this.cuerpos = new ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void agregarCuerpo(Cuerpo cuerpo) {
        cuerpos.add(cuerpo);
    }

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public ArrayList<Cuerpo> getCuerpos() {
        return cuerpos;
    }

    public double calcularAreaTotal() {
        double areaTotal = 0;
        for (Figura figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        for (Cuerpo cuerpo : cuerpos) {
            areaTotal += cuerpo.calcularArea();
        }
        return areaTotal;
    }

    public double calcularPerimetroTotal() {
        double perimetroTotal = 0;
        for (Figura figura : figuras) {
            perimetroTotal += figura.calcularPerimetro();
        }
        for (Cuerpo cuerpo : cuerpos) {
            perimetroTotal += cuerpo.calcularPerimetro();
        }
        return perimetroTotal;
    }

    public double calcularVolumenTotal() {
        double volumenTotal = 0;
        for (Cuerpo cuerpo : cuerpos) {
            volumenTotal += cuerpo.calcularVolumen();
        }
        return volumenTotal;
    }

    public void listarFiguras() {
        if (figuras.isEmpty()) {
            System.out.println("No hay figuras en la colección.");
            return;
        }
        System.out.println("\n=== FIGURAS ===");
        for (int i = 0; i < figuras.size(); i++) {
            System.out.println((i + 1) + ". " + figuras.get(i));
        }
    }

    public void listarCuerpos() {
        if (cuerpos.isEmpty()) {
            System.out.println("No hay cuerpos en la colección.");
            return;
        }
        System.out.println("\n=== CUERPOS ===");
        for (int i = 0; i < cuerpos.size(); i++) {
            System.out.println((i + 1) + ". " + cuerpos.get(i));
        }
    }

    public void mostrarInformacionCompleta() {
        System.out.println("\n=== INFORMACIÓN COMPLETA ===");
        System.out.println("\nFIGURAS:");
        for (Figura figura : figuras) {
            figura.imprimirInformacion();
            System.out.println("--------------------");
        }
        System.out.println("\nCUERPOS:");
        for (Cuerpo cuerpo : cuerpos) {
            cuerpo.imprimirInformacion();
            System.out.println("--------------------");
        }
        System.out.println("\n=== TOTALES ===");
        System.out.println("Área total: " + calcularAreaTotal());
        System.out.println("Perímetro total: " + calcularPerimetroTotal());
        System.out.println("Volumen total: " + calcularVolumenTotal());
    }
}
