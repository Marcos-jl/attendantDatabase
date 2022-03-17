package br.com.dev_at_home.attendantDatabase.model;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Attendant {
	
	@Id
	private Long id;
	private String user;
	private String name;
	private String password;
	private String cpf;
	private String email;
}
