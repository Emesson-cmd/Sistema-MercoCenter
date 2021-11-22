package redimensionartexto;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame implements ActionListener{
	
	JButton btnMensagem;
	JLabel label;
	int mensagemAtual = -1;
	String [] mensagens = { "Flamengo é tricampeão carioca em 2009!"
						   ,"Microsoft resolve tornar Windows Open Source"
						   ,"Governo Federal anuncia redução de carga tributária no país!"
						   ,"Cai o preço do dolar!"
						   ,"Fim da crise econômica mundial!"
						   ,"Acabaram as notícias!"};
	public Janela() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnMensagem = new JButton("Mensagem");
		label = new JLabel("");
		btnMensagem.addActionListener(this);
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(btnMensagem);
		getContentPane().add(label);
		pack();
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		switch (mensagemAtual) {
		case -1:
			mensagemAtual ++;
		default:
			if (mensagemAtual >= mensagens.length) {
				mensagemAtual = -1;
				label.setText("");
			} else {
				label.setText(mensagens[mensagemAtual]);
				mensagemAtual ++;
			}
			break;
		}
		this.pack();
	}
	
	public static void main(String[] args) {
		new Janela();
	}
}