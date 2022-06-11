package com.arley.meetapp2.model;

import java.io.Serializable;

public class Evento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String empresa;
	private String local;
	private String data;
	private String horario;
	private String texto;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public String getLocal() {
		return local;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Evento [nome=" + nome + ", empresa=" + empresa + ", local=" + local + ", data=" + data + ", horario="
				+ horario + "]";
	}
	
	
	

}
