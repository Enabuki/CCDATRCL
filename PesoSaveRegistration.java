import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PesoSaveRegistration extends JFrame {

	private JPanel contentPane;
	private final JLabel lblPesoSaveLogo = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PesoSaveRegistration frame = new PesoSaveRegistration();
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
	public PesoSaveRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 770);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblPesoSaveLogo.setBounds(-7, 10, 1280, 800);
		lblPesoSaveLogo.setIcon(new ImageIcon("D:\\Users\\63916\\Downloads\\PesoSaveRegister.png"));
		contentPane.add(lblPesoSaveLogo);
	}

}
