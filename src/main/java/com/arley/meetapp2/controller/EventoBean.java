package com.arley.meetapp2.controller;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.arley.meetapp2.model.Evento;

@Named
@SessionScoped
public class EventoBean implements Serializable{
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("RegistraEventos");
	private static EntityManager em = emf.createEntityManager();
	
	private static final long serialVersionUID = 1L;

	private Evento evento = new Evento();
	
	private List<Evento> eventos = new ArrayList<Evento>();
	
	
	public void adicionarEvento() {
		eventos.add(evento);
		
		//INSERT
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(evento);
		em.getTransaction().commit();
		
		evento = new Evento();
		preencherLista();
		
	}

	public void preencherLista() {		
		em = emf.createEntityManager();
		em.getTransaction().begin();
	
		eventos = em.createQuery("FROM Evento").getResultList();
		
		em.getTransaction().commit();
		em.close();
	}
	
	public void limparLista() {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.createQuery("DELETE FROM Evento").executeUpdate();
		
		em.getTransaction().commit();
		em.close();
		
		preencherLista();
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	
}
