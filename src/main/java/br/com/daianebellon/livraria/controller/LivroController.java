package br.com.daianebellon.livraria.controller;

import br.com.daianebellon.livraria.dto.LivroDTO;
import br.com.daianebellon.livraria.service.service.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
@RequiredArgsConstructor
public class LivroController {

    public final LivroService livroService;

    @PostMapping
    public LivroDTO cadastrar(@RequestBody LivroDTO livroDTO) {
        return livroService.save(livroDTO);
    }

    @PutMapping
    public LivroDTO update(@RequestBody LivroDTO livroDTO) {
        return livroService.update(livroDTO);
    }

    @GetMapping("/{id}")
    public LivroDTO findById(@PathVariable Long id) {
        return livroService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        livroService.delete(id);
    }

    @GetMapping
    public List<LivroDTO> findAll() {
        return livroService.findAll();
    }

}
