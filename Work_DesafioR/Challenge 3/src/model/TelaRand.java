package model;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaRand extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel label1, label2;
	private JTextField nome, anoNasc;
	private JButton calcularIdade;

	TelaRand() {
		setTitle("Calculando sua Idade");
		setBounds(600, 300, 400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel(); 
		setContentPane(painel); 
		setLayout(null);

		label1 = new JLabel("Qnt. de números que deseja pra gerar:");
		label1.setBounds(20, 20, 100, 20);
		nome = new JTextField();
		nome.setBounds(120, 20, 200, 30);
		label2 = new JLabel(":");
		label2.setBounds(5, 60, 200, 20);
		anoNasc = new JTextField();
		anoNasc.setBounds(120, 60, 200, 30);
		calcularIdade = new JButton("Calcular Idade");
		calcularIdade.setBounds(120, 100, 200, 30);
		calcularIdade.addActionListener(this);

		painel.add(label1);
		painel.add(nome);
		painel.add(label2);
		painel.add(anoNasc);
		painel.add(calcularIdade);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == calcularIdade) {
			int anoN = Integer.parseInt(anoNasc.getText());
			int idade = 2022 - anoN;
			JOptionPane.showMessageDialog(this, nome.getText()+" você tem "+idade+" anos de idade.");
			for (int i=0; i < getContentPane().getComponentCount(); i++) {
                //varre todos os componentes
                Component c = getContentPane().getComponent(i);
                if (c instanceof JTextField) {
                    //apaga os valores
                    JTextField field = (JTextField) c;
                    field.setText("");
                    
                }
            }
		}
	}

	public static void main(String[] args) {
		TelaRand tela = new TelaRand();
		tela.setVisible(true);
	}
}
