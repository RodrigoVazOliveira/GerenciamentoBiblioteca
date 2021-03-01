package com.br.zup.categoria;

import com.br.zup.Categoria;

public class Acao implements CategoriaStrategy{
    @Override
    public Categoria getCategoria() {
        return Categoria.ACAO;
    }
}
