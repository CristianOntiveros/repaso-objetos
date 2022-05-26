package uaslp.objetos.figuras;

public class TrianguloIsoceles extends Triangulo {
    private String description="2 Lados iguales y 1 diferente";
    private String name="Triangulo Isoceles";

    public String getDescription(){
        return description;
    }

    @Override
    public String getName() {
        return name;
    }
}
