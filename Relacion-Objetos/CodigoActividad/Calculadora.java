public class Calculadora {

    public double calcularArea(double radio){
        return Math.PI * radio * radio;
    }

    public double calcularArea(double diagonalMayor, double diagonalMenor){
        return(diagonalMayor * diagonalMenor)/2;
    }
    
    public double calcularArea(double numeroA, double numeroB, double numeroC){
        double semiPerimetro = (numeroA + numeroB + numeroC)/2;
        return Math.sqrt(semiPerimetro*(semiPerimetro - numeroA)*(semiPerimetro-numeroB)*(semiPerimetro-numeroC));
    }
}
