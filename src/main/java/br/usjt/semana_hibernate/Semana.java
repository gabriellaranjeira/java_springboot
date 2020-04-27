package br.usjt.semana_hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.usjt.tempo_hibernate.Cidades;
import br.usjt.tempo_hibernate.Dias;


public class Semana {
	//@OneToOne
	//@JoinColumn (name = "Dias_Semana")
	
	@OneToOne (mappedBy = "Dias")
	private Dias dias;
	private String descricao;
	
	
	
	public Dias getDia() {
		return dias;
	}
	
	public void setDia(Dias dias) {
		this.dias = dias;

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
