package br.usjt.tempo_hibernate;

import java.util.TimeZone;

import javax.annotation.PostConstruct;
import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {
	
	@PostConstruct
	public void started() {
	    TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}
	
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("usjtPU");;
	}
	
	
}