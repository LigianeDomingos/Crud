package sistema.telas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import sistema.telas.Login;

public class Inicio extends JPanel {
	
	JLabel labelTitulo;
	
	public Inicio() {
		criarComponentes();
		criarEventos();
	}
	
	private void criarComponentes() {
		labelTitulo = new JLabel("Escolha uma opção no menu superior", JLabel.CENTER);
		labelTitulo.setBounds(20, 100, 660, 40);
		
		add(labelTitulo);
		
		setVisible(true);
	}
	
	private void criarEventos() {
		
	}

}
