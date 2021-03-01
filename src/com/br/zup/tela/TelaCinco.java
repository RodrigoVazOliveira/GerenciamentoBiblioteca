package com.br.zup.tela;

import com.br.zup.IO;
import com.br.zup.ServicoUsuario;
import com.br.zup.Usuario;

public class TelaCinco implements TelaStrategy{
    @Override
    public void executarTela() throws Exception {
        IO.output("Por favor, digite um nome e um e-mail: ");
        Usuario usuario = ServicoUsuario.cadastrarUsuario(
                IO.input().nextLine(),
                IO.input().nextLine()
        );
        IO.output("\u2713 Usuário cadastro!");
        IO.output(usuario.toString());
    }
}
