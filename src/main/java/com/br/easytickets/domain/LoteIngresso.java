package com.br.easytickets.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class LoteIngresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int qtdIngresso;
    private int valorIngresso;
    private boolean esgotado;
    @ManyToOne
    private Ingresso ingresso;

}
