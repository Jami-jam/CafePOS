package cafepos;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.LinkedHashMap;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class Menu {

	private JFrame frame;

	private LinkedHashMap<String, Double> order = new LinkedHashMap<>();
	private double total = 0.0;
	private JLabel lblTotal = new JLabel("Total: ₱0.00");
	private LinkedHashMap<String, Double> menu = new LinkedHashMap<>();
	private JTextArea textAreaOrder = new JTextArea(8, 20);
	private JScrollPane scrollPane = new JScrollPane();
	private LinkedHashMap<String, JButton> minusButtons = new LinkedHashMap<>();
	private String lastClickedItem = "";
	private JButton btnCold, btnHot, btnNonCof, btnPastries;
	private Color normalColor = new Color(162, 114, 94);
	private Color selectedColor = new Color(102, 69, 57);

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

		JLabel lblMenu = new JLabel("");
		URL menuUrl = getClass().getResource("/icons/menu.png");
		if (menuUrl != null) {
			lblMenu.setIcon(new ImageIcon(menuUrl));
		}

		JPanel panelPastries = new JPanel();
		panelPastries.setBackground(new Color(162, 114, 94));
		panelPastries.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelPastries.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panelPastries);
		panelPastries.setLayout(null);

		///////////////////////////////

		// CROISSANT

		JButton btnCroissant = new JButton("");
		btnCroissant.setBounds(20, 22, 226, 273);
		addHoverEffect(btnCroissant);
		panelPastries.add(btnCroissant);
		URL croissantURL = getClass().getResource("/icons/Croissant.png");
		if (croissantURL != null) {
			btnCroissant.setIcon(new ImageIcon(croissantURL));
		}
		btnCroissant.addActionListener(e -> {
			lastClickedItem = "Croissant";
			addToOrder("Croissant", menu.get("Croissant"));

		});

		// EGG TART

		JButton btnEggTart = new JButton("");
		btnEggTart.setBounds(285, 22, 226, 271);
		addHoverEffect(btnEggTart);
		panelPastries.add(btnEggTart);
		URL eggTartURL = getClass().getResource("/icons/EggTart.png");
		if (eggTartURL != null) {
			btnEggTart.setIcon(new ImageIcon(eggTartURL));
		}
		btnEggTart.addActionListener(e -> {
			lastClickedItem = "Egg Tart";
			addToOrder("Egg Tart", menu.get("Egg Tart"));
		});

		// CHOCO COOKIES

		JButton btnChocoC = new JButton("");
		btnChocoC.setBounds(285, 371, 224, 270);
		addHoverEffect(btnChocoC);
		panelPastries.add(btnChocoC);
		URL chocoCURL = getClass().getResource("/icons/ChocolateCookies.png");
		if (chocoCURL != null) {
			btnChocoC.setIcon(new ImageIcon(chocoCURL));
		}
		btnChocoC.addActionListener(e -> {
			lastClickedItem = "Chocolate Cookies";
			addToOrder("Chocolate Cookies", menu.get("Chocolate Cookies"));
		});

		// RED VELVET CAKE

		JButton btnRedVelvetC = new JButton("");
		btnRedVelvetC.setBounds(20, 371, 226, 273);
		addHoverEffect(btnRedVelvetC);
		panelPastries.add(btnRedVelvetC);
		URL redvelvetCURL = getClass().getResource("/icons/RedVelvet.png");
		if (redvelvetCURL != null) {
			btnRedVelvetC.setIcon(new ImageIcon(redvelvetCURL));
		}
		btnRedVelvetC.addActionListener(e -> {
			lastClickedItem = "Red Velvet Cake";
			addToOrder("Red Velvet Cake", menu.get("Red Velvet Cake"));
		});

		///////////////////////////////

		JLabel lblCroissant = new JLabel("<html><center>Croissant<br>₱ 60</html></center>");
		lblCroissant.setForeground(new Color(0, 0, 0));
		lblCroissant.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblCroissant.setHorizontalAlignment(SwingConstants.CENTER);
		lblCroissant.setBounds(30, 306, 212, 48);
		panelPastries.add(lblCroissant);

		JLabel lblEggTart = new JLabel("<html><center>Egg Tart<br>₱ 70</html></center>");
		lblEggTart.setForeground(new Color(0, 0, 0));
		lblEggTart.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEggTart.setHorizontalAlignment(SwingConstants.CENTER);
		lblEggTart.setBounds(285, 306, 212, 48);
		panelPastries.add(lblEggTart);

		JLabel lblRedVelvetC = new JLabel("<html><center>Red Velvet Cake<br>₱ 170</html></center>");
		lblRedVelvetC.setForeground(new Color(0, 0, 0));
		lblRedVelvetC.setHorizontalAlignment(SwingConstants.CENTER);
		lblRedVelvetC.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblRedVelvetC.setBounds(30, 655, 212, 48);
		panelPastries.add(lblRedVelvetC);

		JLabel lblChocoC = new JLabel("<html><center>Chocolate Cookies<br>₱ 80</html></center>");
		lblChocoC.setForeground(new Color(0, 0, 0));
		lblChocoC.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblChocoC.setHorizontalAlignment(SwingConstants.CENTER);
		lblChocoC.setBounds(285, 655, 212, 48);
		panelPastries.add(lblChocoC);
		panelPastries.setVisible(false);

		JPanel panelNon = new JPanel();
		panelNon.setBackground(new Color(162, 114, 94));
		panelNon.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelNon.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panelNon);
		panelNon.setLayout(null);

		JLabel lblStrawberryF = new JLabel("<html><center>Strawberry Frappe<br>₱ 180</html></center>");
		lblStrawberryF.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblStrawberryF.setForeground(new Color(0, 0, 0));
		lblStrawberryF.setHorizontalAlignment(SwingConstants.CENTER);
		lblStrawberryF.setBounds(285, 655, 212, 48);
		panelNon.add(lblStrawberryF);

		JLabel lblMatchaS = new JLabel("<html><center>Matcha Strawberry<br>₱ 200</html></center>");
		lblMatchaS.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMatchaS.setForeground(new Color(0, 0, 0));
		lblMatchaS.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatchaS.setBounds(30, 655, 212, 48);
		panelNon.add(lblMatchaS);

		///////////////////////////////

		// MATCHA STRAWBERRY

		JButton btnMatchaS = new JButton("");
		btnMatchaS.setBounds(20, 371, 226, 273);
		addHoverEffect(btnMatchaS);
		panelNon.add(btnMatchaS);
		URL matchaSURL = getClass().getResource("/icons/MatchaStrawberry.png");
		if (matchaSURL != null) {
			btnMatchaS.setIcon(new ImageIcon(matchaSURL));
		}
		btnMatchaS.addActionListener(e -> {
			lastClickedItem = "Matcha Strawberry";
			addToOrder("Matcha Strawberry", menu.get("Matcha Strawberry"));
		});

		// STRAWBERRY FRAPPE

		JButton btnStrawberryF = new JButton("");
		btnStrawberryF.setBounds(285, 371, 226, 273);
		addHoverEffect(btnStrawberryF);
		panelNon.add(btnStrawberryF);
		URL strawberryFURL = getClass().getResource("/icons/StrawberryFrappe.png");
		if (strawberryFURL != null) {
			btnStrawberryF.setIcon(new ImageIcon(strawberryFURL));
		}
		btnStrawberryF.addActionListener(e -> {
			lastClickedItem = "Strawberry Frappe";
			addToOrder("Strawberry Frappe", menu.get("Strawberry Frappe"));
		});

		// MATCHA LATTE

		JButton btnMatchaL = new JButton("");
		btnMatchaL.setBounds(285, 22, 225, 271);
		addHoverEffect(btnMatchaL);
		panelNon.add(btnMatchaL);
		URL matchaLURL = getClass().getResource("/icons/MatchaLatte.png");
		if (matchaLURL != null) {
			btnMatchaL.setIcon(new ImageIcon(matchaLURL));
		}
		btnMatchaL.addActionListener(e -> {
			lastClickedItem = "Matcha Latte";
			addToOrder("Matcha Latte", menu.get("Matcha Latte"));
		});

		// CLASSIC CHOCOLATE

		JButton btnClassicC = new JButton("");
		btnClassicC.setBounds(20, 22, 223, 273);
		addHoverEffect(btnClassicC);
		panelNon.add(btnClassicC);
		URL classicCURL = getClass().getResource("/icons/ClassicChocolate.png");
		if (classicCURL != null) {
			btnClassicC.setIcon(new ImageIcon(classicCURL));
		}
		btnClassicC.addActionListener(e -> {
			lastClickedItem = "Classic Chocolate";
			addToOrder("Classic Chocolate", menu.get("Classic Chocolate"));
		});

		///////////////////////////////

		JLabel lblMatchaL = new JLabel("<html><center>Matcha Latte<br>₱ 170</html></center>");
		lblMatchaL.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMatchaL.setForeground(new Color(0, 0, 0));
		lblMatchaL.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatchaL.setBounds(285, 306, 212, 48);
		panelNon.add(lblMatchaL);

		JLabel lblClassicC = new JLabel("<html><center>Classic Chocolate<br>₱ 120</html></center>");
		lblClassicC.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblClassicC.setForeground(new Color(0, 0, 0));
		lblClassicC.setHorizontalAlignment(SwingConstants.CENTER);
		lblClassicC.setBounds(30, 306, 212, 48);
		panelNon.add(lblClassicC);
		panelNon.setVisible(false);

		JPanel panelHot = new JPanel();
		panelHot.setBackground(new Color(162, 114, 94));
		panelHot.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelHot.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panelHot);
		panelHot.setLayout(null);
		panelHot.setVisible(false);

		JLabel lblCaramelMH = new JLabel("<html><center>Caramel Macchiato<br>₱ 125</html></center>");
		lblCaramelMH.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblCaramelMH.setForeground(new Color(0, 0, 0));
		lblCaramelMH.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaramelMH.setBounds(285, 655, 212, 48);
		panelHot.add(lblCaramelMH);

		JLabel lblEspresso = new JLabel("<html><center>Espresso<br>₱ 100</html></center>");
		lblEspresso.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEspresso.setForeground(new Color(0, 0, 0));
		lblEspresso.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspresso.setBounds(30, 655, 212, 48);
		panelHot.add(lblEspresso);

		JLabel lblCafeLatte = new JLabel("<html><center>Cafe Latte<br>₱ 120</html></center>");
		lblCafeLatte.setForeground(new Color(0, 0, 0));
		lblCafeLatte.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblCafeLatte.setHorizontalAlignment(SwingConstants.CENTER);
		lblCafeLatte.setBounds(285, 306, 212, 48);
		panelHot.add(lblCafeLatte);

		///////////////////////////////

		// BREWED

		JButton btnBrewed = new JButton("");
		btnBrewed.setBounds(20, 22, 226, 270	);
		addHoverEffect(btnBrewed);
		panelHot.add(btnBrewed);
		URL brewedURL = getClass().getResource("/icons/Brewed.png");
		if (brewedURL != null) {
			btnBrewed.setIcon(new ImageIcon(brewedURL));
		}
		btnBrewed.addActionListener(e -> {
			lastClickedItem = "Brewed";
			addToOrder("Brewed", menu.get("Brewed"));
		});

		// CAFE LATTE

		JButton btnCafeLatte = new JButton("");
		btnCafeLatte.setBounds(285, 22, 224, 270);
		addHoverEffect(btnCafeLatte);
		panelHot.add(btnCafeLatte);
		URL cafeLURL = getClass().getResource("/icons/CafeLatte.png");
		if (cafeLURL != null) {
			btnCafeLatte.setIcon(new ImageIcon(cafeLURL));
		}
		btnCafeLatte.addActionListener(e -> {
			lastClickedItem = "Cafe Latte";
			addToOrder("Cafe Latte", menu.get("Cafe Latte"));
		});

		// ESPRESSO

		JButton btnEspresso = new JButton("");
		btnEspresso.setBounds(20, 371, 224, 271);
		addHoverEffect(btnEspresso);
		panelHot.add(btnEspresso);
		URL espressoURL = getClass().getResource("/icons/Espresso.png");
		if (espressoURL != null) {
			btnEspresso.setIcon(new ImageIcon(espressoURL));
		}
		btnEspresso.addActionListener(e -> {
			lastClickedItem = "Espresso";
			addToOrder("Espresso", menu.get("Espresso"));
		});

		// CARAMEL MACCHIATO HOT

		JButton btnCaramelMH = new JButton("");
		btnCaramelMH.setBounds(285, 371, 224, 271);
		addHoverEffect(btnCaramelMH);
		panelHot.add(btnCaramelMH);
		URL caramelMHURL = getClass().getResource("/icons/CaramelMacchiatoH.png");
		if (caramelMHURL != null) {
			btnCaramelMH.setIcon(new ImageIcon(caramelMHURL));
		}
		btnCaramelMH.addActionListener(e -> {
			lastClickedItem = "Caramel Macchiato Hot";
			addToOrder("Caramel Macchiato Hot", menu.get("Caramel Macchiato Hot"));
		});

		///////////////////////////////

		JLabel lblBrewed = new JLabel("<html><center>Brewed<br>₱ 110</html><c/enter>");
		lblBrewed.setForeground(new Color(0, 0, 0));
		lblBrewed.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblBrewed.setHorizontalAlignment(SwingConstants.CENTER);
		lblBrewed.setBounds(30, 306, 212, 48);
		panelHot.add(lblBrewed);

		JPanel panelCold = new JPanel();
		panelCold.setBackground(new Color(162, 114, 94));
		panelCold.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelCold.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panelCold);
		panelCold.setLayout(null);

		///////////////////////////////

		// SPANISH LATTE

		JButton btnSpanishLatte = new JButton("");
		btnSpanishLatte.setBounds(285, 22, 223, 270);
		addHoverEffect(btnSpanishLatte);
		panelCold.add(btnSpanishLatte);
		URL spanishLURL = getClass().getResource("/icons/SpanishLatte.png");
		if (spanishLURL != null) {
			btnSpanishLatte.setIcon(new ImageIcon(spanishLURL));
		}
		btnSpanishLatte.addActionListener(e -> {
			lastClickedItem = "Spanish Latte";
			addToOrder("Spanish Latte", menu.get("Spanish Latte"));
		});

		// AMERICANO

		JButton btnAmericano = new JButton("");
		btnAmericano.setBounds(20, 22, 223, 273);
		addHoverEffect(btnAmericano);
		panelCold.add(btnAmericano);
		URL americanoURL = getClass().getResource("/icons/Americano.png");
		if (americanoURL != null) {
			btnAmericano.setIcon(new ImageIcon(americanoURL));
		}
		btnAmericano.addActionListener(e -> {
			lastClickedItem = "Americano";
			addToOrder("Americano", menu.get("Americano"));
		});

		// WHITE MOCHA

		JButton btnWhiteMocha = new JButton("");
		btnWhiteMocha.setBounds(20, 371, 223, 270);
		addHoverEffect(btnWhiteMocha);
		panelCold.add(btnWhiteMocha);
		URL whiteMURL = getClass().getResource("/icons/WhiteMocha.png");
		if (whiteMURL != null) {
			btnWhiteMocha.setIcon(new ImageIcon(whiteMURL));
		}
		btnWhiteMocha.addActionListener(e -> {
			lastClickedItem = "White Mocha";
			addToOrder("White Mocha", menu.get("White Mocha"));
		});

		// CARAMEL MACCHIATO COLD

		JButton btnCaramelMC = new JButton("");
		btnCaramelMC.setBounds(285, 371, 223, 271);
		addHoverEffect(btnCaramelMC);
		panelCold.add(btnCaramelMC);
		URL caramelMCURL = getClass().getResource("/icons/CaramelMacchiatoC.png");
		if (caramelMCURL != null) {
			btnCaramelMC.setIcon(new ImageIcon(caramelMCURL));
		}
		btnCaramelMC.addActionListener(e -> {
			lastClickedItem = "Caramel Macchiato Cold";
			addToOrder("Caramel Macchiato Cold", menu.get("Caramel Macchiato Cold"));
		});

		JLabel lblWhiteMocha = new JLabel("<html><center>White Mocha<br>₱ 155</center></html>");
		lblWhiteMocha.setForeground(new Color(0, 0, 0));
		lblWhiteMocha.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblWhiteMocha.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhiteMocha.setBounds(30, 655, 212, 48);
		panelCold.add(lblWhiteMocha);

		JLabel lblCaramelMC = new JLabel("<html><center>Caramel Macchiato<br>₱ 165</center></html>");
		lblCaramelMC.setForeground(new Color(0, 0, 0));
		lblCaramelMC.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblCaramelMC.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaramelMC.setBounds(285, 655, 212, 48);
		panelCold.add(lblCaramelMC);

		JLabel lblAmericano = new JLabel("<html><center>Americano<br>₱ 120</center></html>");
		lblAmericano.setForeground(new Color(0, 0, 0));
		lblAmericano.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAmericano.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmericano.setBounds(30, 306, 212, 48);
		panelCold.add(lblAmericano);

		JLabel lblSpanishLatte = new JLabel("<html><center>Spanish Latte<br>₱ 160</center></html>");
		lblSpanishLatte.setForeground(new Color(0, 0, 0));
		lblSpanishLatte.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSpanishLatte.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpanishLatte.setBounds(285, 306, 212, 48);
		panelCold.add(lblSpanishLatte);
		panelCold.setVisible(false);
		lblMenu.setBounds(20, 11, 167, 98);
		frame.getContentPane().add(lblMenu);
		lblMenu.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 30));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel universalPanel = new JPanel();
		universalPanel.setBounds(370, 777, 150, 45);
		universalPanel.setOpaque(false);
		universalPanel.setLayout(new GridLayout(1, 3));
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

		btnCold = new JButton("Cold");
		btnCold.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCold.setBackground(normalColor);
		btnCold.setForeground(new Color(255, 255, 255));
		btnCold.setBounds(37, 120, 140, 139);
		addHoverEffect(btnCold);
		btnCold.addActionListener(e -> {
			panelCold.setVisible(true);
			panelHot.setVisible(false);
			panelNon.setVisible(false);
			panelPastries.setVisible(false);
			highlightButton(btnCold);
		});
		frame.getContentPane().add(btnCold);
		btnCold.setBounds(37, 120, 140, 139);
		frame.getContentPane().add(btnCold);

		btnHot = new JButton("Hot");
		btnHot.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHot.setBackground(normalColor);
		btnHot.setForeground(new Color(255, 255, 255));
		btnHot.setBounds(37, 287, 140, 139);
		addHoverEffect(btnHot);
		btnHot.addActionListener(e -> {
			panelHot.setVisible(true);
			panelCold.setVisible(false);
			panelNon.setVisible(false);
			panelPastries.setVisible(false);
			highlightButton(btnHot);
		});
		frame.getContentPane().add(btnHot);

		btnPastries = new JButton("Pastries");
		btnPastries.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPastries.setBackground(normalColor);
		btnPastries.setForeground(new Color(255, 255, 255));
		btnPastries.setBounds(37, 623, 140, 139);
		addHoverEffect(btnPastries);
		btnPastries.addActionListener(e -> {
			panelPastries.setVisible(true);
			panelCold.setVisible(false);
			panelHot.setVisible(false);
			panelNon.setVisible(false);
			highlightButton(btnPastries);
		});
		frame.getContentPane().add(btnPastries);

		btnNonCof = new JButton("Non-Coffee");
		btnNonCof.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNonCof.setBackground(normalColor);
		btnNonCof.setForeground(new Color(255, 255, 255));
		btnNonCof.setBounds(37, 456, 140, 139);
		addHoverEffect(btnNonCof);
		btnNonCof.addActionListener(e -> {
			panelNon.setVisible(true);
			panelCold.setVisible(false);
			panelHot.setVisible(false);
			panelPastries.setVisible(false);
			highlightButton(btnNonCof);
		});
		frame.getContentPane().add(btnNonCof);

		JButton btnCont = new JButton("Continue");
		btnCont.setForeground(new Color(255, 255, 255));
		btnCont.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCont.setBackground(new Color(162, 114, 94));
		btnCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					Payment payment = new Payment(total, order);
					payment.setVisible(true);
					frame.setVisible(false);
				}
			}
		});
		btnCont.setBounds(537, 822, 190, 91);
		frame.getContentPane().add(btnCont);

		JLabel lblmenubg = new JLabel("New label");
		URL menubgUrl = getClass().getResource("/icons/menu bg.png");
		if (menubgUrl != null) {
			lblmenubg.setIcon(new ImageIcon(menubgUrl));
		}
		
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(new Color(162, 114, 94));
				panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				panel_1.setBounds(197, 43, 530, 719);
				frame.getContentPane().add(panel_1);
				panel_1.setLayout(null);
		lblmenubg.setBounds(0, 0, 752, 1027);
		frame.getContentPane().add(lblmenubg);
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

	private void addHoverEffect(JButton button) {
		button.setBorder(new EmptyBorder(0, 0, 0, 0));
		button.setFocusPainted(false);
		button.setBorderPainted(false);

		int originalY = button.getY();
		int originalHeight = button.getHeight();

		Timer hoverTimer = new Timer(30, null);
		int[] targetY = { originalY };
		boolean[] isHovering = { false };

		hoverTimer.addActionListener(e -> {
			int currentY = button.getY();
			int target = isHovering[0] ? originalY - 6 : originalY; //

			if (Math.abs(currentY - target) > 1) {
				int step = (target > currentY) ? 1 : -1;
				button.setBounds(button.getX(), currentY + step, button.getWidth(), originalHeight);
				button.getParent().revalidate();
				button.getParent().repaint();
			}
		});

		button.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				isHovering[0] = true;
				if (!hoverTimer.isRunning())
					hoverTimer.start();
			}

			public void mouseExited(MouseEvent e) {
				isHovering[0] = false;
				if (!hoverTimer.isRunning())
					hoverTimer.start();
			}
		});
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

	private void highlightButton(JButton selectedBtn) {
		btnCold.setBackground(normalColor);
		btnHot.setBackground(normalColor);
		btnNonCof.setBackground(normalColor);
		btnPastries.setBackground(normalColor);

		selectedBtn.setBackground(selectedColor);
	}

	private void updateDisplay() {
		textAreaOrder.setText("Order:\n");
		for (String item : order.keySet()) {
			double itemTotal = order.get(item);
			int quantity = (int) (itemTotal / menu.get(item));
			textAreaOrder.append(item + " x" + quantity + " - ₱" + String.format("%.2f", itemTotal) + "\n");
		}
		textAreaOrder.append("\nTotal: ₱" + String.format("%.2f", total));
		lblTotal.setText("Total: ₱" + String.format("%.2f", total));
	}

	public double getTotal() {
		return total;
	}

	public LinkedHashMap<String, Double> getOrder() {
		return order;
	}

	public void setVisible(boolean b) {

		frame.setVisible(b);

	}
}
