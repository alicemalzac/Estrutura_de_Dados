package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import visao.PainelPrincipal;
import visao.Visao;



public class ControleDoPainelPrincipal implements ActionListener {
	private Visao Visao;
	
	public void edicao() {
		Visao = new PainelPrincipal(this);
		Visao.mostra();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Sair")) {
			System.exit(0);
		}
		
	}

}
