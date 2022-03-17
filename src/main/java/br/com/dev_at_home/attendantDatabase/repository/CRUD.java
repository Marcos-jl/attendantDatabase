package br.com.dev_at_home.attendantDatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dev_at_home.attendantDatabase.model.Attendant;

public interface CRUD extends JpaRepository<Attendant, Long>{

}
