package br.com.daianebellon.livraria.service.serviceImpl;

import br.com.daianebellon.livraria.constantes.Constantes;
import br.com.daianebellon.livraria.converter.LivroConverter;
import br.com.daianebellon.livraria.dto.LivroDTO;
import br.com.daianebellon.livraria.entity.Livro;
import br.com.daianebellon.livraria.exceptions.LivroException;
import br.com.daianebellon.livraria.repository.LivroRepository;
import br.com.daianebellon.livraria.service.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroServiceImpl implements LivroService {

    @Autowired
    LivroRepository livroRepository;

    @Override
    @Transactional
    public LivroDTO save(LivroDTO livroDTO) {
        Livro livro = LivroConverter.converterDTO(livroDTO);
        livroRepository.save(livro);
        return LivroConverter.converterLivro(livro);
    }

    @Transactional
    public List<LivroDTO> findAll() {
        List<Livro> livros = livroRepository.findAll();
        return livros.stream().map(LivroConverter::converterLivro)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public LivroDTO findById(Long id) {
        Livro livro = livroRepository.findById(id).orElseThrow(() -> new LivroException(Constantes.NOT_FOUND));
        return LivroConverter.converterLivro(livro);
    }

    @Override
    @Transactional
    public LivroDTO update(LivroDTO livroDTO) {
        Livro livro = livroRepository.findById(livroDTO.getId()).orElseThrow(() -> new LivroException(Constantes.NOT_FOUND));

        livro.setNome(livroDTO.getNome());
        livro.setAutor(livroDTO.getAutor());
        livro.setDescricao(livroDTO.getDescricao());
        livro.setDataLancamento(livroDTO.getDataLancamento());
        livro.setValorLivro(livroDTO.getValorLivro());

        return LivroConverter.converterLivro(livro);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        livroRepository.deleteById(id);
    }
}
