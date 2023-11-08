import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class GUIMain extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUIMain frame = new GUIMain();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public GUIMain() {
        setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = (screenSize.width - 1280) / 2;
        int centerY = (screenSize.height - 780) / 2;
        setBounds(centerX, centerY, 1280, 750);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblGUIMain = new JLabel("");
        lblGUIMain.setIcon(new ImageIcon("D:\\Users\\63916\\Downloads\\PesoSaveMain.png"));
        lblGUIMain.setBounds(0, 0, 1280, 770);
        contentPane.add(lblGUIMain);

        JLabel lblLogout = new JLabel("");
        lblLogout.setBounds(29, 304, 121, 42);
        contentPane.add(lblLogout);
        lblLogout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int choice = JOptionPane.showConfirmDialog(
                        GUIMain.this,
                        "Would you like to sign out?",
                        "Logout",
                        JOptionPane.YES_NO_OPTION);

                if (choice == JOptionPane.YES_OPTION) {
                    openPesoSaveLogin();
                }
            }
        });

        JLabel lblSupport = new JLabel("");
        lblSupport.setBounds(29, 239, 121, 36);
        contentPane.add(lblSupport);
        lblSupport.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openPesoSaveSupport();
            }
        });

        JLabel lblDashboard = new JLabel("");
        lblDashboard.setBounds(29, 184, 151, 28);
        contentPane.add(lblDashboard);
        lblDashboard.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openExpensesIncomesTracker();
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(
                        GUIMain.this,
                        "Do you wish to exit the application?",
                        "Exit Program",
                        JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });
    }

    private void openPesoSaveSupport() {
        SwingUtilities.invokeLater(() -> {
            new PesoSaveSupport().setLocationRelativeTo(null);
        });
    }

    private void openExpensesIncomesTracker() {
        SwingUtilities.invokeLater(() -> {
            new ExpensesIncomesTracker().setLocationRelativeTo(null);
        });
    }

    private void openPesoSaveLogin() {
    	SwingUtilities.invokeLater(() -> {
            new PesoSaveLogin().setLocationRelativeTo(null);
    	});
    }
        // Implement the logic to open the login window.
    
}

