public class Pasaporte {
    private String numero;
    private String nacionalidad;
    private String fechaEmision;
    private String fechaVencimiento;
    private boolean estaVigente;

    //Constructor
    public Pasaporte(String pNumero, String pNacionalidad, String pFechaEmision, String pFechaVencimiento, boolean pEstaVigente){
        numero = pNumero;
        nacionalidad = pNacionalidad;
        fechaEmision = pFechaEmision;
        fechaVencimiento = pFechaVencimiento;
        estaVigente = pEstaVigente;
    }

    //Los Setter y Getters
    public String getNumero(){
        return numero;
    }
    public void setNumero(String pNumero){
        numero = pNumero;
    }

    public String getNacionalidad(){
        return nacionalidad;
    }
    public void setNacionalidad(String pNacionalidad){
        nacionalidad = pNacionalidad;
    }

    public String getFechaEmision(){
        return fechaEmision;
    }
    public void setFechaEmision(String pFechaEmision){
        fechaEmision = pFechaEmision;
    }

    public String getFechaVencimiento(){
        return fechaVencimiento;
    }
    public void setFechaVencimiento(String pFechaVencimiento){
        fechaVencimiento = pFechaVencimiento;
    }
    
    public boolean isEstaVigente(){
        return estaVigente;
    }
    public void setEstaVigente(boolean pEstaVigente){
        estaVigente = pEstaVigente;
    }
}
