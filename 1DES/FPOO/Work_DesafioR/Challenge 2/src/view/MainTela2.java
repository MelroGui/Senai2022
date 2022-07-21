package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainTela2  extends JFrame{

	private static final long serialVersionUID = 1L;
	// Atributos da tela
	private JPanel painel;
	private JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5;
	private JTextField nome, nota1, nota2, nota3, nota4;
	private JButton media;

	MainTela2() {
		// Propriedades Básicas
		setTitle("Tela de Notas");
		setBounds(600, 150, 420, 280);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel(); //Painel de elementos
		setContentPane(painel); //Configura o painel
		setLayout(null);

		// Conteúdos da tela
		rotulo1 = new JLabel("Nome:");
		rotulo1.setBounds(20, 20, 100, 20);
		nome = new JTextField();
		nome.setBounds(120, 20, 200, 30);
		rotulo2 = new JLabel("Nota 1:");
		rotulo2.setBounds(20, 60, 150, 20);
		nota1 = new JTextField();
		nota1.setBounds(145, 60, 150, 30);
		rotulo3 = new JLabel("Nota 1:");
		rotulo3.setBounds(20, 100, 150, 20);
		nota2 = new JTextField();
		nota2.setBounds(145, 100, 150, 30);
		rotulo4 = new JLabel("Nota 1:");
		rotulo4.setBounds(20, 140, 150, 20);
		nota3 = new JTextField();
		nota3.setBounds(145, 140, 150, 30);
		media = new JButton("Calcular Media");
		media.setBounds(120, 200, 190, 30);

		//Adicioar todos os elementos no painel
		painel.add(rotulo1);
		painel.add(nome);
		painel.add(rotulo2);
		painel.add(nota1);
		painel.add(rotulo3);
		painel.add(nota2);
		painel.add(rotulo4);
		painel.add(nota3);
		painel.add(media);
	}

	public static void main(String[] args) {
		MainTela2 tela = new MainTela2();
		tela.setVisible(true);
		}
}