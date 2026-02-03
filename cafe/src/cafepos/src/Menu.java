package cafepos.src;
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
	
    private LinkedHashMap<String, Double> order = new LinkedHashMap<>();
    private double total = 0.0;
    private JLabel lblTotal = new JLabel("Total: ₱0.00");
    private LinkedHashMap<String, Double> menu = new LinkedHashMap<>();
    private JTextArea textAreaOrder = new JTextArea(8, 20);
    private JScrollPane scrollPane = new JScrollPane();
		

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
	
	public Menu() {
		initialize();
		  	menu.put("Americano", 120.0);
		  	menu.put("Brewed", 110.0);
		    menu.put("Spanish Latte", 160.0);
		    menu.put("White Mocha", 155.0);
		    menu.put("Caramel Macchiato", 165.0);
		    menu.put("Cafe Latte", 120.0);
		    menu.put("Espresso", 100.0);
		    menu.put("Brewed Coffee", 110.0);
		    menu.put("Classic Chocolate", 120.0);
		    menu.put("Matcha Latte", 170.0);
		    menu.put("Matcha Strawberry", 200.0);
		    menu.put("Strawberry Frappe", 180.0);
		    menu.put("Croissant", 60.0);
		    menu.put("Egg Tart", 70.0);
		    menu.put("Red Velvet Cake", 170.0);
		    menu.put("Chocolate Cookies", 80.0);
		    menu.put("Hazelnut Mocha", 165.0);
		    menu.put("Cafe Latte", 120.0);
		    menu.put("Caramel Macchiato Hot", 125.0);
		    menu.put("Caramel Macchiato Cold", 165.0);
		
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 768, 1024);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		frame.getContentPane().setLayout(null);
		
		JPanel panelCold = new JPanel();
		panelCold.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelCold.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panelCold);
		panelCold.setLayout(null);
		
		JLabel lblWhiteMocha = new JLabel("₱ 155");
		lblWhiteMocha.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhiteMocha.setBounds(30, 638, 212, 34);
		panelCold.add(lblWhiteMocha);
		
		JLabel lblCaramelMC = new JLabel("₱ 165");
		lblCaramelMC.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaramelMC.setBounds(285, 638, 212, 34);
		panelCold.add(lblCaramelMC);
		
		JButton btnCaramelMC = new JButton("Caramel Macchiato");
		btnCaramelMC.setBounds(275, 398, 234, 232);
		panelCold.add(btnCaramelMC);
		btnCaramelMC.addActionListener(e -> addToOrder("Americano", menu.get("Caramel Macchiato Cold")));
		
		JButton btnWhiteMocha = new JButton("White Mocha");
		btnWhiteMocha.setBounds(20, 398, 234, 232);
		panelCold.add(btnWhiteMocha);
		
		JLabel lblAmericano = new JLabel("₱ 120");
		lblAmericano.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmericano.setBounds(30, 306, 212, 34);
		panelCold.add(lblAmericano);
		
		JButton btnAmericano = new JButton("Americano");
		btnAmericano.setBounds(20, 63, 234, 232);
		panelCold.add(btnAmericano);
		
		JButton btnSpanishLatte = new JButton("Spanish Latte");
		btnSpanishLatte.setBounds(275, 63, 234, 232);
		panelCold.add(btnSpanishLatte);
		
		JLabel lblSpanishLatte = new JLabel("₱ 160");
		lblSpanishLatte.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpanishLatte.setBounds(285, 306, 212, 34);
		panelCold.add(lblSpanishLatte);
		panelCold.setVisible(false);
		
		JPanel panelHot = new JPanel();
		panelHot.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelHot.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panelHot);
		panelHot.setLayout(null);
		panelHot.setVisible(false);
		
		JLabel lblCaramelMH = new JLabel("₱ 125");
		lblCaramelMH.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaramelMH.setBounds(285, 638, 212, 34);
		panelHot.add(lblCaramelMH);
		
		JLabel lblEspresso = new JLabel("₱ 100");
		lblEspresso.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspresso.setBounds(30, 638, 212, 34);
		panelHot.add(lblEspresso);
		
		JButton btnEspresso = new JButton("Espresso");
		btnEspresso.setBounds(20, 398, 234, 232);
		panelHot.add(btnEspresso);
		
		JButton btnCaramelMH = new JButton("Caramel Macchiato");
		btnCaramelMH.setBounds(275, 398, 234, 232);
		panelHot.add(btnCaramelMH);
		
		JLabel lblCafeLatte = new JLabel("₱ 120");
		lblCafeLatte.setHorizontalAlignment(SwingConstants.CENTER);
		lblCafeLatte.setBounds(285, 306, 212, 34);
		panelHot.add(lblCafeLatte);
		
		JButton btnCafeLatte = new JButton("CafeLatte");
		btnCafeLatte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCafeLatte.setBounds(275, 63, 234, 232);
		panelHot.add(btnCafeLatte);
		
		JButton btnBrewed = new JButton("Brewed");
		btnBrewed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnBrewed.setBounds(20, 63, 234, 232);
		panelHot.add(btnBrewed);
		
		JLabel lblBrewed = new JLabel("₱ 110");
		lblBrewed.setHorizontalAlignment(SwingConstants.CENTER);
		lblBrewed.setBounds(30, 306, 212, 34);
		panelHot.add(lblBrewed);

		lblTotal.setBounds(537, 768, 190, 30);
		lblTotal.setFont(new Font("Arial", Font.BOLD, 18));
		frame.getContentPane().add(lblTotal);
		scrollPane.setBounds(76, 796, 426, 153);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(scrollPane);
		scrollPane.setViewportView(textAreaOrder);
		textAreaOrder.setEditable(false);
		
		JPanel panelPastries = new JPanel();
		panelPastries.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelPastries.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panelPastries);
		panelPastries.setLayout(null);
		
		JButton btnCroissant = new JButton("Croissant");
		btnCroissant.setBounds(20, 63, 234, 232);
		panelPastries.add(btnCroissant);
		
		JButton btnEggTart = new JButton("Egg Tart");
		btnEggTart.setBounds(275, 63, 234, 232);
		panelPastries.add(btnEggTart);
		
		JButton btnChocoC = new JButton("Chocolate Cookies");
		btnChocoC.setBounds(275, 398, 234, 232);
		panelPastries.add(btnChocoC);
		
		JButton btnRedVelvetC = new JButton("Red Velvet Cake");
		btnRedVelvetC.setBounds(20, 398, 234, 232);
		panelPastries.add(btnRedVelvetC);
		
		JLabel lblCroissant = new JLabel("₱");
		lblCroissant.setHorizontalAlignment(SwingConstants.CENTER);
		lblCroissant.setBounds(30, 306, 212, 34);
		panelPastries.add(lblCroissant);
		
		JLabel lblEggTart = new JLabel("₱");
		lblEggTart.setHorizontalAlignment(SwingConstants.CENTER);
		lblEggTart.setBounds(285, 306, 212, 34);
		panelPastries.add(lblEggTart);
		
		JLabel lblRedVelvetC = new JLabel("₱");
		lblRedVelvetC.setHorizontalAlignment(SwingConstants.CENTER);
		lblRedVelvetC.setBounds(30, 638, 212, 34);
		panelPastries.add(lblRedVelvetC);
		
		JLabel lblChocoC = new JLabel("₱");
		lblChocoC.setHorizontalAlignment(SwingConstants.CENTER);
		lblChocoC.setBounds(285, 638, 212, 34);
		panelPastries.add(lblChocoC);
		panelPastries.setVisible(false);
		
		JPanel panelNon = new JPanel();
		panelNon.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelNon.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panelNon);
		panelNon.setLayout(null);
		
		JLabel lblStrawberryF = new JLabel("₱");
		lblStrawberryF.setHorizontalAlignment(SwingConstants.CENTER);
		lblStrawberryF.setBounds(285, 638, 212, 34);
		panelNon.add(lblStrawberryF);
		
		JLabel lblMatchaS = new JLabel("₱");
		lblMatchaS.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatchaS.setBounds(30, 638, 212, 34);
		panelNon.add(lblMatchaS);
		
		JButton btnMatchaS = new JButton("Matcha Strawberry");
		btnMatchaS.setBounds(20, 398, 234, 232);
		panelNon.add(btnMatchaS);
		
		JButton btnStrawberryF = new JButton("Strawberry Frappe");
		btnStrawberryF.setBounds(275, 398, 234, 232);
		panelNon.add(btnStrawberryF);
		
		JLabel lblMatchaL = new JLabel("₱");
		lblMatchaL.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatchaL.setBounds(285, 306, 212, 34);
		panelNon.add(lblMatchaL);
		
		JButton btnMatchaL = new JButton("Matcha Latte ");
		btnMatchaL.setBounds(275, 63, 234, 232);
		panelNon.add(btnMatchaL);
		
		JButton btnClassicC = new JButton("Classic Chocolate");
		btnClassicC.setBounds(20, 63, 234, 232);
		panelNon.add(btnClassicC);
		
		JLabel lblClassicC = new JLabel("₱ ");
		lblClassicC.setHorizontalAlignment(SwingConstants.CENTER);
		lblClassicC.setBounds(30, 306, 212, 34);
		panelNon.add(lblClassicC);
		panelNon.setVisible(false);
		
		JButton btnCold = new JButton("Cold");
		btnCold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCold.setVisible(true);
				panelHot.setVisible(false);
				panelNon.setVisible(false);
				panelPastries.setVisible(false);
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
				panelCold.setVisible(false);
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
				panelCold.setVisible(false);
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
				panelCold.setVisible(false);
				panelHot.setVisible(false);
				panelPastries.setVisible(false);
				panel_1.setVisible(false);
			}
		});
		btnNonCof.setBounds(37, 456, 140, 139);
		frame.getContentPane().add(btnNonCof);
		
		JButton btnCont = new JButton("Continue");
		btnCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {{
				    Payment payment = new Payment(total, order);
				    payment.setVisible(true);
				    frame.setVisible(false);  
				}
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

	public void addToOrder(String itemName, double price) {
	    order.put(itemName, order.getOrDefault(itemName, 0.0) + price);
	    total += price;
	    updateDisplay();
	}


	private void updateDisplay() {
	    textAreaOrder.setText("Order:\n");
	    for (String item : order.keySet()) {
	        double itemTotal = order.get(item);
	        int quantity = (int)(itemTotal / menu.get(item));
	        textAreaOrder.append(item + " x" + quantity + " - ₱" + String.format("%.2f", itemTotal) + "\n");
	    }
	    textAreaOrder.append("\nTotal: ₱" + String.format("%.2f", total));
	    lblTotal.setText("Total: ₱" + String.format("%.2f", total));
	}


	public double getTotal() { return total; }
	public LinkedHashMap<String, Double> getOrder() { return order; }
	
	public void setVisible(boolean b) {
		
		frame.setVisible(b);
		// TODO Auto-generated method stub
		
	}
}
