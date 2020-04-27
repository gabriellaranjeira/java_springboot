package br.usjt.tempo_hibernate;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class previsoes {
	
		@Id
		@GeneratedValue
		
		private Long id;
		private Date dataHora;
		
		@ManyToOne
		
		private Cidades cidade;
		
		public Date getDataHora() {
		return dataHora;
		}
		public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
		}
		public Long getId() {
		return id;
		}
		public void setId(Long id) {
		this.id = id;
		}
		

}
