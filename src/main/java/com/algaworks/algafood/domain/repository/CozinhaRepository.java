package com.algaworks.algafood.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.algafood.domain.model.Cozinha;

import java.util.List;
import java.util.Optional;

@Repository
public interface CozinhaRepository extends JpaRepository<Cozinha, Long> {

	//List<Cozinha> findQualquerCoisaByNome(String nome);
	//List<Cozinha> findCozinhasByNome(String nome);
	List<Cozinha> findTodasByNome(String nome);

	Optional<Cozinha> findByNome(String nome);

}
