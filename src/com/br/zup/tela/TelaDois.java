package com.br.zup.tela;

import com.br.zup.IO;
import com.br.zup.ServicoLivro;

public class TelaDois implements TelaStrategy{
    @Override
    public void executarTela() throws Exception {
        IO.output(ServicoLivro.ListarTodosOsLivros());
    }
}
