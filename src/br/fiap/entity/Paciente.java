package br.fiap.entity;

public class Paciente extends Pessoa {
	private int idade;
	private int altura;
	private int peso;

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

	public Paciente(String nome, long cpf) {
		super(nome, cpf);
	}

	public Paciente(String nome, long cpf, int idade, int altura, int peso) {
		super(nome, cpf);
		setIdade(idade);
		setAltura(altura);
		setPeso(peso);
	}

}
