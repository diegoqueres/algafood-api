package com.algaworks.algafood.domain.exception;

public class DependenciaNaoEncontradaException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DependenciaNaoEncontradaException(String mensagem) {
        super(mensagem);
    }
}
