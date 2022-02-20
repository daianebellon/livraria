package br.com.daianebellon.livraria.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LivroDTO {

    private Long id;

    @NotNull
    private String nome;

    private String descricao;

    @NotNull @Size(max = 20, min = 3)
    private String autor;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataLancamento;

    @NotNull
    private BigDecimal valorLivro;
}
