package br.usjt.tempo_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteInsereUsuarioComPerfil {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Dias p = new Dias ();
		manager.persist(p);
		Dias u = new Dias();
		u.setNomeSemana("Segunda");
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
