package com.br.zup.tela;

import com.br.zup.*;
import com.br.zup.config.CategoriaConfig;

import java.util.ArrayList;
import java.util.List;

public class TelaSeis implements TelaStrategy{
    @Override
    public void executarTela() throws Exception {
        IO.output("Por favor, digite o email do usuário: ");
        Usuario usuario = ServicoUsuario.pesquisarUsuarioPorEmail(IO.input().nextLine());
        List<Livro> livrosUsuario = new ArrayList<>();
        adicionarLivroNaListaDoUsuario(livrosUsuario);
        ServicoLivrosDoUsuario.cadastrarLivrosDoUsuario(usuario, livrosUsuario);
    }

    private void adicionarLivroNaListaDoUsuario(List<Livro> livrosUsuario) {
        CategoriaConfig categoriaConfig = new CategoriaConfig();
        boolean executarCadastroLivros = true;
        while(executarCadastroLivros) {
            IO.output("Por favor, digite o autor, título e categoria do livro");
            livrosUsuario.add(
                    new Livro(IO.input().nextLine(), IO.input().nextLine(),
                            categoriaConfig.getContextoCategoria().executar(IO.input().nextLine()))
            );
            IO.output("Deseja adicionar mais um livro? (Sim/Nao)");
            String resposta = IO.input().nextLine();
            if (resposta.equalsIgnoreCase("nao")) {
                executarCadastroLivros = false;
            }
        }
    }
}
