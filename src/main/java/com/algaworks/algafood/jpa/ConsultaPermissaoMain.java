package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.PermissaoRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaPermissaoMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		PermissaoRepository repository = applicationContext.getBean(PermissaoRepository.class);
		
		List<Permissao> todosPermissoes = repository.todas();
		
		for (Permissao permissao : todosPermissoes) {
			System.out.printf("%d - %s - %s\n",
					permissao.getId(), permissao.getNome(), permissao.getDescricao());
		}
	}
	
}
