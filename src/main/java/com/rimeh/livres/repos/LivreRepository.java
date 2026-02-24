package com.rimeh.livres.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rimeh.livres.entities.Livre;
public interface LivreRepository extends JpaRepository<Livre, Long> {

}
