package com.br.zup.config;

import com.br.zup.tela.*;

public class TelaConfig {
    private ContextoTela contextoTela;

    public TelaConfig() {
        contextoTela = new ContextoTela();
        contextoTela.setContextoTela(1, new TelaUm());
        contextoTela.setContextoTela(2, new TelaDois());
        contextoTela.setContextoTela(3, new TelaTres());
        contextoTela.setContextoTela(4, new TelaQuatro());
        contextoTela.setContextoTela(5, new TelaCinco());
        contextoTela.setContextoTela(6, new TelaSeis());
        contextoTela.setContextoTela(7, new TelaSete());
        contextoTela.setContextoTela(8, new TelaOito());
        contextoTela.setContextoTela(9, new TelaNove());
        contextoTela.setContextoTela(10, new TelaDez());
    }

    public ContextoTela getContextoTela() {
        return contextoTela;
    }
}
