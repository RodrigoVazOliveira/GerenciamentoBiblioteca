package com.br.zup.tela;

import com.br.zup.IO;
import com.br.zup.Livro;
import com.br.zup.ServicoLivro;

import java.util.List;

public class TelaTres implements TelaStrategy {
    @Override
    public void executarTela() throws Exception {
        IO.output("Favor informar o nome do autor");
        List<Livro> livrosPorAutor = ServicoLivro.buscarLivroPorAutor(IO.input().nextLine());
        IO.output(livrosPorAutor.toString());
    }
}
