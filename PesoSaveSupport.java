import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class PesoSaveSupport extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PesoSaveSupport frame = new PesoSaveSupport();
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
	public PesoSaveSupport() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // Make the frame non-resizable
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculate the center position
        int centerX = (screenSize.width - 1280) / 2;
        int centerY = (screenSize.height - 780) / 2;

        // Set the frame's position and size
        setBounds(centerX, centerY, 1280, 750);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
		contentPane.setLayout(null);
 
		
		
		JLabel lblPesoSaveSupportPic = new JLabel("");
		lblPesoSaveSupportPic.setIcon(new ImageIcon("D:\\Users\\63916\\Downloads\\PesoSaveSupport.png"));
		lblPesoSaveSupportPic.setBounds(-7, 10, 1280, 800);
		contentPane.add(lblPesoSaveSupportPic);
		
		JLabel lblAseron = new JLabel("");
		lblAseron.setBounds(392, 195, 340, 494);
		contentPane.add(lblAseron);
		lblAseron.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Open the Aseron Facebook link
                openLink("https://www.facebook.com/jefferson.aseron");
            }
        });
		
	
		JLabel lblFrancis = new JLabel("");
		lblFrancis.setBounds(789, 195, 334, 494);
		contentPane.add(lblFrancis);
		lblFrancis.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Open the Francis Facebook link
                openLink("https://www.facebook.com/francisarillo");
            }
        });
		
		JLabel lblDashboard = new JLabel("");
		lblDashboard.setBounds(22, 211, 151, 28);
		contentPane.add(lblDashboard);
		lblDashboard.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Open ExpensesIncomesTracker.java
                openExpensesIncomesTracker();
            }
        });

		
		JLabel lblLogout = new JLabel("");
		lblLogout.setBounds(22, 333, 117, 28);
		contentPane.add(lblLogout);
		lblLogout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int choice = JOptionPane.showConfirmDialog(PesoSaveSupport.this, "Would you like to sign out?", "Logout", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    // Launch the PesoSaveLogin
                    openPesoSaveLogin();
                } else {
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
		
		addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(
                        PesoSaveSupport.this,
                        "Do you wish to exit the application?",
                        "Exit Program",
                        JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    dispose(); // Close the window and exit the application.
                } else {
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
		
	}
	
	private void openLink(String url) {
		openLink("https://www.facebook.com/jefferson.aseron");
    }

    private void openExpensesIncomesTracker() {
        // Add code to open ExpensesIncomesTracker.java
    }

    private void openPesoSaveLogin() {
        // Add code to launch the PesoSaveLogin
    }
}


