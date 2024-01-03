package com.br.easytickets.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Ingresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Evento evento;
    private LocalDateTime vendaAte;
    @OneToMany
    private List<LoteIngresso> loteIngresso;
}