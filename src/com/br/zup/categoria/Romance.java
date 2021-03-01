package com.br.zup.categoria;

import com.br.zup.Categoria;

public class Romance implements CategoriaStrategy{
    @Override
    public Categoria getCategoria() {
        return Categoria.ROMANCE;
    }
}
