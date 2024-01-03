package com.br.easytickets.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String cnpj;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String telefone;

}
