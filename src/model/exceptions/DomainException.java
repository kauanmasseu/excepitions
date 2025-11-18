package model.exceptions;

//RunTimeExceptinon: não é obrigado a tratar.
//Exception: é obrigado a tratar.
public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
