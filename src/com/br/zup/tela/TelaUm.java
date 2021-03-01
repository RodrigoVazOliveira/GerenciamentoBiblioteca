package com.br.zup.tela;

import com.br.zup.IO;
import com.br.zup.Livro;
import com.br.zup.ServicoLivro;
import com.br.zup.config.CategoriaConfig;

public class TelaUm implements TelaStrategy{
    @Override
    public void executarTela() throws Exception {
        CategoriaConfig categoriaConfig = new CategoriaConfig();
        IO.output("Por favor, forneça as seguintes informações: autor, título, editora, número de exemplares e categoria");
        Livro livro =  ServicoLivro.cadastrarNovoLivro(
                IO.input().nextLine(),
                IO.input().nextLine(),
                IO.input().nextLine(),
                IO.input().nextInt(),
                categoriaConfig.getContextoCategoria().executar(IO.input().nextLine())
        );
        IO.output("Livro foi cadastrado \n" + livro.toString());
    }
}
