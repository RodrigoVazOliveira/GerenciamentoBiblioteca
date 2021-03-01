package com.br.zup.tela;

import com.br.zup.*;

public class TelaSete implements TelaStrategy{
    @Override
    public void executarTela() throws Exception {
        IO.output("Por favor, informar o e-mail do usuário e o título do livro:");
        Usuario usuario = ServicoUsuario.pesquisarUsuarioPorEmail(IO.input().nextLine());
        Livro livroRemovido = ServicoLivrosDoUsuario.removerLivroDoUsuario(usuario, IO.input().nextLine());
        IO.output("Livro removido: ");
        IO.output(livroRemovido.toStringlivroDoUsuario());
    }
}
