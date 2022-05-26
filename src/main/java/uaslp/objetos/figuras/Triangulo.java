package uaslp.objetos.figuras;

public class Triangulo extends Figura{
    private double base;
    private double altura;
    private String description="Cualquier triangulo";
    private String name="Triangulo";

    public Triangulo(){

    }

    public Triangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea(){
        return((base*altura)/2);
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }
}
