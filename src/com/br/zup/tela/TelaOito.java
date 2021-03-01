package com.br.zup.tela;

import com.br.zup.IO;
import com.br.zup.ServicoLivrosDoUsuario;
import com.br.zup.ServicoUsuario;
import com.br.zup.Usuario;

public class TelaOito implements TelaStrategy{
    @Override
    public void executarTela() throws Exception {
        IO.output("Por favor, digite o email do usuário");
        Usuario usuario = ServicoUsuario.pesquisarUsuarioPorEmail(IO.input().nextLine());
        String livros = ServicoLivrosDoUsuario.listarLivroDoUsuario(usuario);
        IO.output(livros);
    }
}
