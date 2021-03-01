package com.br.zup.categoria;

import com.br.zup.Categoria;

public class FiccaoCientifica implements CategoriaStrategy{
    @Override
    public Categoria getCategoria() {
        return Categoria.FICCAO_CIENTIFICA;
    }
}
