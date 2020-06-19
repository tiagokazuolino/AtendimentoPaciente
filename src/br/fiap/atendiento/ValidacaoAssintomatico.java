package br.fiap.atendiento;

import javax.swing.JOptionPane;

public class ValidacaoAssintomatico {
	protected boolean ValidacaoContato() {
		int valida = JOptionPane.showConfirmDialog(null, "O Paciente teve contato com alguem com Covid-19? ","Selecione uma das opções",JOptionPane.YES_NO_OPTION);
		return valida == 0 ? false : true;
	}
	protected boolean ValidacaoTeste() {
		int valida = JOptionPane.showConfirmDialog(null, "O Paciente ja deu positivo para o teste de Covid-19? ","Selecione uma das opções",JOptionPane.YES_NO_OPTION);
		return valida == 0 ? false : true;
	}
	
	public boolean Validacao() {
		int cont = 0;
		cont = ValidacaoContato() ? cont : cont+1;
		cont = ValidacaoTeste() ? cont : cont+1;
		return cont == 0 ? false : true;
	}
}
