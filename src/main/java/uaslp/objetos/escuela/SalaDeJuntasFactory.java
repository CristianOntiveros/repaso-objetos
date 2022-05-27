package uaslp.objetos.escuela;

import java.util.LinkedList;
import java.util.List;

public class SalaDeJuntasFactory {

    public static SalaDeJuntas get(String sala){
        if(sala=="Sala A"){
            return SalaDeJuntasA.getInstance();
        }else if (sala=="Sala B"){
            return SalaDeJuntasB.getInstance();
        }else if(sala=="Sala C"){
            return SalaDeJuntasC.getInstance();
        }
        return null;
    }
}
