package cafepos.src;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Welcome {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Welcome() {
		initialize();

	}

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(0, 0, 768, 1024);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(SystemColor.menu);
		URL startUrl = getClass().getResource("/resources/icons/START.png");
		if (startUrl != null) {
			btnNewButton.setIcon(new ImageIcon(startUrl));
		}
		btnNewButton.addActionListener(e -> {
			Menu mainApp = new Menu();
			mainApp.setVisible(true);
			frame.dispose();
		});
		btnNewButton.setBounds(256, 788, 241, 160);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Welcome");
	    URL welcomeUrl = getClass().getResource("/resources/icons/welcome page (1).png");
	    if (welcomeUrl != null) {
	        lblNewLabel.setIcon(new ImageIcon(welcomeUrl));
	    }
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel.setBounds(0, 0, 765, 985);
	    frame.getContentPane().add(lblNewLabel);
	
	}
}
