package br.fiap.cad.fila;

import br.fiap.cad.IDataStructure;
import br.fiap.entity.Paciente;

public interface IFila extends IDataStructure {
	boolean Enqueue(Paciente paciente);

	Paciente Dequeue();

	Paciente Fisrt();
}
