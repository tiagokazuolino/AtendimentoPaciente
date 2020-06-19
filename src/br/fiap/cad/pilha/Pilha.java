package br.fiap.cad.pilha;

import br.fiap.entity.Paciente;

public class Pilha implements IPilha {
	private int N;
	private Paciente[] pilha;
	private int topo;

	@Override
	public void Init(int value) {
		this.N = value;
		this.pilha = new Paciente[value];
		this.topo = 0;
	}

	@Override
	public boolean isFull() {
		return topo == N ? true : false;
	}

	@Override
	public boolean isEmpty() {
		return topo == 0 ? true : false;
	}

	@Override
	public void Push(Paciente elem) {
		if (!isFull()) {
			pilha[topo] = elem;
			topo++;
		}
	}

	@Override
	public Paciente Pop() {
		if (!isEmpty()) {
			topo--;
			return pilha[topo];
		}
		return null;
	}

	@Override
	public Paciente Top() {
		return !isEmpty() ? pilha[topo - 1] : null;
	}
	
	public Paciente Select(long cpf) {
		Paciente paciente = null;
		for(int i = 0; i< N; i++) {
			if(pilha[i].getCpf() == cpf) {
				paciente = pilha[i];
			} 
		}
		return paciente;
	}
}
