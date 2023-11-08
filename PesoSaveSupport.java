import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class PesoSaveSupport extends JFrame {

    private JPanel contentPane;

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
                // Open ExpensesIncomesTracker.java (you need to implement this method)
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
                    // Launch the PesoSaveLogin (you need to implement this method)
                    openPesoSaveLogin();
                } else {
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
    }

    // Implement the method to open the ExpensesIncomesTracker
    private void openExpensesIncomesTracker() {
        // Replace this with the code to open ExpensesIncomesTracker.java
        // For example:
         ExpensesIncomesTracker expensesIncomesTracker = new ExpensesIncomesTracker();
         expensesIncomesTracker.setVisible(true);
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         int centerX = (screenSize.width - expensesIncomesTracker.getWidth()) / 2;
         int centerY = (screenSize.height - expensesIncomesTracker.getHeight()) / 2;

         expensesIncomesTracker.setLocation(centerX, centerY);
         expensesIncomesTracker.setVisible(true);

    }

    // Implement the method to open the PesoSaveLogin
    private void openPesoSaveLogin() {
        // Replace this with the code to open PesoSaveLogin.java
        // For example:
        PesoSaveLogin pesoSaveLogin = new PesoSaveLogin();
         pesoSaveLogin.setVisible(true);
    }

    private void openLink(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
