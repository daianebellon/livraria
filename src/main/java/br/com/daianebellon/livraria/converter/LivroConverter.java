package br.com.daianebellon.livraria.converter;

import br.com.daianebellon.livraria.dto.LivroDTO;
import br.com.daianebellon.livraria.entity.Livro;

public class LivroConverter {

    public static Livro converterDTO(LivroDTO livroDTO) {
        return Livro.builder()
                .nome(livroDTO.getNome())
                .descricao(livroDTO.getDescricao())
                .autor(livroDTO.getAutor())
                .dataLancamento(livroDTO.getDataLancamento())
                .valorLivro(livroDTO.getValorLivro())
                .build();
    }

    public static LivroDTO converterLivro(Livro livro) {
        return LivroDTO.builder()
                .id(livro.getId())
                .nome(livro.getNome())
                .descricao(livro.getDescricao())
                .autor(livro.getAutor())
                .dataLancamento(livro.getDataLancamento())
                .valorLivro(livro.getValorLivro())
                .build();
    }


}
