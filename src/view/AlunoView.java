package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.AlunoController;

import model.Aluno;
import model.Date;

/**
 * classe para criaçao da janela de cadastro
 * 
 * @author galencar
 * @since 19/02/2020
 * @version 0.1
 *
 */
public class AlunoView {
	// declara variaveis
	private JFrame janela;

	private JLabel lblNome;
	private JLabel lblMatricula;
	private JLabel lblDataNascimento;
	private JLabel lblRg;
	private JLabel lblCpf;
	private JLabel lblEndereco;
	private JLabel lblTelefone;
	private JLabel lblSenha;
	private JLabel lblSexo;
	private JLabel informaçoesDoEndereco;
	private JLabel informaçoesDoAluno;

	private JLabel lblLogradouro;
	private JLabel lblNumero;
	private JLabel lblComplemento;
	private JLabel lblBairro;
	private JLabel lblCep;
	private JLabel lblEstado;
	private JLabel lblCidade;

	private JRadioButton rbtMasculino;
	private JRadioButton rbtFemenino;
	private ButtonGroup grpRadio;

	private JTextField campoLogradouro;
	private JTextField campoNumero;
	private JTextField campoComplemento;
	private JTextField campoBairro;
	private JTextField campoCep;

	private JButton btnSalvar;
	private JButton btnCancelar;

	private JTextField campoTelefone;
	private JTextField campoNome;
	private JTextField campoMatricula;
	private JTextField campoDataNascimento;
	private JTextField campoRg;
	private JTextField campoCpf;
	private JPasswordField campoSenha;

	private JComboBox estado;
	private JComboBox Cidade;

	
	private JPanel painelDaJanela;

	
	public void iniciaGui() {
		janela = new JFrame("Cadastro Do Aluno");

		btnCancelar = new JButton();
		btnSalvar = new JButton();
		
		lblNome = new JLabel();
		lblMatricula = new JLabel();
		lblSexo = new JLabel();
		lblRg = new JLabel();
		lblCpf = new JLabel();
		lblTelefone = new JLabel();
		lblDataNascimento = new JLabel();
		lblSenha = new JLabel();
		informaçoesDoAluno = new JLabel(
				"________________________________________________informaçoes do Aluno _____________________________________________________________________ ");
		informaçoesDoEndereco = new JLabel(
				"______________________________________________ informaçoes de Endereço _____________________________________________________________________ ");
		lblLogradouro = new JLabel();
		lblNumero = new JLabel();
		lblComplemento = new JLabel();
		lblBairro = new JLabel();
		lblCep = new JLabel();
		lblEstado = new JLabel();
		lblCidade = new JLabel();

		rbtMasculino = new JRadioButton();
		rbtFemenino = new JRadioButton();

		campoCep = new JTextField();
		campoBairro = new JTextField();
		campoComplemento = new JTextField();
		campoNumero = new JTextField();
		campoSenha = new JPasswordField();
		campoTelefone = new JTextField();
		campoNome = new JTextField();
		campoMatricula = new JTextField();
		campoRg = new JTextField();
		campoCpf = new JTextField();
		campoDataNascimento = new JTextField();
		campoLogradouro = new JTextField();
		painelDaJanela = (JPanel) janela.getContentPane();

		estado = new JComboBox();
		Cidade = new JComboBox();

		grpRadio = new ButtonGroup();
		
		
		// cria grupo de botoes

		grpRadio.add(rbtMasculino);
		grpRadio.add(rbtFemenino);
		
		//trocacor
		
		lblCidade.setForeground(Color.WHITE);
		lblComplemento.setForeground(Color.WHITE);
		lblCpf.setForeground(Color.WHITE);
		lblDataNascimento.setForeground(Color.WHITE);
		lblBairro.setForeground(Color.WHITE);
		lblEstado.setForeground(Color.WHITE);
		lblLogradouro.setForeground(Color.WHITE);
		lblMatricula.setForeground(Color.WHITE);
		lblNome.setForeground(Color.WHITE);
		lblNumero.setForeground(Color.WHITE);
		lblRg.setForeground(Color.WHITE);
		lblSenha.setForeground(Color.WHITE);
		lblSexo.setForeground(Color.WHITE);
		lblTelefone.setForeground(Color.WHITE);
		lblCep.setForeground(Color.WHITE);
		informaçoesDoAluno.setForeground(Color.WHITE);
		informaçoesDoEndereco.setForeground(Color.WHITE);
		
		
		
		
		rbtMasculino.setForeground(Color.WHITE);
		rbtMasculino.setBackground(Color.DARK_GRAY);
		rbtFemenino.setForeground(Color.WHITE);
		rbtFemenino.setBackground(Color.DARK_GRAY);

		// configuraçoes da label escolha

		lblCidade.setText("Cidade :");
		lblCidade.setBounds(470, 159, 90, 24);

		lblEstado.setText("Estado :");
		lblEstado.setBounds(250, 207, 90, 24);

		lblBairro.setText("Bairro :");
		lblBairro.setBounds(250, 159, 90, 24);

		lblCep.setText("Cep :");
		lblCep.setBounds(250, 183, 90, 24);

		lblComplemento.setText("Complemento:");
		lblComplemento.setBounds(7, 207, 90, 24);

		lblNumero.setText("Numero :");
		lblNumero.setBounds(7, 183, 80, 24);

		informaçoesDoAluno.setBounds(0, 10, 800, 20);
		informaçoesDoEndereco.setBounds(0, 115, 800, 24);

		lblDataNascimento.setText("Dt.nascimento :");
		lblDataNascimento.setBounds(470, 44, 100, 24);

		lblLogradouro.setText("Logradouro :");
		lblLogradouro.setBounds(7, 159, 80, 24);

		lblSenha.setText("Senha :");
		lblSenha.setBounds(470, 69, 90, 24);

		lblNome.setText("Nome :");
		lblNome.setBounds(7, 44, 90, 24);

		lblMatricula.setText("Matricula :");
		lblMatricula.setBounds(7, 69, 90, 24);

		lblRg.setText("RG :");
		lblRg.setBounds(250, 44, 50, 24);

		lblCpf.setText("CPF :");
		lblCpf.setBounds(250, 69, 50, 24);

		lblSexo.setText("sexo :");
		lblSexo.setBounds(7, 94, 90, 24);

		lblTelefone.setText("Telefone :");
		lblTelefone.setBounds(250, 94, 90, 24);

		btnSalvar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String sexo ="";
				if(rbtFemenino.isSelected()) {
				sexo = "F";
			}if(rbtMasculino.isSelected()) {
				sexo = "M";
			}
			
				String estadoS = estado.getSelectedItem().toString();
				
				
				
				String cidadeS =Cidade.getSelectedItem().toString();
				
				AlunoController ac = new AlunoController();

				
        ac.verificarSelecionado(campoNome.getText(),campoMatricula.getText(),sexo,campoRg.getText(),campoCpf.getText(),campoTelefone.getText(), 
		campoDataNascimento.getText(),campoSenha.getText(),campoLogradouro.getText(), campoNumero.getText(),campoComplemento.getText(),campoBairro.getText(), campoCep.getText()
		, estadoS, cidadeS);

        campoBairro.setText(" ");
		campoCep.setText(" ");
		campoComplemento.setText(" ");
		campoCpf.setText(" ");
		campoDataNascimento.setText(" ");
		campoLogradouro.setText(" ");
		campoMatricula.setText(" ");
		campoNome.setText(" ");
		campoNumero.setText(" ");
		campoRg.setText(" ");
		campoSenha.setText(" ");
		campoTelefone.setText(" ");
			}
		});
         
         btnSalvar.setText("Salvar");
         btnSalvar.setBounds(310,250,85,24);
		btnCancelar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				campoBairro.setText(" ");
				campoCep.setText(" ");
				campoComplemento.setText(" ");
				campoCpf.setText(" ");
				campoDataNascimento.setText(" ");
				campoLogradouro.setText(" ");
				campoMatricula.setText(" ");
				campoNome.setText(" ");
				campoNumero.setText(" ");
				campoRg.setText(" ");
				campoSenha.setText(" ");
				campoTelefone.setText(" ");
				
				

			}
		});
		  btnCancelar.setText("Cancelar");
	         btnCancelar.setBounds(400,250,85,24);

		// configuraçoes do combo box

		estado.setSelectedIndex(-1);
		estado.setBounds(310, 210, 150, 20);
		estado.setMaximumRowCount(100);

		Cidade.setSelectedIndex(-1);
		Cidade.setBounds(560, 159, 150, 20);
		Cidade.setMaximumRowCount(100);
		// configura campo

		campoBairro.setBounds(310, 159, 150, 20);
		campoComplemento.setBounds(90, 207, 150, 20);
		campoLogradouro.setBounds(90, 159, 150, 20);
		campoNumero.setBounds(90, 183, 150, 20);
		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("#####-###");
			campoCep = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		campoCep.setBounds(310, 183, 150, 20);
		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("##/##/####");
			campoDataNascimento = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		campoDataNascimento.setBounds(560, 44, 70, 20);
		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("##.###.###-##");
			campoRg = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		campoRg.setBounds(310, 44, 150, 20);

		

		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("(##) #####-####");
			campoTelefone = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		campoTelefone.setBounds(310, 94, 150, 20);

		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("###.###.###/##");
			campoCpf = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		campoCpf.setBounds(310, 69, 150, 20);

		campoSenha.setBounds(560, 69, 70, 20);

		campoNome.setBounds(90, 44, 150, 20);

		campoMatricula.setBounds(90, 69, 150, 20);

		rbtMasculino.setText("Masculino");
		rbtMasculino.setBounds(60, 94, 83, 24);

		rbtFemenino.setText("Femenino");
		rbtFemenino.setBounds(140, 94, 85, 24);

		// configuracoes do painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.setBorder(BorderFactory.createLoweredBevelBorder());

		painelDaJanela.add(lblNome);
		painelDaJanela.add(lblMatricula);
		painelDaJanela.add(lblSexo);
		painelDaJanela.add(lblTelefone);
		painelDaJanela.add(lblRg);
		painelDaJanela.add(lblCpf);
		painelDaJanela.add(lblDataNascimento);
		painelDaJanela.add(lblSenha);
		painelDaJanela.add(informaçoesDoEndereco);
		painelDaJanela.add(informaçoesDoAluno);
		painelDaJanela.add(lblLogradouro);
		painelDaJanela.add(lblNumero);
		painelDaJanela.add(lblComplemento);
		painelDaJanela.add(lblBairro);
		painelDaJanela.add(lblCep);
		painelDaJanela.add(lblEstado);
		painelDaJanela.add(lblCidade);
          
		painelDaJanela.add(btnSalvar);
		painelDaJanela.add(btnCancelar);
		
		painelDaJanela.add(estado);
		painelDaJanela.add(Cidade);

		painelDaJanela.add(campoCep);
		painelDaJanela.add(campoBairro);
		painelDaJanela.add(campoComplemento);
		painelDaJanela.add(campoNumero);
		painelDaJanela.add(campoTelefone);
		painelDaJanela.add(campoLogradouro);
		painelDaJanela.add(campoNome);
		painelDaJanela.add(campoRg);
		painelDaJanela.add(campoCpf);
		painelDaJanela.add(campoMatricula);
		painelDaJanela.add(campoDataNascimento);
		painelDaJanela.add(campoSenha);
		painelDaJanela.add(rbtMasculino);
		painelDaJanela.add(rbtFemenino);
		painelDaJanela.setBackground(Color.DARK_GRAY);
		// configutacoes da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela.setSize(800, 350);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);

	}

	
	}


