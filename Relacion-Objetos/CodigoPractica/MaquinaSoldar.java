public class MaquinaSoldar {
    private String marca;
    private String modelo;
    private double potencia;
    private String[] metalesPermitidos;
    
    //Constructor
    public MaquinaSoldar(String pMarca, String pModelo, double pPotencia, String[] pMetalesPermitidos ){
        marca = pMarca;
        modelo = pModelo;
        potencia = pPotencia;
        metalesPermitidos = pMetalesPermitidos;
    }
    public void soldar(String pMetal){
        boolean puedeSoldar = false;
        for(int i = 0; i<metalesPermitidos.length; i++){
            if(metalesPermitidos[i].equalsIgnoreCase(pMetal)){
                puedeSoldar = true;
                break;
            }
        }
        if(puedeSoldar){
            System.out.println("La maquina de soldar " + marca + " " + modelo + " solda el " + pMetal);
        }else{
            System.out.println("La maquina de soldar " + marca + " " + modelo + " no puede soldar " + pMetal);
        }
    }

    //Getters y Setters
    public String getMarca(){
        return marca;
    }
    public void setMarca(String pMarca){
        marca = pMarca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String pModelo){
        modelo = pModelo;
    }

    public double getPotencia(){
        return potencia;
    }
    public void setPotencia(double pPotencia){
        potencia = pPotencia;
    }
    public String[] getMetalesPermitidos(){
        return metalesPermitidos;
    }
    public void setMetalesPermitidos(String[] pMetalesPermitidos){
        metalesPermitidos = pMetalesPermitidos;
    }
}
