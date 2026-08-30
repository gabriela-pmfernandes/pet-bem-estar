package Dominio;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tutor {
	@Id
	private Long id;
	private String nome;
	private String telefone;
	
	private List<Animal> animais = new ArrayList<>();
	
	public Tutor() {
	}
	
	public Tutor(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone() {
		this.telefone = telefone;
	}
	public List<Animal> getAnimais(){
		return animais;
	}
	public void adicionarAnimal(Animal animal) {
		animais.add(animal);
		animal.setDono(this);
	}
}
