package cafepos;

import javax.swing.JFrame;
import java.net.URL;
import java.awt.EventQueue;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

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
		btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0)); 
		btnNewButton.setFocusPainted(false);
		URL startUrl = getClass().getResource("/icons/START.png");
		if (startUrl != null) {
			btnNewButton.setIcon(new ImageIcon(startUrl));
		}

		int originalY = 788;
		int bounceDistance = 12;
		btnNewButton.setBounds(256, originalY, 241, 160);

		Timer bounceTimer = new Timer(80, new ActionListener() {
			private int bounceY = 0;
			private boolean bouncingUp = true;

			public void actionPerformed(ActionEvent e) {
				if (bouncingUp) {
					bounceY--;
					if (bounceY <= -bounceDistance) {
						bouncingUp = false;
					}
				} else {
					bounceY++;
					if (bounceY >= 0) {
						bouncingUp = true;
					}
				}
				btnNewButton.setBounds(256, originalY + bounceY, 241, 160);
				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
			}
		});
		bounceTimer.start();

		btnNewButton.addActionListener(e -> {
			Menu mainApp = new Menu();
			mainApp.setVisible(true);
			frame.dispose();
		});

		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Welcome");
		URL welcomeUrl = getClass().getResource("/icons/welcome page (1).png");
		if (welcomeUrl != null) {
			lblNewLabel.setIcon(new ImageIcon(welcomeUrl));
		}
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 765, 985);
		frame.getContentPane().add(lblNewLabel);
	}
}