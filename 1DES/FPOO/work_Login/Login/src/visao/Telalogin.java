package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controle.UsuarioProcessa;

public class Telalogin extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	// Atributos da tela
	private JPanel painel;
	private JComboBox Especie;
	private JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7, rotulo8;
	private JTextField Id, Raça, Nome, Peso, Nascimento, Dono, Telefone;
	JButton Cadastrar;
	private JButton login;

	Telalogin() {
	    // Propriedades Básicas
	    setTitle("Formulario de Pets");
	    setBounds(600, 300, 550, 500);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    painel = new JPanel(); //Painel de elementos
	    setContentPane(painel); //Configua o painel
	    setLayout(null);

	    // Conteúdos da tela
	    rotulo1 = new JLabel("Id:");
	    rotulo1.setBounds(20, 20, 100, 20);
	    Id = new JTextField();
	    Id.setBounds(120, 20, 200, 30);
	    rotulo2 = new JLabel("Raça:");
	    rotulo2.setBounds(20, 60, 100, 20);
	    Especie = new JComboBox();
	    Especie.setBounds(120, 60, 200, 30);
	    rotulo3 = new JLabel("Nome:");
	    rotulo3.setBounds(20, 90, 100, 20);
	    Raça = new JTextField();
	    Raça.setBounds(120, 90, 200, 30);
	    rotulo4 = new JLabel("Peso:");
	    rotulo4.setBounds(20, 130, 100, 20);
	    Nome = new JTextField();
	    Nome.setBounds(120, 130, 200, 30);
	    rotulo5 = new JLabel("Nascimento:");
	    rotulo5.setBounds(20, 160, 100, 20);
	    Peso = new JTextField();
	    Peso.setBounds(120, 160, 200, 30);
	    rotulo6 = new JLabel("Dono:");
	    rotulo6.setBounds(20, 190, 100, 20);
	    Nascimento = new JTextField();
	    Nascimento.setBounds(120, 190, 200, 30);
	    rotulo7 = new JLabel("Telefone:");
	    rotulo7.setBounds(20, 230, 100, 50);
	    Dono = new JTextField();
	    Dono.setBounds(120, 230, 200, 30);
	    rotulo7 = new JLabel("Telefone:");
	    rotulo7.setBounds(20, 230, 100, 50);
	    Telefone = new JTextField();
	    Telefone.setBounds(120, 230, 200, 30);
	    rotulo8 = new JLabel("Cadastrar"
	    		+ "3."
	    		+ ".+-8/56"
	    		+ ":");
	    rotulo8.setBounds(20, 60, 100, 20);
	    Raça = new JTextField();
	    Raça.setBounds(120, 60, 200, 30);
	    Cadastrar = new JButton("Cadastrar");
	    Cadastrar.setBounds(120, 100, 200, 30);

	    //Habilitando o evento de clicar no botão
	    login.addActionListener(this);

	    //Adicioar todos os elementos no painel
	    painel.add(rotulo1);
	    painel.add(Id);
	    painel.add(rotulo2);
	    painel.add(Especie);
	    painel.add(rotulo3);
	    painel.add(Raça);
	    painel.add(rotulo4);
	    painel.add(Nome);
	    painel.add(rotulo5);
	    painel.add(Peso);
	    painel.add(rotulo6);
	    painel.add(Nascimento);
	    painel.add(rotulo7);
	    painel.add(Dono);
	    painel.add(rotulo8);
	    painel.add(Telefone);
	    painel.add(Cadastrar);
	}

	@
	Override
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == login) {
	        int indice = UsuarioProcessa.checarEmail(Id.getText());
	        if (indice != -1) {
	            if (UsuarioProcessa.checarSenha(indice, Raça.getText())) {
	                JOptionPane.showMessageDialog(this, "Acesso permitido");
	                this.dispose(); // Fecha o Formulário
	            } else {
	                JOptionPane.showMessageDialog(this, "Acesso negado");
	            }
	        } else {
	            JOptionPane.showMessageDialog(this, "Usuário não encontrado");
	        }
	    }
	}

	public static void main(String[] args) {
	    new PetForm().setVisible(true);
	}
}