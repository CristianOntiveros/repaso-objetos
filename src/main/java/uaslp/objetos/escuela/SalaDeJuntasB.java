package uaslp.objetos.escuela;

public class SalaDeJuntasB implements SalaDeJuntas{

    private static SalaDeJuntasB instance;

    public static SalaDeJuntasB getInstance(){
        if (instance==null){
            instance=new SalaDeJuntasB();
        }
        return instance;
    }

    @Override
    public String getNombre() {
        return ("Sala B");
    }
}
