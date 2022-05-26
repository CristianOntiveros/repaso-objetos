package uaslp.objetos.figuras;

public class TrianguloEquilatero extends Triangulo{
    private String description="Lados iguales";
    private String name="Triangulo Equilatero";

    public String getDescription(){
        return description;
    }

    @Override
    public String getName() {
        return name;
    }
}
