package br.fiap.atendiento;

import javax.swing.JOptionPane;

import br.fiap.entity.Paciente;

public class ValidacaoGrupoRisco {
	protected boolean ValidacaoObesidade(float altura, float peso) {
		float imc = peso*(altura*altura);
		return imc <= 30 ? false : true;
	}
	
	protected boolean ValidacaoCardiaco() {
		int valida = JOptionPane.showConfirmDialog(null, "O Paciente possui alguma doen�a card�aca? ","Selecione uma das op��es",JOptionPane.YES_NO_OPTION);
		return valida == 0 ? false : true;
	}
	
	protected boolean ValidacaoDiabete() {
		int valida = JOptionPane.showConfirmDialog(null, "O Paciente � diab�tico? ","Selecione uma das op��es",JOptionPane.YES_NO_OPTION);
		return valida == 0 ? false : true;
	}
	
	protected boolean ValidacaoRespitorio() {
		int valida = JOptionPane.showConfirmDialog(null, "O Paciente possui alguma doen�a respirat�ria? ","Selecione uma das op��es",JOptionPane.YES_NO_OPTION);
		return valida == 0 ? false : true;
	}
	
	protected boolean ValidacaoHipertensao() {
		int valida = JOptionPane.showConfirmDialog(null, "O Paciente � hipertenso (Press�o Alta)? ","Selecione uma das op��es",JOptionPane.YES_NO_OPTION);
		return valida == 0 ? false : true;
	}
	
	protected boolean ValidacaoIdade(int idade) {
		return idade < 59 ? false : true;
	}

	public boolean Validacao(Paciente p) {
		int cont = 0;
		cont = ValidacaoIdade(p.getIdade()) ? cont+1 : cont;
		cont = ValidacaoObesidade(p.getAltura(), p.getPeso()) ? cont+1 : cont;
		cont = ValidacaoCardiaco() ? cont : cont+1;
		cont = ValidacaoDiabete() ? cont : cont+1;
		cont = ValidacaoRespitorio() ? cont : cont+1;
		cont = ValidacaoHipertensao() ? cont : cont+1;
		return cont == 0 ? false : true;
	}
}
