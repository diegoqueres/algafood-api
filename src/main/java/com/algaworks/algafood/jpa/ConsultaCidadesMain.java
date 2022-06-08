package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.repository.CidadeRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaCidadesMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CidadeRepository repository = applicationContext.getBean(CidadeRepository.class);
		
		List<Cidade> todosCidades = repository.todas();
		
		for (Cidade cidade : todosCidades) {
			System.out.printf("%d - %s - %s\n",
					cidade.getId(), cidade.getNome(), cidade.getEstado().getNome());
		}
	}
	
}
