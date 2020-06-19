package br.fiap.principal;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

import br.fiap.cad.fila.Fila;
import br.fiap.cad.lista.Lista;
import br.fiap.entity.Paciente;
import br.fiap.menu.Controle;
import br.fiap.menu.Opcoes;

public class Programa {
	
	private static int opcao = 0;
	private static int leitos = 10;
	private static Fila filaInternacao = new Fila();
	private static Fila filaAtendimento = new Fila();
	private static Lista listaInternacao = new Lista();

	public static void main(String[] args) {
		filaInternacao.Init(leitos * 2);
		filaAtendimento.Init(leitos * 2);
		do {
			opcao = parseInt(showInputDialog(Opcoes.MenuPrincipal()));
			switch (opcao) {
			case 1:
				showMessageDialog(null, filaAtendimento.Enqueue(Controle.cadastrar()) ? "Cadastrado com sucesso!!"
						: "Falha ao cadastrar paciente");
				break;
			case 2:
				if (!filaAtendimento.isEmpty()) {
					Paciente atendimento = Controle.Diagnosticar(filaAtendimento.Dequeue());
					showMessageDialog(null, atendimento.getNome() + "-> Foi retirado da fila.");
					if(atendimento.getSintomas() == true && leitos != 0) {
						listaInternacao.Add(atendimento);
						showMessageDialog(null, atendimento.getNome() + "-> Foi Internado.");
					} else {
						filaInternacao.Enqueue(atendimento);
						showMessageDialog(null, atendimento.getNome() + "-> Esta Aguardando leito.");
					}
				} else {
					showMessageDialog(null, "Fila esta vazia!");
				}
				break;
			case 3:
				if(leitos != 0 && !filaInternacao.isEmpty()) {
					Paciente vaga = filaInternacao.Dequeue();
					listaInternacao.Add(vaga);
					showMessageDialog(null, vaga.getNome() + "-> Foi Internado.");
				} else {
					showMessageDialog(null, "Não ha pacientes para internação!");
				}
				break;
			case 4:
				String textoFilaAtendimento = filaAtendimento.Show();
				showMessageDialog(null, textoFilaAtendimento == "" ? "Fila Vazia" : textoFilaAtendimento);
				break;
			case 5:
				String textoFilaInternacao = filaInternacao.Show();
				showMessageDialog(null, textoFilaInternacao == "" ? "Fila Vazia" : textoFilaInternacao);
				break;
			case 6:
				String textoListaInternacao = listaInternacao.Show();
				showMessageDialog(null, textoListaInternacao == "" ? "Lista Vazia" : textoListaInternacao);
				break;
			default:
				showMessageDialog(null, "Voce digitou umnumero invalido: \n" + opcao);
				break;
			}
		} while (opcao != 7);
	}

}
