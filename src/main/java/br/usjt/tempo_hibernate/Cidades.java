package br.usjt.tempo_hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "tb_cidades")

public class Cidades {
	@Id
	@GeneratedValue

	private Long id;
	private String nome;
	private double latitude;
	private double longitude;
	
	@ManyToMany
	private List<Dias> cidades;
	
	public List<Dias> getCidades() {
		return cidades;
	}
	public void setCidades(List<Dias> dias) {
		this.cidades = dias;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
}
