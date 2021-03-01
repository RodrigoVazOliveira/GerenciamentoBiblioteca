package com.br.zup.tela;

import com.br.zup.*;

import java.util.List;

public class TelaNove implements TelaStrategy{
    @Override
    public void executarTela() throws Exception {
        IO.output("Qual o seu email, por gentileza? ");
        Usuario usuario = ServicoUsuario.pesquisarUsuarioPorEmail(IO.input().nextLine());
        List<Livro> livros = ServicoLivrosDoUsuario.recomendarLivroParaUsuario(usuario);
        for (Livro livro : livros) {
            IO.output(livro.toString());
        }
    }
}
