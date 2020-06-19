package br.fiap.cad.pilha;

import br.fiap.cad.IDataStructure;
import br.fiap.entity.Paciente;

public interface IPilha extends IDataStructure {
	void Push(Paciente elem);
	Paciente Pop();
	Paciente Top();
}
