package com.entra21.primeiroprojetospring.model.entity;

import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Data
@Entity
@Table(name = "livro")

public class LivroEntity extends ItemEntity{


    @Column(name = "autor")
    private String autor;

    @Column(name = "qtde_paginas")
    private  Integer qtdePaginas;

    @Column(name = "ano_publicacao")
    private Integer anoPublicacao;

    @Column(name = "edicao")
    private Integer edicao;
}
