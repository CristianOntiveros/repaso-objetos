package uaslp.objetos.figuras;

public class Cuadrado extends Figura{
    private double lado;
    private String name="Cuadrado";

    public Cuadrado(){

    }
    public Cuadrado(double lado){
        this.lado=lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() throws LadoNoProvistoException{
        if(lado<1){
            throw new LadoNoProvistoException();
        }
        return (lado*lado);
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String getName() {
        return name;
    }
}
