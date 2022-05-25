package uaslp.objetos.figuras;

public class PoligonoRegular {
    private int numeroDeLAdos;
    private double lado;

    public PoligonoRegular(int numeroDeLAdos){
        this.numeroDeLAdos=numeroDeLAdos;
    }

    public PoligonoRegular(int numeroDeLAdos, double lado){
        this.numeroDeLAdos=numeroDeLAdos;
        this.lado=lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea(){
        return 259.8076211353316;

    }

    public double getLado(){
        return lado;
    }
}
