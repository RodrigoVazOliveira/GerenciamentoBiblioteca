package com.br.zup;

import com.br.zup.categoria.*;
import com.br.zup.config.TelaConfig;
import com.br.zup.tela.ContextoTela;

import java.util.ArrayList;
import java.util.List;

/**
 * objeto responsável por executar o programa
 * - listar o menu ao usuário
 * - obter dados do usuário
 * - apresentar os resultados ao usuário
 *
 * */
public class Biblioteca {

    private boolean executar = true;

    private void menu (){
        IO.output("\u27A4 1: Cadastrar um novo livro na biblioteca \t\t\t" +
                "\u27A4 2: Listar os livros da biblioteca\n" +
                "\u27A4 3: Buscar o livro por autor da biblioteca \t\t\t" +
                "\u27A4 4: Buscar o livro por editora da biblioteca\n" +
                "\u27A4 5: Cadastrar novo Usuário \t\t\t\t\t\t\t" +
                "\u27A4 6: Cadastrar livros que o usuário deseja ler\n" +
                "\u27A4 7: Remover um livro da lista de desejos do usuário\t" +
                "\u27A4 8: Listar os livros da lista de desejos do usuário\n" +
                "\u27A4 9: Recomendar livros para o usuário\t\t\t\t\t" +
                "\u27A4 10: Total de livros cadastros do usuário\n" +
                "\u27A4 0: Sair do programa");
    }

    public void executar () throws Exception {
        IO.output(" \t \uD83D\uDCD6 \u2730 \u2730 \u2730 \u2730 \u2730 Bem-vindo a biblioteca! \u2730 \u2730 \u2730 \u2730 \u2730  \uD83D\uDCD6 \n");
        while (executar) {
            menu();
            int option = IO.input().nextInt();

            if (option == 0) {
                executar = false;
            } else {
                TelaConfig telaConfig = new TelaConfig();
                ContextoTela contextoTela = telaConfig.getContextoTela();
                contextoTela.executar(option);
            }
        }

    }

    public boolean isExecutar() {
        return executar;
    }
}
