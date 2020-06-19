package br.fiap.atendiento;

import static javax.swing.JOptionPane.*;
import static java.lang.Float.parseFloat;

public class ValidacaoSintomas {
	protected boolean ValidacaoFebre() {
		float valida = parseFloat(showInputDialog(null, "Informe a temperatura corporal do paciente: "));
		return valida < 38.5 ? false : true;
	}

	protected boolean ValidacaoTosse() {
		float valida = parseFloat(
				showInputDialog(null, "Pergunte ao paciente: 'Em uma escala de 0 a 10, qual o grau da sua tosse?' "));
		return valida <= 5 ? false : true;
	}

	protected boolean ValidacaoFaltaAr() {
		float valida = parseFloat(showInputDialog(null,
				"Pergunte ao paciente: 'Em uma escala de 0 a 10, qual o grau da sua falta de ar?' "));
		return valida <= 5 ? false : true;
	}

	protected boolean ValidacaoCalafrio() {
		float valida = parseFloat(
				showInputDialog(null, "Pergunte ao paciente: 'Em uma escala de 0 a 10, qual o grau dos calafrios?' "));
		return valida <= 5 ? false : true;
	}

	protected boolean ValidacaoCansaco() {
		float valida = parseFloat(
				showInputDialog(null, "Pergunte ao paciente: 'Em uma escala de 0 a 10, qual o grau de cansaçoe?' "));
		return valida <= 5 ? false : true;
	}

	public boolean Validacao() {
		int cont = 0;
		int cont2 = 0;
		cont = ValidacaoFebre() ? cont + 1 : cont;
		cont = ValidacaoTosse() ? cont + 1 : cont;
		cont2 = ValidacaoFaltaAr() ? cont2 + 1 : cont2;
		cont2 = ValidacaoCalafrio() ? cont2 + 1 : cont2;
		cont2 = ValidacaoCansaco() ? cont2 + 1 : cont2;
		return cont == 0 || cont2 <= 1 ? false : true;
	}
}
