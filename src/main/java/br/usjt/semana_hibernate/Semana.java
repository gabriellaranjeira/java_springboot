package br.usjt.semana_hibernate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.usjt.tempo_hibernate.Dias;


public class Semana {
	@OneToOne
	@JoinColumn (name = "Dias_Semana")
	private Dias dias;
	
	public Dias getPerfil() {
		return dias;
	}
	
	public void setPerfil(Dias dias) {
		this.dias = dias;

	}
}
