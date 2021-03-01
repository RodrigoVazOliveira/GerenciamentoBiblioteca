package com.br.zup.categoria;

import com.br.zup.Categoria;

public class Outro implements CategoriaStrategy{
    @Override
    public Categoria getCategoria() {
        return Categoria.OUTROS;
    }
}
