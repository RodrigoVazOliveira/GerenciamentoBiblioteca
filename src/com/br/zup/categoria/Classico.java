package com.br.zup.categoria;

import com.br.zup.Categoria;

public class Classico implements CategoriaStrategy{
    @Override
    public Categoria getCategoria() {
        return Categoria.CLASSICO;
    }
}
