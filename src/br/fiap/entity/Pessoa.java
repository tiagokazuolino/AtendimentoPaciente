package br.fiap.entity;

public abstract class Pessoa {
	private String nome;
	private long cpf;

	public Pessoa(String nome, long cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	protected String sexo;

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

}
