package com.br.zup.categoria;

import com.br.zup.Categoria;

public class Biografia implements CategoriaStrategy{
    @Override
    public Categoria getCategoria() {
        return Categoria.BIOGRAFIA;
    }
}
