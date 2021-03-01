package com.br.zup.categoria;

import com.br.zup.Categoria;

public class Comedia implements CategoriaStrategy {
    @Override
    public Categoria getCategoria() {
        return Categoria.COMEDIA;
    }
}
