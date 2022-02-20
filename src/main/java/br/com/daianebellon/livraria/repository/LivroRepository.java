package br.com.daianebellon.livraria.repository;

import br.com.daianebellon.livraria.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    Livro findByNomeAndAutor(String nome, String autor);

    Livro findByNome(String nome);
}
