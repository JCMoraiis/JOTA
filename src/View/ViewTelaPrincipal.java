package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import Controller.teste;
import Model.Ebook;

public class ViewTelaPrincipal {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTelaPrincipal window = new ViewTelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewTelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblJotaSua = new JLabel("JOTA - Sua loja de livros.");
		lblJotaSua.setBounds(140, 27, 166, 14);
		frame.getContentPane().add(lblJotaSua);
		
		JLabel lblEscolhaUmaOpo = new JLabel("Escolha uma op\u00E7\u00E3o para prosseguir.");
		lblEscolhaUmaOpo.setBounds(122, 67, 208, 14);
		frame.getContentPane().add(lblEscolhaUmaOpo);
		
		JButton btnCadastrarProduto = new JButton("Cadastrar");
		btnCadastrarProduto.setBounds(10, 116, 118, 23);
		frame.getContentPane().add(btnCadastrarProduto);
		
		JButton btnComprarProduto = new JButton("Comprar");
		btnComprarProduto.setBounds(306, 116, 118, 23);
		frame.getContentPane().add(btnComprarProduto);
		
		JButton btnEditarexcluir = new JButton("Editar/Excluir");
		btnEditarexcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEditarexcluir.setBounds(140, 116, 156, 23);
		frame.getContentPane().add(btnEditarexcluir);
		
		textField = new JTextField();
		textField.setBounds(83, 182, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
