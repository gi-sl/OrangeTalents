package com.frota.gestao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Marca;
	private String Modelo;
	private Long Ano;
	private Double Valor;
	private Integer CPF_Pessoa;	
	private String Rodizio;
	private Boolean RodizioAtivo;
	
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public Long getAno() {
		return Ano;
	}
	public void setAno(Long ano) {
		Ano = ano;
	}
	public Double getValor() {
		return Valor;
	}
	public void setValor(Double valor) {
		Valor = valor;
	}
	public Integer getCPF_Pessoa() {
		return CPF_Pessoa;
	}
	public void setCPF_Pessoa(Integer cPF_Pessoa) {
		CPF_Pessoa = cPF_Pessoa;
	}
	public String getRodizio() {
		return Rodizio;
	}
	public void setRodizio(String rodizio) {
		Rodizio = rodizio;
	}
	public Boolean getRodizioAtivo() {
		return RodizioAtivo;
	}
	public void setRodizioAtivo(Boolean rodizioAtivo) {
		RodizioAtivo = rodizioAtivo;
	}
	
	
	

}
