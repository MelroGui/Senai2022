package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controllers.ProcessaManutencoes;
import model.Manutencao;

public class TelaRM extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel id, dataM, equipamento, custoH, tempoG, total, rotulos;
	private JTextField tfId, tfDataM, tfCustoH, tfTempoG, tfTotal;
	private JComboBox<String> cbEquipamento;
	private JScrollPane rolagem;
	private JTextArea list;
	private JButton create, read, update, delete;
	
	private int autoId = ProcessaManutencoes.manutencoes.size() + 1;
	private String texto = "";

	private final Locale BRASIL = new Locale("pt", "BR");
	private DecimalFormat decf = new DecimalFormat("#.00");

	TelaRM() {
		setTitle("Formulário de Pets");
		setBounds(100, 100, 800, 600);
		painel = new JPanel();
		setContentPane(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		id = new JLabel("Id:");
		id.setBounds(75 , 20, 120, 30);
		painel.add(id);
		dataM = new JLabel("Data:");
		dataM.setBounds(60, 55, 120, 30);
		painel.add(dataM);
		equipamento = new JLabel("Equipamento:");
		equipamento.setBounds(12, 90, 120, 30);
		painel.add(equipamento);
		custoH = new JLabel("Custo da Hora:");
		custoH.setBounds(5, 125, 120, 30);
		painel.add(custoH);
		tempoG = new JLabel("Tempo Gasto:");
		tempoG.setBounds(10, 165, 120, 30);
		painel.add(tempoG);
		total = new JLabel("Total:");
		total.setBounds(55, 250, 120, 30);
		painel.add(total);
		rotulos = new JLabel("Id | Data | Equipamento | CustoH | TempoG | Total:");
		rotulos.setBounds(20, 310, 500, 30);
		painel.add(rotulos);

		tfId = new JTextField(String.format("%d", autoId));
		tfId.setEditable(false);
		tfId.setBounds(100, 25, 140, 30);
		painel.add(tfId);
		tfDataM = new JTextField();
		tfDataM.setBounds(100, 60, 255, 30);
		painel.add(tfDataM);
		cbEquipamento = new JComboBox<String>(new String[] { "Braço Hidráulico", "Esteira", "Macaco Hidráulico"});
		cbEquipamento.setBounds(100, 95, 255, 30);
		painel.add(cbEquipamento);
		tfCustoH = new JTextField();
		tfCustoH.setBounds(100, 130, 255, 30);
		painel.add(tfCustoH);
		tfTempoG = new JTextField();
		tfTempoG.setBounds(100, 165, 255, 30);
		painel.add(tfTempoG);
		tfTotal = new JTextField();
		tfTotal.setBounds(100, 250, 255, 30);
		painel.add(tfTotal);
		list = new JTextArea();
		list.setEditable(false);
		list.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		preencherAT();
		rolagem = new JScrollPane(list);
		rolagem.setBounds(20, 340, 740, 200);
		painel.add(rolagem);

		create = new JButton("Cadastrar");
		read = new JButton("Buscar");
		update = new JButton("Atualizar");
		delete = new JButton("Excluir");
		create.setBounds(285, 25, 110, 30);
		read.setBounds(405, 25, 110, 30);
		update.setBounds(525, 25, 110, 30);
		delete.setBounds(645, 25, 110, 30);
		update.setEnabled(false);
		delete.setEnabled(false);
		painel.add(create);
		painel.add(read);
		painel.add(update);
		painel.add(delete);

		tfTotal.addActionListener(this);
		cbEquipamento.addActionListener(this);
		create.addActionListener(this);
		read.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);

	}
	
	private double total() {
		double custo, tempo, calcTotal = 0;
		if(tfCustoH.getText().length() != 0 && tfTempoG.getText().length() != 0) {
			custo = Double.parseDouble(tfCustoH.getText());
			tempo = Double.parseDouble(tfTempoG.getText());
			calcTotal = custo * tempo;
		}
		return calcTotal;
	}

	private void cadastrar() {
		if (tfDataM.getText().length() != 0 && tfCustoH.getText().length() != 0
				&& tfTempoG.getText().length() != 0) {

			decf.setCurrency(Currency.getInstance(BRASIL));
			double custo, tempo;
			try {
				custo = Double.parseDouble(decf.parse(tfCustoH.getText()).toString());
				tempo = Double.parseDouble(decf.parse(tfTempoG.getText()).toString());
			} catch (ParseException e) {
				System.out.println(e);
				custo = 0;
				tempo = 0;
			}

			ProcessaManutencoes.manutencoes.add(new Manutencao(autoId, cbEquipamento.getSelectedItem().toString(), tfDataM.getText(),
					custo, tempo));
			autoId++;
			preencherAT();
			limparCampos();
		} else {
			JOptionPane.showMessageDialog(this, "Por Favor, preencher todos os campos.");
		}
	}

	private void limparCampos() {
		tfDataM.setText(null);
		tfCustoH.setText(null);
		tfTempoG.setText(null);
		tfTotal.setText(null);
	}

	private void preencherAT() {
		texto = "";
		for (Manutencao m : ProcessaManutencoes.manutencoes) {
			texto += m.toString();
		}
		list.setText(texto);
	}

	int getIndiceEQ(String especie) {
		switch (especie) {
		case "Braço Hidráulico":
			return 0;
		case "Esteira":
			return 1;
		case "Macaco Hidráulico":
			return 2;
		default:
			return -1;
		}
	}

	private void buscar() {
		String entrada = JOptionPane.showInputDialog(this,"Digite o Id da Manutenção:");

		boolean number = true;
		if (entrada != null) {
			for (int i = 0; i < entrada.length(); i++) {
				if (!Character.isDigit(entrada.charAt(i))) {
					number = false;
				}
			}
		}else {
			number = false;
		}
		if (number) {
			int id = Integer.parseInt(entrada);
			Manutencao manutencao = new Manutencao(id);
			if (ProcessaManutencoes.manutencoes.contains(manutencao)) {
				int indice = ProcessaManutencoes.manutencoes.indexOf(manutencao);
				tfId.setText(ProcessaManutencoes.manutencoes.get(indice).getId("s"));
				cbEquipamento.setSelectedIndex(getIndiceEQ(ProcessaManutencoes.manutencoes.get(indice).getEquipamento()));
				tfDataM.setText(ProcessaManutencoes.manutencoes.get(indice).getDataManu("s"));
				tfCustoH.setText(ProcessaManutencoes.manutencoes.get(indice).getCustoHora("s"));
				tfTempoG.setText(ProcessaManutencoes.manutencoes.get(indice).getTempoGasto("s"));
				tfTotal.setText(ProcessaManutencoes.manutencoes.get(indice).getTotal("s"));
				create.setEnabled(false);
				update.setEnabled(true);
				delete.setEnabled(true);
				ProcessaManutencoes.salvar();
			} else {
				JOptionPane.showMessageDialog(this, "Manutenção não encontrado");
			}
		}

	}

	private void alterar() {
		int id = Integer.parseInt(tfId.getText());
		Manutencao manutencao = new Manutencao(id);
		int indice = ProcessaManutencoes.manutencoes.indexOf(manutencao);
		if (tfDataM.getText().length() != 0 && tfCustoH.getText().length() != 0
				&& tfTempoG.getText().length() != 0 && tfTotal.getText().length() != 0) {

			decf.setCurrency(Currency.getInstance(BRASIL));
			double custo, tempo;
			try {
				custo = Double.parseDouble(decf.parse(tfCustoH.getText()).toString());
				tempo = Double.parseDouble(decf.parse(tfTempoG.getText()).toString());
			} catch (ParseException e) {
				System.out.println(e);
				custo = 0;
				tempo = 0;
			}

			ProcessaManutencoes.manutencoes.add(indice, new Manutencao(id, cbEquipamento.getSelectedItem().toString(), tfDataM.getText(),
					custo, tempo));
			
			preencherAT();
			limparCampos();
		} else {
			JOptionPane.showMessageDialog(this, "Por Favor, preencher todos os campos.");
		}
		create.setEnabled(true);
		update.setEnabled(false);
		delete.setEnabled(false);
		tfId.setText(String.format("%d", autoId));
		ProcessaManutencoes.salvar();
	}

	private void excluir() {
		int id = Integer.parseInt(tfId.getText());
		Manutencao manutencao = new Manutencao(id);
		int indice = ProcessaManutencoes.manutencoes.indexOf(manutencao);
		ProcessaManutencoes.manutencoes.remove(indice);
		preencherAT();
		limparCampos();
		create.setEnabled(true);
		update.setEnabled(false);
		delete.setEnabled(false);
		tfId.setText(String.format("%d", autoId));
		ProcessaManutencoes.salvar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cbEquipamento) {
			cbEquipamento.getSelectedIndex();
		}
		if (e.getSource() == tfTotal) {
			total();
		}
		if (e.getSource() == create) {
			cadastrar();
		}
		if (e.getSource() == read) {
			buscar();
		}
		if (e.getSource() == update) {
			alterar();
		}
		if (e.getSource() == delete) {
			excluir();
		}
	}
	
	public static void main(String[] args) {
		ProcessaManutencoes.abrir();
		new TelaRM().setVisible(true);
	}
}
