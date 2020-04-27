package br.usjt.tempo_hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.semana_hibernate.Semana;

public class TesteInsereManyToMany {


	public static void main(String[] args) {
		EntityManager manager= JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		List <Cidades> cidades = new ArrayList <> ();
		Cidades sp = new Cidades();
		
		sp.setNome("São Paulo");
		sp.setLatitude(56468);
		sp.setLongitude(189498);
		manager.persist(sp);
		transaction.commit();
		Cidades rj = new Cidades();
		rj.setNome("Rio de Janeiro");
		rj.setLatitude(186498);
		rj.setLongitude(8498468);
		manager.clear();
		transaction.begin();
		transaction = manager.getTransaction();
		manager.persist(rj);
		transaction.commit();
		Dias u1 = new Dias ();
		Semana semana = new Semana ();
		semana.setDescricao("Sao Paulo");
		semana.setDia(u1);
		u1.setNomeSemana("Segunda");
		List <Dias> dias = new ArrayList <> ();
		dias.add(u1);
		sp.setCidades(dias);
		rj.setCidades(dias);
		manager.clear();
		transaction.begin();
		transaction = manager.getTransaction();
		manager.persist(u1);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
