package com.br.zup.tela;

import com.br.zup.IO;
import com.br.zup.Livro;
import com.br.zup.ServicoLivro;

import java.util.List;

public class TelaQuatro implements TelaStrategy{
    @Override
    public void executarTela() throws Exception {
        IO.output("Favor informar o nome da editora");
        List<Livro> livrosPorEditora = ServicoLivro.buscarLivroPorEditora(IO.input().nextLine());
        IO.output(livrosPorEditora.toString());
    }
}
