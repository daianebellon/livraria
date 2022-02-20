package br.com.daianebellon.livraria.service.service;

import br.com.daianebellon.livraria.dto.LivroDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LivroService {

    LivroDTO save(LivroDTO livro);

    List<LivroDTO> findAll();

    LivroDTO findById(Long id);

    LivroDTO update(LivroDTO livroDTO);

    void delete(Long id);



}
