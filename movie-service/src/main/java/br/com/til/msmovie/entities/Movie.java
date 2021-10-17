package br.com.til.msmovie.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "TB_MOVIE")
public class Movie {

	@Id
	private Integer id;
	
	private String title;
	
	private int year;
	
	private double rating;
	
	private String genre;
	
	
}
