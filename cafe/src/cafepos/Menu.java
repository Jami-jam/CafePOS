package cafepos;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
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
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JLayeredPane;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Menu() {
		initialize();
		
		LinkedHashMap menu = new LinkedHashMap<>(); 
		menu.put("Americano", 120.0); 
		menu.put("Spanish Latte", 160.0); 
		menu.put("White Mocha", 155.0);
		menu.put("Caramel Macchiato", 165.0);
		
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 768, 1024);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelHot = new JPanel();
		panelHot.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelHot.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panelHot);
		panelHot.setLayout(null);
		
		JLabel lblCaramelM = new JLabel("₱ 165");
		lblCaramelM.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaramelM.setBounds(285, 638, 212, 34);
		panelHot.add(lblCaramelM);
		
		JLabel lblWhiteM = new JLabel("₱ 155");
		lblWhiteM.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhiteM.setBounds(30, 638, 212, 34);
		panelHot.add(lblWhiteM);
		
		JButton btnWhiteM = new JButton("White Mocha");
		btnWhiteM.setBounds(20, 398, 234, 232);
		panelHot.add(btnWhiteM);
		
		JButton btnCaramelM = new JButton("Caramel Macchiato");
		btnCaramelM.setBounds(275, 398, 234, 232);
		panelHot.add(btnCaramelM);
		
		JLabel lblSpanishL = new JLabel("₱ 160");
		lblSpanishL.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpanishL.setBounds(285, 306, 212, 34);
		panelHot.add(lblSpanishL);
		
		JButton btnSpanish = new JButton("Spanish Latte");
		btnSpanish.setBounds(275, 63, 234, 232);
		panelHot.add(btnSpanish);
		
		JButton btnAmericano = new JButton("Americano");
		btnAmericano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAmericano.setBounds(20, 63, 234, 232);
		panelHot.add(btnAmericano);
		
		JLabel lblAmericano = new JLabel("₱ 120");
		lblAmericano.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmericano.setBounds(30, 306, 212, 34);
		panelHot.add(lblAmericano);
		panelHot.setVisible(false);
		
		JPanel panelNon = new JPanel();
		panelNon.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelNon.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panelNon);
		panelNon.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("New label");
		lblNewLabel_1_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_2.setBounds(285, 638, 212, 34);
		panelNon.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("New label");
		lblNewLabel_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_4.setBounds(30, 638, 212, 34);
		panelNon.add(lblNewLabel_1_1_4);
		
		JButton btnNewButton_2_3 = new JButton("New button");
		btnNewButton_2_3.setBounds(20, 398, 234, 232);
		panelNon.add(btnNewButton_2_3);
		
		JButton btnNewButton_1_1_3 = new JButton("New button");
		btnNewButton_1_1_3.setBounds(275, 398, 234, 232);
		panelNon.add(btnNewButton_1_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("New label");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBounds(285, 306, 212, 34);
		panelNon.add(lblNewLabel_1_4);
		
		JButton btnNewButton_1_4 = new JButton("New button");
		btnNewButton_1_4.setBounds(275, 63, 234, 232);
		panelNon.add(btnNewButton_1_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(20, 63, 234, 232);
		panelNon.add(btnNewButton_5);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(30, 306, 212, 34);
		panelNon.add(lblNewLabel_4);
		panelNon.setVisible(false);
		
		JPanel panelPastries = new JPanel();
		panelPastries.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelPastries.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panelPastries);
		panelPastries.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(20, 63, 234, 232);
		panelPastries.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(275, 63, 234, 232);
		panelPastries.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(275, 398, 234, 232);
		panelPastries.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(20, 398, 234, 232);
		panelPastries.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(30, 306, 212, 34);
		panelPastries.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(285, 306, 212, 34);
		panelPastries.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(30, 638, 212, 34);
		panelPastries.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(285, 638, 212, 34);
		panelPastries.add(lblNewLabel_1_1_1);
		panelPastries.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("New label");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setBounds(30, 638, 212, 34);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setBounds(285, 638, 212, 34);
		panel.add(lblNewLabel_1_1_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("New button");
		btnNewButton_1_1_1.setBounds(275, 398, 234, 232);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_1 = new JButton("New button");
		btnNewButton_2_1.setBounds(20, 398, 234, 232);
		panel.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(30, 306, 212, 34);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(20, 63, 234, 232);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("New button");
		btnNewButton_1_2.setBounds(275, 63, 234, 232);
		panel.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(285, 306, 212, 34);
		panel.add(lblNewLabel_1_2);
		panel.setVisible(false);
		
		JButton btnCold = new JButton("Cold");
		btnCold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				panelHot.setVisible(false);
				panelNon.setVisible(false);
				panelPastries.setVisible(false);
				panel_1.setVisible(false);
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panel_1);
		btnCold.setBounds(37, 120, 140, 139);
		frame.getContentPane().add(btnCold);
		
		
		JButton btnHot = new JButton("Hot");
		btnHot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelHot.setVisible(true);
				panel.setVisible(false);
				panelNon.setVisible(false);
				panelPastries.setVisible(false);
				panel_1.setVisible(false);
			}
		});
		btnHot.setBounds(37, 287, 140, 139);
		frame.getContentPane().add(btnHot);
		
		JButton btnPastries = new JButton("Pastries");
		btnPastries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPastries.setVisible(true);
				panel.setVisible(false);
				panelHot.setVisible(false);
				panelNon.setVisible(false);
				panel_1.setVisible(false);
			}
		});
		btnPastries.setBounds(37, 623, 140, 139);
		frame.getContentPane().add(btnPastries);
		
		JButton btnNonCof = new JButton("Non-Coffee");
		btnNonCof.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelNon.setVisible(true);
				panel.setVisible(false);
				panelHot.setVisible(false);
				panelPastries.setVisible(false);
				panel_1.setVisible(false);
			}
		});
		btnNonCof.setBounds(37, 456, 140, 139);
		frame.getContentPane().add(btnNonCof);
		
		JButton btnCont = new JButton("Continue");
		btnCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    Payment rec = new Payment();
			    rec.setVisible(true);
			    frame.dispose();
			}
		});
		btnCont.setBounds(537, 822, 190, 91);
		frame.getContentPane().add(btnCont);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 30));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(10, 11, 167, 98);
		frame.getContentPane().add(lblMenu);
	}

	public void setVisible(boolean b) {
		
		frame.setVisible(b);
		// TODO Auto-generated method stub
		
	}
}
