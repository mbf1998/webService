package br.edu.ifpe.recife.labgeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MainServicoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(MainServicoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MainServicoApplication.class);
	}

}
