package com.br.easytickets.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private LocalDateTime dataDoEvento;
    private float duracao;
    private Boolean online;
    @OneToOne
    private Endereco endereco;
}
