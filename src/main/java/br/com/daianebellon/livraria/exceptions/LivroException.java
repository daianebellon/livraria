package br.com.daianebellon.livraria.exceptions;

import java.util.function.Supplier;

public class LivroException extends RuntimeException{

    private static final long serialVersionUID = 4928599035264976611L;
    public LivroException(String message) {
        super(message);
    }

    public LivroException(Throwable t) {
        super(t);
    }
}
