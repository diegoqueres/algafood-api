package com.algaworks.algafood.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.algafood.domain.model.Cozinha;

import java.util.List;
import java.util.Optional;

@Repository
public interface CozinhaRepository extends JpaRepository<Cozinha, Long> {

	//Keywords de query methods: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	//List<Cozinha> findQualquerCoisaByNomeContaining(String nome);
	//List<Cozinha> findCozinhasByNomeContaining(String nome);
	List<Cozinha> findByNomeContaining(String nome);

	Optional<Cozinha> findByNome(String nome);

}
