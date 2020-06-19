package br.fiap.cad.lista;

import br.fiap.entity.Paciente;

public class Lista implements ILista {
	private class NO {
		Paciente dado;
		NO prox;
	}

	private NO lista = null;

	@Override
	public boolean isEmpty() {
		return lista == null ? true : false;
	}

	@Override
	public void Add(Paciente p) {
		NO novo = new NO();
		novo.dado = p;
		if (isEmpty()) {
			lista = novo;
			novo.prox = null;
		} else if (novo.dado.getIdade() > lista.dado.getIdade()) {
			novo.prox = lista;
			lista = novo;
		} else {
			NO aux = lista;
			boolean achou = false;
			while (aux.prox != null && !achou) {
				if (aux.prox.dado.getIdade() < novo.dado.getIdade()) {
					aux = aux.prox;
				} else {
					achou = true;
				}
			}
			novo.prox = aux.prox;
			aux.prox = novo;
		}
	}

	@Override
	public boolean Remove(Paciente p) {
		boolean ok = false;
		if (!isEmpty()) {
			if (p.equals(lista.dado)) {
				lista = lista.prox;
				ok = true;
			} else {
				NO aux = lista;
				boolean achou = false;
				while (aux.prox != null && !achou) {
					if (!aux.prox.dado.equals(p)) {
						aux = aux.prox;
					} else {
						achou = true;
					}
				}
				if (achou) {
					aux.prox = aux.prox.prox;
					ok = true;
				}
			}
		}
		return ok;
	}

	@Override
	public String Show() {
		String retorno = null;
		NO aux = lista;
		while (aux != null) {
			retorno += aux.dado.getNome() + "\t" +  aux.dado.getCpf() + "\t" +  aux.dado.getSexo() + "\t" + aux.dado.getIdade();
			retorno += "\n";
			aux = aux.prox;
		}
		return retorno;
	}

	public int Count() {
		int c = 0;
		NO aux = lista;
		while (aux != null) {
			c++;
			aux = aux.prox;
		}
		return c;
	}

	public Paciente Select(long cpf) {
		NO aux = lista;
		while (aux != null) {
			if (aux.dado.getCpf() == cpf) {
				return aux.dado;
			}
			aux = aux.prox;
		}
		return null;
	}
}
