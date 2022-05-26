package uaslp.objetos.figuras;

public class TrianguloEscaleno extends Triangulo{
    private String description="Lados diferentes";
    private String name="Triangulo Escaleno";

    public String getDescription(){
        return description;
    }

    @Override
    public String getName() {
        return name;
    }
}
