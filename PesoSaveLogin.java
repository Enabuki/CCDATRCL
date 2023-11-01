import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class PesoSaveLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PesoSaveLogin frame = new PesoSaveLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PesoSaveLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 770);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPesoSaveLogin = new JLabel("");
		lblPesoSaveLogin.setBounds(-7, 10, 1280, 800);
		lblPesoSaveLogin.setIcon(new ImageIcon("D:\\Users\\63916\\Downloads\\PesoSaveLogin.png"));
		contentPane.add(lblPesoSaveLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(65, 379, 331, 34);
		contentPane.add(passwordField);
		
		JLabel lblCreateAccount = new JLabel("");
		lblCreateAccount.setBounds(220, 520, 188, 47);
		contentPane.add(lblCreateAccount);
	}
}
