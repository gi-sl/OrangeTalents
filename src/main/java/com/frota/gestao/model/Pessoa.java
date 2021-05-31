package com.frota.gestao.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Pessoa {
		
	@Id
	private Integer CPF_Pessoa;
	private String nome;
	private String email;
	private String data_nascimento;
	
	
	public Integer getCpf() {
		return CPF_Pessoa;
	}
	public void setCpf(Integer cPF_Pessoa) {
		this.CPF_Pessoa = cPF_Pessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CPF_Pessoa == null) ? 0 : CPF_Pessoa.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (CPF_Pessoa == null) {
			if (other.CPF_Pessoa != null)
				return false;
		} else if (!CPF_Pessoa.equals(other.CPF_Pessoa))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	

}
