package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Empresa {
    @Id
    private Long id;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false, unique = true)
    private String cnpj;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private String bairo;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private String estado;
    @Column(nullable = false)
    private String telefone;
}
