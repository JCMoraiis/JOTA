package View;
import Model.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class teste {

	private JFrame frame;
	private final Action action = new SwingAction();
	private JTextField textFieldNomeEbook;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teste window = new teste();
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
	public teste() {
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
		
		JLabel lblTeste = new JLabel("Teste");
		lblTeste.setBounds(167, 80, 46, 14);
		frame.getContentPane().add(lblTeste);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setAction(action);
		btnNewButton.setBounds(131, 159, 150, 23);
		frame.getContentPane().add(btnNewButton);
		
		textFieldNomeEbook = new JTextField();
		textFieldNomeEbook.setBounds(152, 105, 86, 20);
		frame.getContentPane().add(textFieldNomeEbook);
		textFieldNomeEbook.setColumns(10);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Teste");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println(textFieldNomeEbook.getText());
			
			;
		}
	}
}
