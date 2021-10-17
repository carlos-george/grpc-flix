package br.com.til.msuser.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "TB_USER")
public class User {

	@Id
	private String login;
	
	private String name;
	
	private String genre;

}
