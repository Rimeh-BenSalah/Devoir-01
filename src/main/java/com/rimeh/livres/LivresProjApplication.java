package com.rimeh.livres;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rimeh.livres.entities.Livre;
import com.rimeh.livres.service.LivreService;

@SpringBootApplication
public class LivresProjApplication implements CommandLineRunner{
	@Autowired
	LivreService livreService;
	public static void main(String[] args) {
		SpringApplication.run(LivresProjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*livreService.saveLivre(new Livre("L'Étranger", "Albert Camus", 22.0, new Date(), "letranger@gmail.com"));
		livreService.saveLivre(new Livre("Madame Bovary", "Gustave Flaubert", 26.0, new Date(), "madamebovary@gmail.com"));
		livreService.saveLivre(new Livre("Candide", "Voltaire", 18.0, new Date(), "candide@gmail.com"));*/
		
	}

}
