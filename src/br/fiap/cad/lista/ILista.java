package br.fiap.cad.lista;

import br.fiap.entity.Paciente;

public interface ILista {
	boolean isEmpty();
	void Add(Paciente p);
	boolean Remove(Paciente p);
	String Show();
}
