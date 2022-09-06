package com.entra21.primeiroprojetospring.model.entity;

import lombok.Data;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "avaliacao")
public class AvaliacaoEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_avaliador")
    private String nomeAvaliador;

    @Column(name = "nota")
    private Double nota;

    @Column(name = "comentario")
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "id_item", referencedColumnName = "id")
    private ItemEntity item;


}
