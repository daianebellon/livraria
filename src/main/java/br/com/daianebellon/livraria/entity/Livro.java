package br.com.daianebellon.livraria.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NOME_DO_LIVRO")
    private String nome;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "AUTOR")
    private String autor;

    @Column(name = "DATA_LANCAMENTO")
    private LocalDate dataLancamento;

    @Column(name = "VALOR_LIVRO")
    private BigDecimal valorLivro;

}
