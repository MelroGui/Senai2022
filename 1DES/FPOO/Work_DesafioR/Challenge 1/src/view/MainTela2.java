package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ProcessaPessoa;

public class MainTela2  extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	// Atributos da tela
	private JPanel painel;
	private JLabel rotulo1, rotulo2;
	private JTextField nome,  nascimento;
	private JButton calc;

	MainTela2() {
		// Propriedades Básicas
		setTitle("Tela de Login");
		setBounds(600, 300, 420, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel(); //Painel de elementos
		setContentPane(painel); //Configua o painel
		setLayout(null);

		// Conteúdos da tela
		rotulo1 = new JLabel("Nome:");
		rotulo1.setBounds(20, 20, 100, 20);
		nome = new JTextField();
		nome.setBounds(120, 20, 200, 30);
		rotulo2 = new JLabel("Ano de nascimento:");
		rotulo2.setBounds(20, 60, 150, 20);
		nascimento = new JTextField();
		nascimento.setBounds(145, 60, 150, 30);
		calc = new JButton("Calcular idade");
		calc.setBounds(120, 100, 200, 30);

		//Adicioar todos os elementos no painel
		painel.add(rotulo1);
		painel.add(nome);
		painel.add(rotulo2);
		painel.add( nascimento);
		painel.add(calc);
	}
	
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == calc) {
	    	int anoN = Integer.parseInt(nascimento.getText());
	    	int idade = 2022 - anoN;
	    	JOptionPane.showMessageDialog(this, "Sua idade é: "+ idade );
	    	}
	    }
	public static void main(String[] args) {
		MainTela2 tela = new MainTela2();
		tela.setVisible(true);
		}
}