package br.fiap.entity;

public class Paciente extends Pessoa {
	private int idade;
	private int altura;
	private int peso;
	protected Boolean grupoDeRisco;
	protected Boolean sintomas;
	protected Boolean assintomatico;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Paciente(String nome, long cpf, String sexo) {
		super(nome, cpf, sexo);
	}

	public Paciente(String nome, long cpf, String sexo, int idade, int altura, int peso) {
		super(nome, cpf, sexo);
		setIdade(idade);
		setAltura(altura);
		setPeso(peso);
	}
	public Boolean getGrupoDeRisco() {
		return grupoDeRisco;
	}

	public void setGrupoDeRisco(Boolean grupoDeRisco) {
		this.grupoDeRisco = grupoDeRisco;
	}

	public Boolean getSintomas() {
		return sintomas;
	}

	public void setSintomas(Boolean sintomas) {
		this.sintomas = sintomas;
	}

	public Boolean getAssintomatico() {
		return assintomatico;
	}

	public void setAssintomatico(Boolean assintomatico) {
		this.assintomatico = assintomatico;
	}

}
