package com.br.zup.tela;

import java.util.HashMap;

public class ContextoTela {
    HashMap<Integer, TelaStrategy> telas = new HashMap<>();

    public ContextoTela setContextoTela(Integer chave, TelaStrategy valor) {
        telas.put(chave, valor);
        return this;
    }

    public void executar(Integer chave) throws Exception {
        telas.get(chave).executarTela();
    }
}
