public class Suscripcion {
    private String tipo;
    private int costo;
    private int periodicidad;

    public Suscripcion(String pTipo, int pCosto, int pPeriodicidad){//Constructor completo
        tipo = pTipo;
        costo = pCosto;
        periodicidad = pPeriodicidad;
    }
    //Semana 3
    //Getters
    public String getTipo(){
        return tipo;
    }
    public int getCosto(){
        return costo;
    }
    public int getPeriodicidad(){
        return periodicidad;
    }
    //Setters
    public void setTipo(String nuevoTipo){
        tipo = nuevoTipo;
    }
    public void setCosto(int nuevoCosto){
        costo = nuevoCosto;
    }
    public void setPeriodicidad(int nuevaPeriodicidad){
        periodicidad = nuevaPeriodicidad;
    }

    //equals()
    public boolean equals(Suscripcion suscripcionComparar){
        return tipo == suscripcionComparar.tipo && costo == suscripcionComparar.costo && periodicidad == suscripcionComparar.periodicidad;
    }
    //toString
    public String toString(){
        return  "Tipo: " + tipo +
                "\nCosto: "  + costo +
                "\nPeriodicidad: " + periodicidad;
    }

}
