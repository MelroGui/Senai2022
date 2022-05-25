package view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaAluno extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel label1, label2, label3, label4;
	private JTextField nome, nota1, nota2, nota3;
	private JButton media;

	TelaAluno() {
		setTitle("Calculando sua Média");
		setBounds(750, 300, 400, 275);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel(); 
		setContentPane(painel); 
		setLayout(null);

		label1 = new JLabel("Nome:");
		label1.setBounds(75, 20, 100, 20);
		nome = new JTextField();
		nome.setBounds(120, 20, 200, 30);
		label2 = new JLabel("Nota 1:");
		label2.setBounds(75, 60, 200, 20);
		nota1 = new JTextField();
		nota1.setBounds(120, 60, 200, 30);
		label3 = new JLabel("Nota 2:");
		label3.setBounds(75, 100, 200, 20);
		nota2 = new JTextField();
		nota2.setBounds(120, 100, 200, 30);
		label4 = new JLabel("Nota 3:");
		label4.setBounds(75, 140, 200, 20);
		nota3 = new JTextField();
		nota3.setBounds(120, 140, 200, 30);
		media = new JButton("Calcular Idade");
		media.setBounds(120, 200, 200, 30);
		media.addActionListener(this);

		painel.add(label1);
		painel.add(nome);
		painel.add(label2);
		painel.add(nota1);
		painel.add(label3);
		painel.add(nota2);
		painel.add(label4);
		painel.add(nota3);
		painel.add(media);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == media) {
			float notaM1 = Float.parseFloat(nota1.getText());
			float notaM2 = Float.parseFloat(nota2.getText());
			float notaM3 = Integer.parseInt(nota3.getText());
			float media = (notaM1 + notaM2 + notaM3) / 3;
			
			JOptionPane.showMessageDialog(this, String.format(nome.getText()+" a sua média é: %.1f", media));
			//Laço pra limpar todas as TextBox
			for (int i=0; i < getContentPane().getComponentCount(); i++) {
                //Varre todos os componentes
                Component c = getContentPane().getComponent(i);
                if (c instanceof JTextField) {
                    //Apaga os valores
                    JTextField field = (JTextField) c;
                    field.setText("");
                    
                }
            }
		}
	}

	public static void main(String[] args) {
		TelaAluno tela = new TelaAluno();
		tela.setVisible(true);
	}
}
