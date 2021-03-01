package com.br.zup.categoria;

import com.br.zup.Categoria;

import java.util.TreeMap;

public class ContextoCategoria {
    private TreeMap<String, CategoriaStrategy> categorias = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    public void setCategorias(String chave, CategoriaStrategy valor) {
        categorias.put(chave, valor);
    }

    public Categoria executar(String chave) {
        return categorias.get(chave).getCategoria();
    }
}
