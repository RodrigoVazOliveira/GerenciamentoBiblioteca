package com.br.zup.config;

import com.br.zup.categoria.*;

public class CategoriaConfig {
    private ContextoCategoria contextoCategoria;

    public CategoriaConfig() {
        contextoCategoria = new ContextoCategoria();
        contextoCategoria.setCategorias("romance", new Romance());
        contextoCategoria.setCategorias("ficção cientifica", new FiccaoCientifica());
        contextoCategoria.setCategorias("ficção", new FiccaoCientifica());
        contextoCategoria.setCategorias("ti", new Ti());
        contextoCategoria.setCategorias("ação", new Acao());
        contextoCategoria.setCategorias("comédia", new Comedia());
        contextoCategoria.setCategorias("arte", new Arte());
        contextoCategoria.setCategorias("Biografia", new Biografia());
        contextoCategoria.setCategorias("clásssico", new Classico());
        contextoCategoria.setCategorias("outros", new Outro());
    }

    public ContextoCategoria getContextoCategoria() {
        return contextoCategoria;
    }
}
