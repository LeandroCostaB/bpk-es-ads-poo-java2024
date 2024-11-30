package exercicioCarro;

public class Motor {
    private int cilindradas;
    private String modelo;
    private TipoCombustivel tipoCombustivel;
    private int rpm;
    private int potencia;
    private Boolean ligado;

    public Motor(int cilindradas, String modelo, int potencia, int rpm, TipoCombustivel tipoCombustivel) {
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.potencia = potencia;
        this.rpm = rpm;
        this.tipoCombustivel = tipoCombustivel;
        this.ligado= false;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getRpm() {
        return rpm;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void ligar (){
        if (!this.ligado){
            this.ligado = true;
            System.out.println("O motor esta ligado ");
        }else {
            System.out.println("O motor ja esta ligado");
        }
    }

    public void desligar (){
        if (!this.ligado){
            this.ligado = false;
            System.out.println("O motor ja esta desligado");
        }else{
            System.out.println("O motor esta desligado ");
        }
    }

    public void aumentarPotencia (){

    }

    public void reduzirPotencia (){

    }

    public void acelerar (){

    }

    public void reduzirRpm (){

    }

    @Override
    public String toString() {
        return "Motor{" +
                "cilindradas=" + cilindradas +
                ", modelo='" + modelo + '\'' +
                ", tipoCombustivel=" + tipoCombustivel +
                ", rpm=" + rpm +
                ", potencia=" + potencia +
                ", ligado=" + ligado +
                '}';
    }
}

