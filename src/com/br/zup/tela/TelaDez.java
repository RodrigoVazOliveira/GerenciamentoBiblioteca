package com.br.zup.tela;

import com.br.zup.IO;
import com.br.zup.ServicoLivrosDoUsuario;
import com.br.zup.ServicoUsuario;
import com.br.zup.Usuario;

public class TelaDez implements TelaStrategy{
    @Override
    public void executarTela() throws Exception {
        IO.output("Qual o seu email, por gentileza? ");
        Usuario usuario = ServicoUsuario.pesquisarUsuarioPorEmail(IO.input().nextLine());
        IO.output("Total de livros do usuário ");
        IO.output(usuario.toString());
        IO.output("Total: " + ServicoLivrosDoUsuario.numeroDeLivroDoUsuario(usuario));
    }
}
