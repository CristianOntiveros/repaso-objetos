package uaslp.objetos.figuras;

public class DatoFaltanteException extends RuntimeException{
    public DatoFaltanteException(String mensaje){
        super(mensaje);
    }

    public DatoFaltanteException(){
        super();
    }
}
