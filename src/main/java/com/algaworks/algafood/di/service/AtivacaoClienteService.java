package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
    // Ponto de injeção por @Autowired + Atributo
    @Autowired
    private Notificador notificador;

 /* Ponto de injeção por Construtor + @Autowired
    @Autowired
    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public AtivacaoClienteService(String qualquer) {}
 */

    public void ativar(Cliente cliente) {
        cliente.ativar();
        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

 /*  Ponto de injeção por Setter + @Autowired
    @Autowired
    public void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }
 */
}
