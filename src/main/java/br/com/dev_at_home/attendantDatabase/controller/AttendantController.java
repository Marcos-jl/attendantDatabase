package br.com.dev_at_home.attendantDatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.dev_at_home.attendantDatabase.model.Attendant;
import br.com.dev_at_home.attendantDatabase.repository.CRUD;

@RestController
@RequestMapping("/atendentes")
public class AttendantController {
	
	@Autowired
	private CRUD repository;
	
	@GetMapping
	public List<Attendant> show(){
		return repository.findAll();
	}
	
	@PostMapping
	public void insert(@RequestBody Attendant attendant) {repository.save(attendant);
	}

	@PutMapping
	public void update(@RequestBody Attendant attendant) {
		repository.save(attendant);
	}

	@DeleteMapping("/{id}")
	public void del(@PathVariable Long id){
		repository.deleteById(id);
	}

	@GetMapping("/{id}")
	public void filter(@PathVariable Long id){
		repository.findById(id);
	}
	

}
