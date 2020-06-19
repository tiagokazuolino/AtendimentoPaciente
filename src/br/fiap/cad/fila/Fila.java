package br.fiap.cad.fila;

import br.fiap.entity.Paciente;

public class Fila implements IFila {
	private int N;
	private int ini, fim, cont;
	private Paciente dados[];

	@Override
	public void Init(int value) {
		this.N = value;
		this.ini = this.fim = this.cont = 0;
		dados = new Paciente[N];
	}

	@Override
	public boolean isEmpty() {
		return cont == 0 ? true : false;
	}

	@Override
	public boolean isFull() {
		return cont == N ? true : false;
	}

	@Override
	public boolean Enqueue(Paciente paciente) {
		if (isFull() == false) {
			dados[fim] = paciente;
			fim = (fim + 1) % N;
			cont++;
			return true;
		} else
			return false;
	}

	@Override
	public Paciente Dequeue() {
		if (!isEmpty()) {
			Paciente valor = dados[ini];
			cont--;
			ini = (ini + 1) % N;
			return valor;
		} else
			return null;
	}

	@Override
	public Paciente Fisrt() {
		if(!isEmpty()) {
			return dados[0];
		}
		return null;
	}
	
	public Paciente Select(long cpf) {
		Paciente paciente = null;
		for(int i = 0; i< cont; i++) {
			if(dados[i].getCpf() == cpf) {
				paciente = dados[i];
			} 
		}
		return paciente;
	}
	
	public String Show() {
		String aux = "";
		for(int i = 0; i< cont; i++) {
			aux += dados[i].getNome() + " | " +  dados[i].getCpf() + " | " +  dados[i].getSexo() + " | " + dados[i].getIdade();
			aux += "\n";
		}
		return aux;
	}
}
