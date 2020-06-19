package br.fiap.cad.lista;

import java.util.List;

import br.fiap.entity.Paciente;

public interface ILista {
	boolean isEmpty();
	void Add(Paciente p);
	boolean Remove(Paciente p);
	List<Paciente> Show();
}
