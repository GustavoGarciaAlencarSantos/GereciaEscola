package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import model.Cidade;

/**
 * Classe para aprender Radio button
 * 
 * @author galencar
 * @since 19/02/2020
 * @version 0.1
 */
public class MenuView {

	private JFrame janela;
	private JMenuBar barraMenu;
	private JMenu menu01;
	private JMenu menu02;

	private JMenuItem itemMenu1;
	private JMenuItem itemMenu2;
	private JMenuItem itemMenu3;
	private JMenuItem itemMenu4;
	private JMenuItem itemMenu5;
	private JMenuItem itemMenu6;
	private JMenuItem itemMenu7;
	private JPanel painelDaJanela;

	public void iniciaGui() {
		// cria as instancias

		janela = new JFrame("menu");
		barraMenu = new JMenuBar();

		menu01 = new JMenu("cadastro");
		menu02 = new JMenu("Registro");

		itemMenu1 = new JMenuItem("Aluno");
		itemMenu2 = new JMenuItem("Funcionario");
		itemMenu3 = new JMenuItem("Cidade");
		itemMenu4 = new JMenuItem("Estado");
		itemMenu1.setBackground(Color.DARK_GRAY);
		itemMenu2.setBackground(Color.DARK_GRAY);
		itemMenu3.setBackground(Color.DARK_GRAY);
		itemMenu4.setBackground(Color.DARK_GRAY);

		itemMenu1.setForeground(Color.WHITE);
		itemMenu2.setForeground(Color.WHITE);
		itemMenu3.setForeground(Color.WHITE);
		itemMenu4.setForeground(Color.WHITE);

		itemMenu6 = new JMenuItem("Aluno");
		itemMenu7 = new JMenuItem("Funcionario");

		itemMenu6.setBackground(Color.DARK_GRAY);
		itemMenu7.setBackground(Color.DARK_GRAY);

		itemMenu6.setForeground(Color.WHITE);
		itemMenu7.setForeground(Color.WHITE);

		painelDaJanela = (JPanel) janela.getContentPane();

		// acrescentar menus na barra de menu
		barraMenu.add(menu01);
		barraMenu.add(menu02);
		menu01.setForeground(Color.WHITE);
		menu02.setForeground(Color.WHITE);
		// acrecentar item de menu nos menus
		menu01.add(itemMenu1);
		menu01.add(itemMenu2);
		menu01.add(itemMenu3);
		menu01.add(itemMenu4);

		menu02.add(itemMenu6);
		menu02.add(itemMenu7);
		// configuracao de item de menu1
		itemMenu1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new AlunoView().iniciaGui();
			}
		});
		
		itemMenu2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new FuncionarioView().iniciaGui();
			}
		});

		itemMenu6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new RelatorioAlunoView().iniciaGui();
			}
		});

		itemMenu3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new CidadeView().iniciaGui();
			}
		});
		itemMenu4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new EstadoView().iniciaGui();
			}
		});
		painelDaJanela.setBackground(Color.DARK_GRAY);
		painelDaJanela.setLayout(null);
		janela.setBackground(Color.BLACK);
		janela.setJMenuBar(barraMenu);
		barraMenu.setBackground(Color.BLACK);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.getBackground();
		janela.setSize(300, 300);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);

	}

}
