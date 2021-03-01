package com.br.zup.categoria;

import com.br.zup.Categoria;

public class Ti implements CategoriaStrategy{
    @Override
    public Categoria getCategoria() {
        return Categoria.TI;
    }
}
