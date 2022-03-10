package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

	@EmbeddedId
	private ScorePK id = new ScorePK();	// Chave composta
	private Double value;
	

	// CONSTRUTORES
	public Score() {
	}

	public Score(ScorePK id, Double value) {
		super();
		this.id = id;
		this.value = value;
	}
	
	
	// GETTERS/SETTERS
	public void setMovie(Movie movie) {	// Amarração do movie com o score, seto o movie atravez do scorePK pois ele tem o acesso a classe Movie
		id.setMovie(movie);
	}
	
	public void setUser(User user) {	// Amarração do user com o score, seto o user atravez do scorePK pois ele tem o acesso a classe User
		id.setUser(user);
	}
	
	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
