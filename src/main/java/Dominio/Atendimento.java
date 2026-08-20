package Dominio;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Atendimento {
	@Id
	private Long id;
	private LocalDateTime dataHora;
	private TipoServico tipoServico;
	private SituacaoAtendimento situacao;
	private Animal animal;
	
	public Atendimento() {
	}
	
	public Atendimento(LocalDateTime dataHora, TipoServico tipoServico) {
		this.dataHora = dataHora;
		this.tipoServico = tipoServico;
		this.situacao = situacao.MARCADO;
	}
	 public Long getId() {
		 return id;
	 }
	 public void setId(Long id) {
		 this.id = id;
	 }
	 public LocalDateTime getDataHora() {
		 return dataHora;
	 }
	 public void setDataHora(LocalDateTime dataHora) {
		 this.dataHora = dataHora;
	 }
	 
	 public TipoServico getTipoServico() {
		 return tipoServico;
	 }
	 
	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}
	public SituacaoAtendimento getSituacao() {
		return situacao;
	}
	public void setSituacao(SituacaoAtendimento situacao) {
		this.situacao = situacao;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}
