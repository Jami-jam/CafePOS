package cafepos.src;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.awt.Color;
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
import java.awt.GridLayout;

import javax.swing.JTextArea;
public class Menu {

	private JFrame frame;
	
    private LinkedHashMap<String, Double> order = new LinkedHashMap<>();
    private double total = 0.0;
    private JLabel lblTotal = new JLabel("Total: ₱0.00");
    private LinkedHashMap<String, Double> menu = new LinkedHashMap<>();
    private JTextArea textAreaOrder = new JTextArea(8, 20);
    private JScrollPane scrollPane = new JScrollPane();
    private LinkedHashMap<String, JButton> minusButtons = new LinkedHashMap<>();
    private LinkedHashMap<String, JButton> removeButtons = new LinkedHashMap<>();
    private String lastClickedItem = "";
		

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
		
		JPanel panelPastries = new JPanel();
		panelPastries.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelPastries.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panelPastries);
		panelPastries.setLayout(null);
		
		///////////////////////////////
		
		// CROISSANT
	
		JButton btnCroissant = new JButton("Croissant");
		btnCroissant.setBounds(20, 63, 234, 232);
		panelPastries.add(btnCroissant);
		btnCroissant.addActionListener(e -> { 
			lastClickedItem = "Croissant";
			addToOrder("Croissant", menu.get("Croissant"));
		});
		
		
		// EGG TART
		
		JButton btnEggTart = new JButton("Egg Tart");
		btnEggTart.setBounds(275, 63, 234, 232);
		panelPastries.add(btnEggTart);
		btnEggTart.addActionListener(e -> { 
			lastClickedItem = "Egg Tart";
			addToOrder("Egg Tart", menu.get("Egg Tart"));
		});
		
		// CHOCO COOKIES
		
		JButton btnChocoC = new JButton("Chocolate Cookies");
		btnChocoC.setBounds(275, 398, 234, 232);
		panelPastries.add(btnChocoC);
		btnChocoC.addActionListener(e -> { 
			lastClickedItem = "Chocolate Cookies";
			addToOrder("Chocolate Cookies", menu.get("Chocolate Cookies"));
		});
		
		
		// RED VELVET CAKE
		
		JButton btnRedVelvetC = new JButton("Red Velvet Cake");
		btnRedVelvetC.setBounds(20, 398, 234, 232);
		panelPastries.add(btnRedVelvetC);
		btnRedVelvetC.addActionListener(e -> { 
			lastClickedItem = "Red Velvet Cake";
			addToOrder("Red Velvet Cake", menu.get("Red Velvet Cake"));
		});
		
		
		///////////////////////////////
		
		JLabel lblCroissant = new JLabel("₱ 60");
		lblCroissant.setHorizontalAlignment(SwingConstants.CENTER);
		lblCroissant.setBounds(30, 306, 212, 34);
		panelPastries.add(lblCroissant);
		
		JLabel lblEggTart = new JLabel("₱ 70");
		lblEggTart.setHorizontalAlignment(SwingConstants.CENTER);
		lblEggTart.setBounds(285, 306, 212, 34);
		panelPastries.add(lblEggTart);
		
		JLabel lblRedVelvetC = new JLabel("₱ 170");
		lblRedVelvetC.setHorizontalAlignment(SwingConstants.CENTER);
		lblRedVelvetC.setBounds(30, 638, 212, 34);
		panelPastries.add(lblRedVelvetC);
		
		JLabel lblChocoC = new JLabel("₱ 80");
		lblChocoC.setHorizontalAlignment(SwingConstants.CENTER);
		lblChocoC.setBounds(285, 638, 212, 34);
		panelPastries.add(lblChocoC);
		panelPastries.setVisible(false);
		
		JPanel universalPanel = new JPanel();
		universalPanel.setBounds(370, 777, 150, 45);
		universalPanel.setOpaque(false);
		universalPanel.setLayout(new GridLayout(1,3));
		frame.getContentPane().add(universalPanel);

		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(Color.GREEN);
		btnPlus.setForeground(Color.WHITE);
		btnPlus.addActionListener(e -> {
		    if (!lastClickedItem.isEmpty() && menu.containsKey(lastClickedItem)) {
		        addToOrder(lastClickedItem, menu.get(lastClickedItem));
		    }
		});
		universalPanel.add(btnPlus);

		JButton btnMinus = new JButton("-");
		btnMinus.setBackground(Color.ORANGE);
		btnMinus.setForeground(Color.WHITE);
		btnMinus.addActionListener(e -> {
		    if (!lastClickedItem.isEmpty()) {
		        removeFromOrder(lastClickedItem);
		    }
		});
		universalPanel.add(btnMinus);

		JButton btnRemove = new JButton("X");
		btnRemove.setBackground(Color.RED);
		btnRemove.setForeground(Color.WHITE);
		btnRemove.addActionListener(e -> {
		    if (!lastClickedItem.isEmpty()) {
		        removeItemCompletely(lastClickedItem);
		    }
		});
		universalPanel.add(btnRemove);
		
		JPanel panelNon = new JPanel();
		panelNon.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelNon.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panelNon);
		panelNon.setLayout(null);
		
		JLabel lblStrawberryF = new JLabel("₱ 180");
		lblStrawberryF.setHorizontalAlignment(SwingConstants.CENTER);
		lblStrawberryF.setBounds(285, 638, 212, 34);
		panelNon.add(lblStrawberryF);
		
		JLabel lblMatchaS = new JLabel("₱ 200");
		lblMatchaS.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatchaS.setBounds(30, 638, 212, 34);
		panelNon.add(lblMatchaS);
		
		///////////////////////////////
		
		// MATCHA STRAWBERRY
		
		JButton btnMatchaS = new JButton("Matcha Strawberry");
		btnMatchaS.setBounds(20, 398, 234, 232);
		panelNon.add(btnMatchaS);
		btnMatchaS.addActionListener(e -> { 
			lastClickedItem = "Matcha Strawberry";
			addToOrder("Matcha Strawberry", menu.get("Matcha Strawberry"));
		});
		
		/*
		 * JButton btnMatchaSMInus = new JButton("-"); btnMatchaSMInus.setBounds(225,
		 * 480, 29, 34); btnMatchaSMInus.setFont(new Font("Arial", Font.BOLD, 7));
		 * panelNon.add(btnMatchaSMInus); btnMatchaSMInus.addActionListener(e ->
		 * removeFromOrder("Matcha Strawberry")); minusButtons.put("Matcha Strawberry",
		 * btnMatchaSMInus);
		 * 
		 * JButton btnMatchaSRemove = new JButton("✕"); btnMatchaSRemove.setBounds(245,
		 * 450, 25, 25); btnMatchaSRemove.setFont(new Font("Arial", Font.BOLD, 14));
		 * btnMatchaSRemove.setForeground(Color.RED);
		 * btnMatchaSRemove.setBackground(Color.WHITE);
		 * btnMatchaSRemove.setEnabled(false); panelNon.add(btnMatchaSRemove);
		 * btnMatchaSRemove.addActionListener(e ->
		 * removeItemCompletely("Matcha Strawberry"));
		 * removeButtons.put("Matcha Strawberry", btnMatchaSRemove);
		 */
		
		
		
		// STRAWBERRY FRAPPE
		
		JButton btnStrawberryF = new JButton("Strawberry Frappe");
		btnStrawberryF.setBounds(275, 398, 234, 232);
		panelNon.add(btnStrawberryF);
		btnStrawberryF.addActionListener(e -> {
		    lastClickedItem = "Strawberry Frappe";
		    addToOrder("Strawberry Frappe", menu.get("Strawberry Frappe"));
		});
		
		/*
		 * JButton btnStrawberryFMINUS = new JButton("-");
		 * btnStrawberryFMINUS.setBounds(483, 480, 29, 34);
		 * btnStrawberryFMINUS.setFont(new Font("Arial", Font.BOLD, 7));
		 * panelNon.add(btnStrawberryFMINUS); btnStrawberryFMINUS.addActionListener(e ->
		 * removeFromOrder("Strawberry Frappe")); minusButtons.put("Strawberry Frappe",
		 * btnStrawberryFMINUS);
		 * 
		 * JButton btnStrawberrtFRemove = new JButton("✕");
		 * btnStrawberrtFRemove.setBounds(503, 450, 25, 25);
		 * btnStrawberrtFRemove.setFont(new Font("Arial", Font.BOLD, 14));
		 * btnStrawberrtFRemove.setForeground(Color.RED);
		 * btnStrawberrtFRemove.setBackground(Color.WHITE);
		 * btnStrawberrtFRemove.setEnabled(false); panelNon.add(btnStrawberrtFRemove);
		 * btnStrawberrtFRemove.addActionListener(e ->
		 * removeItemCompletely("Strawberry Frappe"));
		 * removeButtons.put("Strawberry Frappe", btnStrawberrtFRemove);
		 */
		
			
		// MATCHA LATTE
		
		JButton btnMatchaL = new JButton("Matcha Latte");
		btnMatchaL.setBounds(275, 63, 234, 232);
		panelNon.add(btnMatchaL);
		btnMatchaL.addActionListener(e -> { 
			lastClickedItem = "Matcha Latte";
			addToOrder("Matcha Latte", menu.get("Matcha Latte"));
		});
		
		/*
		 * JButton btnMatchaLMinus = new JButton("-"); btnMatchaLMinus.setBounds(483,
		 * 150, 29, 34); btnMatchaLMinus.setFont(new Font("Arial", Font.BOLD, 7));
		 * panelNon.add(btnMatchaLMinus); btnMatchaLMinus.addActionListener(e ->
		 * removeFromOrder("Matcha Latte")); minusButtons.put("Matcha Latte",
		 * btnMatchaLMinus);
		 * 
		 * JButton btnMatchaLRemove = new JButton("✕"); btnMatchaLRemove.setBounds(503,
		 * 120, 25, 25); btnMatchaLRemove.setFont(new Font("Arial", Font.BOLD, 14));
		 * btnMatchaLRemove.setForeground(Color.RED);
		 * btnMatchaLRemove.setBackground(Color.WHITE);
		 * btnMatchaLRemove.setEnabled(false); panelNon.add(btnMatchaLRemove);
		 * btnMatchaLRemove.addActionListener(e ->
		 * removeItemCompletely("Matcha Latte")); removeButtons.put("Matcha Latte",
		 * btnMatchaLRemove);
		 */
		
		// CLASSIC CHOCOLATE
		
		JButton btnClassicC = new JButton("Classic Chocolate");
		btnClassicC.setBounds(20, 63, 234, 232);
		panelNon.add(btnClassicC);
		btnClassicC.addActionListener(e -> { 
			lastClickedItem = "Classic Chocolate";
			addToOrder("Classic Chocolate", menu.get("Classic Chocolate"));
		});
		
		/*
		 * JButton btnClassicCMinus = new JButton("-"); btnClassicCMinus.setBounds(225,
		 * 150, 29, 34); btnClassicCMinus.setFont(new Font("Arial", Font.BOLD, 7));
		 * panelNon.add(btnClassicCMinus); btnClassicCMinus.addActionListener(e ->
		 * removeFromOrder("Classic Chocolate")); minusButtons.put("Classic Chocolate",
		 * btnClassicCMinus);
		 * 
		 * JButton btnClassicCRemove = new JButton("✕");
		 * btnClassicCRemove.setBounds(245, 120, 25, 25); btnClassicCRemove.setFont(new
		 * Font("Arial", Font.BOLD, 14)); btnClassicCRemove.setForeground(Color.RED);
		 * btnClassicCRemove.setBackground(Color.WHITE);
		 * btnClassicCRemove.setEnabled(false); panelNon.add(btnClassicCRemove);
		 * btnClassicCRemove.addActionListener(e ->
		 * removeItemCompletely("Classic Chocolate"));
		 * removeButtons.put("Classic Chocolate", btnClassicCRemove);
		 */
		
		
		
		
		///////////////////////////////

		
		JLabel lblMatchaL = new JLabel("₱ 170");
		lblMatchaL.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatchaL.setBounds(285, 306, 212, 34);
		panelNon.add(lblMatchaL);
		
		
		JLabel lblClassicC = new JLabel("₱ 120");
		lblClassicC.setHorizontalAlignment(SwingConstants.CENTER);
		lblClassicC.setBounds(30, 306, 212, 34);
		panelNon.add(lblClassicC);
		panelNon.setVisible(false);
		
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
		
		JLabel lblCafeLatte = new JLabel("₱ 120");
		lblCafeLatte.setHorizontalAlignment(SwingConstants.CENTER);
		lblCafeLatte.setBounds(285, 306, 212, 34);
		panelHot.add(lblCafeLatte);
		
		///////////////////////////////
		
		// BREWED
		
		JButton btnBrewed = new JButton("Brewed");
		btnBrewed.setBounds(20, 63, 234, 232);
		panelHot.add(btnBrewed);
		btnBrewed.addActionListener(e -> { 
			lastClickedItem = "Brewed";
			addToOrder("Brewed", menu.get("Brewed"));
		});
		
		/*
		 * JButton btnBrewedMinus = new JButton("-"); btnBrewedMinus.setBounds(225, 150,
		 * 29, 34); btnBrewedMinus.setFont(new Font("Arial", Font.BOLD, 7));
		 * panelHot.add(btnBrewedMinus); btnBrewedMinus.addActionListener(e ->
		 * removeFromOrder("Brewed")); minusButtons.put("Brewed", btnBrewedMinus);
		 * 
		 * JButton btnBrewedRemove = new JButton("✕"); btnBrewedRemove.setBounds(245,
		 * 120, 25, 25); btnBrewedRemove.setFont(new Font("Arial", Font.BOLD, 14));
		 * btnBrewedRemove.setForeground(Color.RED);
		 * btnBrewedRemove.setBackground(Color.WHITE);
		 * btnBrewedRemove.setEnabled(false); panelHot.add(btnBrewedRemove);
		 * btnBrewedRemove.addActionListener(e -> removeItemCompletely("Brewed"));
		 * removeButtons.put("Brewed", btnBrewedRemove);
		 */
		
				
		// CAFE LATTE
				
		JButton btnCafeLatte = new JButton("Cafe Latte");
		btnCafeLatte.setBounds(275, 63, 234, 232); 
		panelHot.add(btnCafeLatte);
		btnCafeLatte.addActionListener(e -> { 
			lastClickedItem = "Cafe Latte";
			addToOrder("Cafe Latte", menu.get("Cafe Latte"));
		});
				
		/*
		 * JButton btnCafeLatteMinus = new JButton("-");
		 * btnCafeLatteMinus.setBounds(483, 150, 29, 34); btnCafeLatteMinus.setFont(new
		 * Font("Arial", Font.BOLD, 7)); panelHot.add(btnCafeLatteMinus);
		 * btnCafeLatteMinus.addActionListener(e -> removeFromOrder("Cafe Latte"));
		 * minusButtons.put("Cafe Latte", btnCafeLatteMinus);
		 * 
		 * JButton btnCafeLatteRemove = new JButton("✕");
		 * btnCafeLatteRemove.setBounds(503, 120, 25, 25);
		 * btnCafeLatteRemove.setFont(new Font("Arial", Font.BOLD, 14));
		 * btnCafeLatteRemove.setForeground(Color.RED);
		 * btnCafeLatteRemove.setBackground(Color.WHITE);
		 * btnCafeLatteRemove.setEnabled(false); panelHot.add(btnCafeLatteRemove);
		 * btnCafeLatteRemove.addActionListener(e ->
		 * removeItemCompletely("Cafe Latte")); removeButtons.put("Cafe Latte",
		 * btnCafeLatteRemove);
		 */
				
				
		// ESPRESSO
				
		JButton btnEspresso = new JButton("Espresso");
		btnEspresso.setBounds(20, 398, 234, 232);
		panelHot.add(btnEspresso);
		btnEspresso.addActionListener(e -> { 
			lastClickedItem = "Espresso";
			addToOrder("Espresso", menu.get("Espresso"));
		});
				
		/*
		 * JButton btnEspressoMInus = new JButton("-"); btnEspressoMInus.setBounds(225,
		 * 480, 29, 34); btnEspressoMInus.setFont(new Font("Arial", Font.BOLD, 7));
		 * panelHot.add(btnEspressoMInus); btnEspressoMInus.addActionListener(e ->
		 * removeFromOrder("Espresso")); minusButtons.put("Espresso", btnEspressoMInus);
		 * 
		 * JButton btnEspressoRemove = new JButton("✕");
		 * btnEspressoRemove.setBounds(245, 450, 25, 25); btnEspressoRemove.setFont(new
		 * Font("Arial", Font.BOLD, 14)); btnEspressoRemove.setForeground(Color.RED);
		 * btnEspressoRemove.setBackground(Color.WHITE);
		 * btnEspressoRemove.setEnabled(false); panelHot.add(btnEspressoRemove);
		 * btnEspressoRemove.addActionListener(e -> removeItemCompletely("Espresso"));
		 * removeButtons.put("Espresso", btnEspressoRemove);
		 */
				
				
		// CARAMEL MACCHIATO HOT
				
		JButton btnCaramelMH = new JButton("Caramel Macchiato Hot");
		btnCaramelMH.setBounds(275, 398, 234, 232);
		panelHot.add(btnCaramelMH);
		btnCaramelMH.addActionListener(e -> { 
			lastClickedItem = "Caramel Macchiato Hot";
			addToOrder("Caramel Macchiato Hot", menu.get("Caramel Macchiato Hot"));
		});
				
		/*
		 * JButton btnCaramelMHMINUS = new JButton("-");
		 * btnCaramelMHMINUS.setBounds(483, 480, 29, 34); btnCaramelMHMINUS.setFont(new
		 * Font("Arial", Font.BOLD, 7)); panelHot.add(btnCaramelMHMINUS);
		 * btnCaramelMHMINUS.addActionListener(e ->
		 * removeFromOrder("Caramel Macchiato Hot"));
		 * minusButtons.put("Caramel Macchiato Hot", btnCaramelMHMINUS);
		 * 
		 * JButton btnCaramelMHRemove = new JButton("✕");
		 * btnCaramelMHRemove.setBounds(503, 450, 25, 25);
		 * btnCaramelMHRemove.setFont(new Font("Arial", Font.BOLD, 14));
		 * btnCaramelMHRemove.setForeground(Color.RED);
		 * btnCaramelMHRemove.setBackground(Color.WHITE);
		 * btnCaramelMHRemove.setEnabled(false); panelHot.add(btnCaramelMHRemove);
		 * btnCaramelMHRemove.addActionListener(e ->
		 * removeItemCompletely("Caramel Macchiato Hot"));
		 * removeButtons.put("Caramel Macchiato Hot", btnCaramelMHRemove);
		 */
				
		///////////////////////////////
				
		JLabel lblBrewed = new JLabel("₱ 110");
		lblBrewed.setHorizontalAlignment(SwingConstants.CENTER);
		lblBrewed.setBounds(30, 306, 212, 34);
		panelHot.add(lblBrewed);
		
		/*
		 * JButton btnCroissantMINUS = new JButton("-");
		 * btnCroissantMINUS.setBounds(225, 150, 29, 34); btnCroissantMINUS.setFont(new
		 * Font("Arial", Font.BOLD, 7)); panelPastries.add(btnCroissantMINUS);
		 * btnCroissantMINUS.addActionListener(e -> removeFromOrder("Croissant"));
		 * minusButtons.put("Croissant", btnCroissantMINUS);
		 * 
		 * JButton btnCroissantRemove = new JButton("✕");
		 * btnCroissantRemove.setBounds(245, 120, 25, 25);
		 * btnCroissantRemove.setFont(new Font("Arial", Font.BOLD, 14));
		 * btnCroissantRemove.setForeground(Color.RED);
		 * btnCroissantRemove.setBackground(Color.WHITE);
		 * btnCroissantRemove.setEnabled(false); panelPastries.add(btnCroissantRemove);
		 * btnCroissantRemove.addActionListener(e -> removeItemCompletely("Croissant"));
		 * removeButtons.put("Croissant", btnCroissantRemove);
		 */
		
		/*
		 * JButton btnEggTartMinus = new JButton("-"); btnEggTartMinus.setBounds(483,
		 * 150, 29, 34); btnEggTartMinus.setFont(new Font("Arial", Font.BOLD, 7));
		 * panelPastries.add(btnEggTartMinus); btnEggTartMinus.addActionListener(e ->
		 * removeFromOrder("Egg Tart")); minusButtons.put("Egg Tart", btnEggTartMinus);
		 * 
		 * JButton btnEggTartRemove = new JButton("✕"); btnEggTartRemove.setBounds(503,
		 * 120, 25, 25); btnEggTartRemove.setFont(new Font("Arial", Font.BOLD, 14));
		 * btnEggTartRemove.setForeground(Color.RED);
		 * btnEggTartRemove.setBackground(Color.WHITE);
		 * btnEggTartRemove.setEnabled(false); panelPastries.add(btnEggTartRemove);
		 * btnEggTartRemove.addActionListener(e -> removeItemCompletely("Egg Tart"));
		 * removeButtons.put("Egg Tart", btnEggTartRemove);
		 */
		
		/*
		 * JButton btnChocoCMINUS = new JButton("-"); btnChocoCMINUS.setBounds(483, 480,
		 * 29, 34); btnChocoCMINUS.setFont(new Font("Arial", Font.BOLD, 7));
		 * panelPastries.add(btnChocoCMINUS); btnChocoCMINUS.addActionListener(e ->
		 * removeFromOrder("Chocolate Cookies")); minusButtons.put("Chocolate Cookies",
		 * btnChocoCMINUS);
		 * 
		 * JButton btnChocoCRemove = new JButton("✕"); btnChocoCRemove.setBounds(503,
		 * 450, 25, 25); btnChocoCRemove.setFont(new Font("Arial", Font.BOLD, 14));
		 * btnChocoCRemove.setForeground(Color.RED);
		 * btnChocoCRemove.setBackground(Color.WHITE);
		 * btnChocoCRemove.setEnabled(false); panelPastries.add(btnChocoCRemove);
		 * btnChocoCRemove.addActionListener(e ->
		 * removeItemCompletely("Chocolate Cookies"));
		 * removeButtons.put("Chocolate Cookies", btnChocoCRemove);
		 */
		
		/*
		 * JButton btnRedVelvetCMInus = new JButton("-");
		 * btnRedVelvetCMInus.setBounds(225, 480, 29, 34);
		 * btnRedVelvetCMInus.setFont(new Font("Arial", Font.BOLD, 7));
		 * panelPastries.add(btnRedVelvetCMInus); btnRedVelvetCMInus.addActionListener(e
		 * -> removeFromOrder("Red Velvet Cake")); minusButtons.put("Red Velvet Cake",
		 * btnRedVelvetCMInus);
		 * 
		 * JButton btnRedVelvetCRemove = new JButton("✕");
		 * btnRedVelvetCRemove.setBounds(245, 450, 25, 25);
		 * btnRedVelvetCRemove.setFont(new Font("Arial", Font.BOLD, 14));
		 * btnRedVelvetCRemove.setForeground(Color.RED);
		 * btnRedVelvetCRemove.setBackground(Color.WHITE);
		 * btnRedVelvetCRemove.setEnabled(false);
		 * panelPastries.add(btnRedVelvetCRemove);
		 * btnRedVelvetCRemove.addActionListener(e ->
		 * removeItemCompletely("Red Velvet Cake"));
		 * removeButtons.put("Red Velvet Cake", btnRedVelvetCRemove);
		 */
		
		JPanel panelCold = new JPanel();
		panelCold.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelCold.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panelCold);
		panelCold.setLayout(null);
		
		///////////////////////////////
		
		// SPANISH LATTE
		
		JButton btnSpanishLatte = new JButton("Spanish Latte");
		btnSpanishLatte.setBounds(275, 63, 234, 232); 
		panelCold.add(btnSpanishLatte);
		btnSpanishLatte.addActionListener(e -> { 
			lastClickedItem = "Spanish Latte";
			addToOrder("Spanish Latte", menu.get("Spanish Latte"));
		});
		
		/*
		 * JButton btnSpanishLatteMinus = new JButton("-");
		 * btnSpanishLatteMinus.setBounds(483, 150, 29, 34);
		 * btnSpanishLatteMinus.setFont(new Font("Arial", Font.BOLD, 7));
		 * panelCold.add(btnSpanishLatteMinus); btnSpanishLatteMinus.addActionListener(e
		 * -> removeFromOrder("Spanish Latte")); minusButtons.put("Spanish Latte",
		 * btnSpanishLatteMinus);
		 * 
		 * JButton btnSpanishLRemove = new JButton("✕");
		 * btnSpanishLRemove.setBounds(503, 120, 25, 25); btnSpanishLRemove.setFont(new
		 * Font("Arial", Font.BOLD, 14)); btnSpanishLRemove.setForeground(Color.RED);
		 * btnSpanishLRemove.setBackground(Color.WHITE);
		 * btnSpanishLRemove.setEnabled(false); panelCold.add(btnSpanishLRemove);
		 * btnSpanishLRemove.addActionListener(e ->
		 * removeItemCompletely("Spanish Latte")); removeButtons.put("Spanish Latte",
		 * btnSpanishLRemove);
		 */
		
		// AMERICANO
		
		JButton btnAmericano = new JButton("Americano");
		btnAmericano.setBounds(20, 63, 234, 232);  
		panelCold.add(btnAmericano);
		btnAmericano.addActionListener(e -> { 
			lastClickedItem = "Americano";
			addToOrder("Americano", menu.get("Americano"));
		});
		
		/*
		 * JButton btnAmericanoMinus = new JButton("-");
		 * btnAmericanoMinus.setBounds(225, 150, 29, 34); btnAmericanoMinus.setFont(new
		 * Font("Arial", Font.BOLD, 7)); panelCold.add(btnAmericanoMinus);
		 * btnAmericanoMinus.addActionListener(e -> removeFromOrder("Americano"));
		 * minusButtons.put("Americano", btnAmericanoMinus);
		 * 
		 * JButton btnAmericanoRemove = new JButton("✕");
		 * btnAmericanoRemove.setBounds(245, 120, 25, 25);
		 * btnAmericanoRemove.setFont(new Font("Arial", Font.BOLD, 14));
		 * btnAmericanoRemove.setForeground(Color.RED);
		 * btnAmericanoRemove.setBackground(Color.WHITE);
		 * btnAmericanoRemove.setEnabled(false); panelCold.add(btnAmericanoRemove);
		 * btnAmericanoRemove.addActionListener(e -> removeItemCompletely("Americano"));
		 * removeButtons.put("Americano", btnAmericanoRemove);
		 */
		
		// WHITE MOCHA
		
		JButton btnWhiteMocha = new JButton("White Mocha");
		btnWhiteMocha.setBounds(20, 398, 234, 232);
		panelCold.add(btnWhiteMocha);
		btnWhiteMocha.addActionListener(e -> { 
			lastClickedItem = "White Mocha";
			addToOrder("White Mocha", menu.get("White Mocha"));
		});
		
		/*
		 * JButton btnWhiteMMInus = new JButton("-"); btnWhiteMMInus.setBounds(225, 480,
		 * 29, 34); btnWhiteMMInus.setFont(new Font("Arial", Font.BOLD, 7));
		 * panelCold.add(btnWhiteMMInus); btnWhiteMMInus.addActionListener(e ->
		 * removeFromOrder("White Mocha")); minusButtons.put("White Mocha",
		 * btnWhiteMMInus);
		 * 
		 * JButton btnWhiteMRemove = new JButton("✕"); btnWhiteMRemove.setBounds(245,
		 * 450, 25, 25); btnWhiteMRemove.setFont(new Font("Arial", Font.BOLD, 14));
		 * btnWhiteMRemove.setForeground(Color.RED);
		 * btnWhiteMRemove.setBackground(Color.WHITE);
		 * btnWhiteMRemove.setEnabled(false); panelCold.add(btnWhiteMRemove);
		 * btnWhiteMRemove.addActionListener(e -> removeItemCompletely("White Mocha"));
		 * removeButtons.put("White Mocha", btnWhiteMRemove);
		 */
		
		// CARAMEL MACCHIATO COLD
		
		JButton btnCaramelMC = new JButton("Caramel Macchiato Cold");
		btnCaramelMC.setBounds(275, 398, 234, 232);
		panelCold.add(btnCaramelMC);
		btnCaramelMC.addActionListener(e -> { 
			lastClickedItem = "Caramel Macchiato Cold";
			addToOrder("Caramel Macchiato Cold", menu.get("Caramel Macchiato Cold"));
		});
		
		/*
		 * JButton btnCaramelMCMINUS = new JButton("-");
		 * btnCaramelMCMINUS.setBounds(483, 480, 29, 34); btnCaramelMCMINUS.setFont(new
		 * Font("Arial", Font.BOLD, 7)); panelCold.add(btnCaramelMCMINUS);
		 * btnCaramelMCMINUS.addActionListener(e ->
		 * removeFromOrder("Caramel Macchiato Cold"));
		 * minusButtons.put("Caramel Macchiato Cold", btnCaramelMCMINUS);
		 * 
		 * JButton btnCaramelMCRemove = new JButton("✕");
		 * btnCaramelMCRemove.setBounds(503, 450, 25, 25);
		 * btnCaramelMCRemove.setFont(new Font("Arial", Font.BOLD, 14));
		 * btnCaramelMCRemove.setForeground(Color.RED);
		 * btnCaramelMCRemove.setBackground(Color.WHITE);
		 * btnCaramelMCRemove.setEnabled(false); panelCold.add(btnCaramelMCRemove);
		 * btnCaramelMCRemove.addActionListener(e ->
		 * removeItemCompletely("Caramel Macchiato Cold"));
		 * removeButtons.put("Caramel Macchiato Cold", btnCaramelMCRemove);
		 */
		
		///////////////////////////////
		
		JLabel lblWhiteMocha = new JLabel("₱ 155");
		lblWhiteMocha.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhiteMocha.setBounds(30, 638, 212, 34);
		panelCold.add(lblWhiteMocha);
		
		JLabel lblCaramelMC = new JLabel("₱ 165");
		lblCaramelMC.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaramelMC.setBounds(285, 638, 212, 34);
		panelCold.add(lblCaramelMC);
		
		
		JLabel lblAmericano = new JLabel("₱ 120");
		lblAmericano.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmericano.setBounds(30, 306, 212, 34);
		panelCold.add(lblAmericano);
		
		JLabel lblSpanishLatte = new JLabel("₱ 160");
		lblSpanishLatte.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpanishLatte.setBounds(285, 306, 212, 34);
		panelCold.add(lblSpanishLatte);
		panelCold.setVisible(false);
		
		JButton btnClearCart = new JButton("Clear Cart");
		btnClearCart.setBounds(358, 840, 170, 35);
		btnClearCart.setFont(new Font("Arial", Font.BOLD, 14));
		btnClearCart.setBackground(Color.GRAY);
		btnClearCart.setForeground(Color.WHITE);
		btnClearCart.addActionListener(e -> clearCart());
		frame.getContentPane().add(btnClearCart);
		
		lblTotal.setBounds(537, 768, 190, 30);
		lblTotal.setFont(new Font("Arial", Font.BOLD, 18));
		frame.getContentPane().add(lblTotal);
		scrollPane.setBounds(50, 796, 300, 153);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(scrollPane);
		scrollPane.setViewportView(textAreaOrder);
		textAreaOrder.setEditable(false);
		
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

	public void removeFromOrder(String itemName) {
	    if (order.containsKey(itemName)) {
	        double price = menu.get(itemName);
	        order.put(itemName, order.get(itemName) - price);
	        total -= price;
	        if (order.get(itemName) <= 0) {
	            order.remove(itemName);
	        }
	        updateDisplay();
	    }
	}
	
	public void removeItemCompletely(String itemName) {
	    if (order.containsKey(itemName)) {
	        double totalPrice = order.get(itemName);
	        total -= totalPrice; 
	        order.remove(itemName);
	        updateDisplay();
	        if (minusButtons.containsKey(itemName)) {
	            minusButtons.get(itemName).setEnabled(false);
	        }
	    }
	}
	
	
	public void addToOrder(String itemName, double price) {
	    order.put(itemName, order.getOrDefault(itemName, 0.0) + price);
	    total += price;
	    updateDisplay();
	}

	private void clearCart() {
	    order.clear();
	    total = 0.0;  
	    updateDisplay();
	}

	private void updateDisplay() {
	    textAreaOrder.setText("Order:\n");
	    for (String item : order.keySet()) {
	        double itemTotal = order.get(item);
	        int quantity = (int)(itemTotal / menu.get(item));
	        textAreaOrder.append(item + " x" + quantity + " - ₱" + String.format("%.2f", itemTotal) + "\n");
	        
	        /*
	        if (quantity <= 1) {
	            minusButtons.get(item).setEnabled(false);
	        } else {
	            minusButtons.get(item).setEnabled(true);
	        }
	        
	        if (removeButtons.containsKey(item)) {
	            removeButtons.get(item).setEnabled(true);
	        }
	        */
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
