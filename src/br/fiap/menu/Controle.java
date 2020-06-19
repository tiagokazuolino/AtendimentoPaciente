package br.fiap.menu;

import br.fiap.atendiento.ValidacaoAssintomatico;
import br.fiap.atendiento.ValidacaoGrupoRisco;
import br.fiap.atendiento.ValidacaoSintomas;
import br.fiap.cad.fila.Fila;
import br.fiap.cad.lista.Lista;
import br.fiap.entity.Paciente;
import static javax.swing.JOptionPane.*;

import static java.lang.Long.parseLong;
import static java.lang.Integer.parseInt;

public class Controle {
	public static Paciente cadastrar() {
		return new Paciente(
				showInputDialog("Digite o Nome do Paciente:"),
				parseLong(showInputDialog("Digite o CPF do paciente:")),
				showInputDialog("Digite o Sexo do Paciente:"),
				parseInt(showInputDialog("Digite a Idade do paciente:")),
				parseInt(showInputDialog("Digite a Altura do paciente:")),
				parseInt(showInputDialog("Digite a Peso do paciente:"))
				);
	}

	public static Paciente localizar(Lista lista, long cpf) {
		return lista.Select(cpf);
	}

	public static Paciente localizar(Fila fila, long cpf) {
		return fila.Select(cpf);
	}
	
	public static Paciente Diagnosticar(Paciente p) {
		p.setAssintomatico(new ValidacaoAssintomatico().Validacao());
		p.setGrupoDeRisco(new ValidacaoGrupoRisco().Validacao(p));
		p.setSintomas(new ValidacaoSintomas().Validacao());
		return p;
	}
}
