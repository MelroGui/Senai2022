package view;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

import control.ProcessaManutencoes;
import model.Manutencao;
import model.DAO;


public class FormManutencoes extends JFrame implements ActionListener{
	
	private JPanel painel;
	private JLabel Id, data, Equipamento, tempo;
	JLabel custo;
	private JTextField tfId,tfData,tfTempo;
	private JTextField tfCusto;
	private JComboBox<String> equipamento;
	private JTextArea verResultado;
	private JButton cadastrar, buscar, alterar, excluir;
	private int autoId = ProcessaManutencoes.manutencoes.get(ProcessaManutencoes.manutencoes.size() - 1).getId() + 1;
	private String texto = "";
	
	FormManutencoes(){
		setTitle("Tela de usuario");
		setBounds(450, 100, 800, 600);
		painel = new JPanel();
		painel.setBackground(new Color(199, 199, 199));
		setContentPane(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		Id = new JLabel("Id");
		Id.setBounds(20, 55, 120, 30);
		tfId = new JTextField();
		tfId.setBounds(140, 55, 255, 30);
		tfId.setEditable(false);
		tfId.setText("" + autoId );
		//
		data = new JLabel("Data");
		data.setBounds(20, 95, 120, 30);
		tfData = new JTextField();
		tfData.setBounds(140, 95, 255, 30);
		tfData.setEditable(false);
		//
		Equipamento = new JLabel("Equipamento");
		Equipamento.setBounds(20, 130, 120, 30);
		equipamento = new JComboBox<String>(new String[] { "Impressora", "computador", "bra�o hidraulico" });
		equipamento.setBounds(140, 130, 255, 30);
		//
		custo = new JLabel("Custo da hora");
		custo.setBounds(20, 170, 120, 30);
		tfCusto = new JTextField();
		tfCusto.setBounds(140, 170, 255, 30);
		//
		tempo = new JLabel("Tempo(em horas)");
		tempo.setBounds(20, 210, 120, 30);
		tfTempo = new JTextField();
		tfTempo.setBounds(140, 210, 255, 30);
		
		cadastrar = new JButton("Cadastrar");
		buscar = new JButton("Buscar");
		alterar = new JButton("Alterar");
		excluir = new JButton("Apagar");
		cadastrar.setBounds(500, 55, 110, 30);
		buscar.setBounds(500, 100, 110, 30);
		excluir.setBounds(500, 150, 110, 30);
		excluir.setEnabled(false);
		alterar.setBounds(500, 200, 110, 30);

		cadastrar.addActionListener(this);
		alterar.addActionListener(this);
		buscar.addActionListener(this);
		excluir.addActionListener(this);
		
		verResultado = new JTextArea();
		verResultado.setBounds(10, 280, 760, 250);
		verResultado.setEnabled(true);
		verResultado.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		preencherAreaDeTexto();
		verResultado.setEnabled(false);
		
		painel.add(Id);
		painel.add(tfId);
		
		painel.add(data);
		painel.add(tfData);
		
		painel.add(custo);
		painel.add(tfCusto);
		
		painel.add(tempo);
		painel.add(tfTempo);
		
		painel.add(Equipamento);
		painel.add(equipamento);
		
		painel.add(cadastrar);
		painel.add(alterar);
		painel.add(excluir);
		painel.add(buscar);
		painel.add(verResultado);
		
	}
	
	int obterEquipamento(String equipamento) {
		switch (equipamento) {
		case "impressora":
			return 0;
		case "computador":
			return 1;
		case "bra�o hidraulico":
			return 2;
		default:
			return -1;
		}
	}
	
	private void limparCampos() {
		tfTempo.setText(null);
		tfData.setText(null);
		tfCusto.setText(null);
	}
	
	private void cadastrar() {
		
		String data = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
		
		if (tfCusto.getText().length() !=0 && tfTempo.getText().length() !=0) {
			
			ProcessaManutencoes.manutencoes.add(new Manutencao(autoId , data, equipamento.getSelectedItem().toString(),
					Double.parseDouble(tfCusto.getText().toString()),Double.parseDouble(tfTempo.getText())));
		} else {
			JOptionPane.showMessageDialog(this, "Favor Preencher todos as informa��es");
		}
		
		autoId++;
		limparCampos();
		preencherAreaDeTexto();
		ProcessaManutencoes.salvar();
	}
	
	private void buscar() {
		String entrada = JOptionPane.showInputDialog(this,"Digite o id da Manuten��o");

		boolean isNumeric = true;
		if (entrada != null) {
			for (int i = 0; i < entrada.length(); i++) {
				if (!Character.isDigit(entrada.charAt(i))) {
					isNumeric = false;
				}
			}
		}else {
			isNumeric = false;
		}
		if (isNumeric) {
			int id = Integer.parseInt(entrada);
			
			boolean achou = false;
			for (Manutencao manutencao : ProcessaManutencoes.manutencoes) {
				if (manutencao.getId() == id) {
					achou = true;
					int indice = ProcessaManutencoes.manutencoes.indexOf(manutencao);
					tfId.setText(ProcessaManutencoes.manutencoes.get(indice).getId("s"));
					tfData.setText(ProcessaManutencoes.manutencoes.get(indice).getData());
					equipamento.setSelectedIndex(obterEquipamento(ProcessaManutencoes.manutencoes.get(indice).getEquipamento()));
					tfCusto.setText(ProcessaManutencoes.manutencoes.get(indice).getCustoHora("s"));
					tfTempo.setText(ProcessaManutencoes.manutencoes.get(indice).getTempoGasto("s"));
					ProcessaManutencoes.salvar();
					cadastrar.setEnabled(false);
					alterar.setEnabled(true);
					excluir.setEnabled(true);
					break;
				}
			}
			
			if (!achou) {
				JOptionPane.showMessageDialog(this, "n�o encontrado");
			}
				
			
		}

	}
	
	private void alterar() {
		
		String data = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
		
		int id = Integer.parseInt(tfId.getText());
		int indice = -1;
		
		for (Manutencao manu : ProcessaManutencoes.manutencoes) {
			indice = ProcessaManutencoes.manutencoes.indexOf(manu);
		}
		
		if (tfCusto.getText().length() !=0 && tfTempo.getText().length() !=0) {

			ProcessaManutencoes.manutencoes.set(indice, new Manutencao(id, data, equipamento.getSelectedItem().toString(),
					Double.parseDouble(tfCusto.getText().replace(",", ".")),Double.parseDouble(tfTempo.getText().replace(",", "."))));
			preencherAreaDeTexto();
			limparCampos();
			
		} else {
			JOptionPane.showMessageDialog(this, "Preencha todos os campos por favor");
		}
		cadastrar.setEnabled(true);
		alterar.setEnabled(false);
		excluir.setEnabled(false);
		tfId.setText(String.format("%d", ProcessaManutencoes.manutencoes.size() + 1));
		ProcessaManutencoes.salvar();
	}
	
	private void excluir() {
		int id = Integer.parseInt(tfId.getText());
		int indice = -1;
		for (Manutencao manu : ProcessaManutencoes.manutencoes) {
			if (manu.getId() == id) {
				indice = ProcessaManutencoes.manutencoes.indexOf(manu);
			}
		}
		
		ProcessaManutencoes.manutencoes.remove(indice);
		preencherAreaDeTexto();
		limparCampos();
		cadastrar.setEnabled(true);
		alterar.setEnabled(false);
		excluir.setEnabled(false);
		ProcessaManutencoes.salvar();
		tfId.setText(String.format("%d", ProcessaManutencoes.manutencoes.size() + 1));
		
	}
	
	private void preencherAreaDeTexto() {
		texto = "";
		
		for (Manutencao manutencao : ProcessaManutencoes.manutencoes) {
			texto += manutencao.toString() + "\n";
		}
		verResultado.setText(texto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cadastrar) {
			cadastrar();
		}
		if (e.getSource() == buscar) {
			buscar();
		}
		
		if (e.getSource() == excluir) {
			excluir();
		}
		
		if (e.getSource() == alterar) {
			alterar();
		}
	}
	
	public static void main(String[] agrs) throws ParseException {

		ProcessaManutencoes.abrir();
		new FormManutencoes().setVisible(true);

	}

}