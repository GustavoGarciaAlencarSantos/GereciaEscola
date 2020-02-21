package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.AlunoController;

public class CidadeView {

	public void iniciaGui() {
		// definir a tela e sua caracteristicas
		JFrame janela = new JFrame();
		JPanel painelDaJanela = (JPanel) janela.getContentPane();

		janela.setTitle("Cadastra Cidade");

		// definir o componente Jbuttum(botao)
		JButton botao = new JButton();
		botao.setText("Salvar");
		botao.setBounds(160, 120, 90, 20);

		JButton botaoCancelar = new JButton();

		botaoCancelar.setText("Cancelar");
		botaoCancelar.setBounds(50, 120, 90, 20);

		// definir o componente jlabel de rotulo
		JLabel lblnome = new JLabel();
		lblnome.setText("Nome da Cidade:");
		lblnome.setForeground(Color.WHITE);
		lblnome.setBounds(10, 40, 140, 20);

		// criar definir o campo de texto
		JTextField txtnome = new JTextField();

		txtnome.setBounds(150, 40, 100, 20);
		// adicionar os componentes na tela
		painelDaJanela.add(botao);
		painelDaJanela.add(botaoCancelar);
		painelDaJanela.add(lblnome);
		painelDaJanela.add(txtnome);
		painelDaJanela.setBackground(Color.DARK_GRAY);
		// informar a visibilidade da tela

		botaoCancelar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				AlunoController ac = new AlunoController();
				System.exit(0);

			}
		});

		janela.getContentPane().setLayout(null);

		janela.setSize(300, 200);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}

}
