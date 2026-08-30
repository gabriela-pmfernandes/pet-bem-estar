package Dominio;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Tutor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String telefone;
	
	@OneToMany(mappedBy = "tutor")
	private List<Animal> animais = new ArrayList<>();
	
	public Tutor() {
	}
	
	public Tutor(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public void adicionarAnimal(Animal animal){
		animais.add(animal);
		animal.setTutor(this);
	}
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public List<Animal> getAnimais(){
		return animais;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
