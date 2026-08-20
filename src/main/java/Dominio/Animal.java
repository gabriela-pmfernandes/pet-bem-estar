package Dominio;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Animal {
	private Long id;
	private String nome;
	private Dono dono;
	
	private List<Atendimento> atendimentos = new ArrayList<>();
	
	public Animal() {
		
	}
	public Animal(String nome) {
		this.nome = nome;
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
	public Dono getDono() {
		return dono;
	}
	public void setDono(Dono dono) {
		this.dono = dono;
	}
	public List<Atendimento> getAtendimentos(){
		return atendimentos;
	}
	public void adicionarAtendimento(Atendimento atendimento) {
		atendimentos.add(atendimento);
		atendimento.setAnimal(this);
	} 
	
	
}

