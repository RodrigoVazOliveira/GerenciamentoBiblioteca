package com.br.zup.categoria;

import com.br.zup.Categoria;

public class Arte implements CategoriaStrategy{
    @Override
    public Categoria getCategoria() {
        return Categoria.ARTE;
    }
}
