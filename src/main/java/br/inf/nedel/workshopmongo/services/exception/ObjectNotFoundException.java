package br.inf.nedel.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException{
    private static final long servialVersionUID = 1L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
