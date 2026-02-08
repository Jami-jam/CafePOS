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
		} else {
			lblMenu.setText("?");
		}
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

		JPanel panelPastries = new JPanel();
		panelPastries.setBackground(new Color(162, 114, 94));
		panelPastries.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelPastries.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panelPastries);
		panelPastries.setLayout(null);

		///////////////////////////////

		// CROISSANT

		JButton btnCroissant = new JButton("Croissant");
		btnCroissant.setBounds(20, 63, 234, 232);
		addHoverEffect(btnCroissant);
		panelPastries.add(btnCroissant);
		btnCroissant.addActionListener(e -> {
			lastClickedItem = "Croissant";
			addToOrder("Croissant", menu.get("Croissant"));

		});

		// EGG TART

		JButton btnEggTart = new JButton("Egg Tart");
		btnEggTart.setBounds(275, 63, 234, 232);
		addHoverEffect(btnEggTart);
		panelPastries.add(btnEggTart);
		btnEggTart.addActionListener(e -> {
			lastClickedItem = "Egg Tart";
			addToOrder("Egg Tart", menu.get("Egg Tart"));
		});

		// CHOCO COOKIES

		JButton btnChocoC = new JButton("Chocolate Cookies");
		btnChocoC.setBounds(275, 398, 234, 232);
		addHoverEffect(btnChocoC);
		panelPastries.add(btnChocoC);
		btnChocoC.addActionListener(e -> {
			lastClickedItem = "Chocolate Cookies";
			addToOrder("Chocolate Cookies", menu.get("Chocolate Cookies"));
		});

		// RED VELVET CAKE

		JButton btnRedVelvetC = new JButton("Red Velvet Cake");
		btnRedVelvetC.setBounds(20, 398, 234, 232);
		addHoverEffect(btnRedVelvetC);
		panelPastries.add(btnRedVelvetC);
		btnRedVelvetC.addActionListener(e -> {
			lastClickedItem = "Red Velvet Cake";
			addToOrder("Red Velvet Cake", menu.get("Red Velvet Cake"));
		});

		///////////////////////////////

		JLabel lblCroissant = new JLabel("₱ 60");
		lblCroissant.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblCroissant.setHorizontalAlignment(SwingConstants.CENTER);
		lblCroissant.setBounds(30, 306, 212, 34);
		panelPastries.add(lblCroissant);

		JLabel lblEggTart = new JLabel("₱ 70");
		lblEggTart.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEggTart.setHorizontalAlignment(SwingConstants.CENTER);
		lblEggTart.setBounds(285, 306, 212, 34);
		panelPastries.add(lblEggTart);

		JLabel lblRedVelvetC = new JLabel("₱ 170");
		lblRedVelvetC.setHorizontalAlignment(SwingConstants.CENTER);
		lblRedVelvetC.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblRedVelvetC.setBounds(30, 638, 212, 34);
		panelPastries.add(lblRedVelvetC);

		JLabel lblChocoC = new JLabel("₱ 80");
		lblChocoC.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblChocoC.setHorizontalAlignment(SwingConstants.CENTER);
		lblChocoC.setBounds(285, 638, 212, 34);
		panelPastries.add(lblChocoC);
		panelPastries.setVisible(false);

		JPanel panelNon = new JPanel();
		panelNon.setBackground(new Color(162, 114, 94));
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
		addHoverEffect(btnMatchaS);
		panelNon.add(btnMatchaS);
		btnMatchaS.addActionListener(e -> {
			lastClickedItem = "Matcha Strawberry";
			addToOrder("Matcha Strawberry", menu.get("Matcha Strawberry"));
		});

		// STRAWBERRY FRAPPE

		JButton btnStrawberryF = new JButton("Strawberry Frappe");
		btnStrawberryF.setBounds(275, 398, 234, 232);
		addHoverEffect(btnStrawberryF);
		panelNon.add(btnStrawberryF);
		btnStrawberryF.addActionListener(e -> {
			lastClickedItem = "Strawberry Frappe";
			addToOrder("Strawberry Frappe", menu.get("Strawberry Frappe"));
		});

		// MATCHA LATTE

		JButton btnMatchaL = new JButton("Matcha Latte");
		btnMatchaL.setBounds(275, 63, 234, 232);
		addHoverEffect(btnMatchaL);
		panelNon.add(btnMatchaL);
		btnMatchaL.addActionListener(e -> {
			lastClickedItem = "Matcha Latte";
			addToOrder("Matcha Latte", menu.get("Matcha Latte"));
		});

		// CLASSIC CHOCOLATE

		JButton btnClassicC = new JButton("Classic Chocolate");
		btnClassicC.setBounds(20, 63, 234, 232);
		addHoverEffect(btnClassicC);
		panelNon.add(btnClassicC);
		btnClassicC.addActionListener(e -> {
			lastClickedItem = "Classic Chocolate";
			addToOrder("Classic Chocolate", menu.get("Classic Chocolate"));
		});

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
		panelHot.setBackground(new Color(162, 114, 94));
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
		addHoverEffect(btnBrewed);
		panelHot.add(btnBrewed);
		btnBrewed.addActionListener(e -> {
			lastClickedItem = "Brewed";
			addToOrder("Brewed", menu.get("Brewed"));
		});

		// CAFE LATTE

		JButton btnCafeLatte = new JButton("Cafe Latte");
		btnCafeLatte.setBounds(275, 63, 234, 232);
		addHoverEffect(btnCafeLatte);
		panelHot.add(btnCafeLatte);
		btnCafeLatte.addActionListener(e -> {
			lastClickedItem = "Cafe Latte";
			addToOrder("Cafe Latte", menu.get("Cafe Latte"));
		});

		// ESPRESSO

		JButton btnEspresso = new JButton("Espresso");
		btnEspresso.setBounds(20, 398, 234, 232);
		addHoverEffect(btnEspresso);
		panelHot.add(btnEspresso);
		btnEspresso.addActionListener(e -> {
			lastClickedItem = "Espresso";
			addToOrder("Espresso", menu.get("Espresso"));
		});

		// CARAMEL MACCHIATO HOT

		JButton btnCaramelMH = new JButton("Caramel Macchiato Hot");
		btnCaramelMH.setBounds(275, 398, 234, 232);
		addHoverEffect(btnCaramelMH);
		panelHot.add(btnCaramelMH);
		btnCaramelMH.addActionListener(e -> {
			lastClickedItem = "Caramel Macchiato Hot";
			addToOrder("Caramel Macchiato Hot", menu.get("Caramel Macchiato Hot"));
		});

		///////////////////////////////

		JLabel lblBrewed = new JLabel("₱ 110");
		lblBrewed.setHorizontalAlignment(SwingConstants.CENTER);
		lblBrewed.setBounds(30, 306, 212, 34);
		panelHot.add(lblBrewed);

		JPanel panelCold = new JPanel();
		panelCold.setBackground(new Color(162, 114, 94));
		panelCold.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelCold.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panelCold);
		panelCold.setLayout(null);

		///////////////////////////////

		// SPANISH LATTE

		JButton btnSpanishLatte = new JButton("Spanish Latte");
		btnSpanishLatte.setBounds(275, 63, 234, 232);
		addHoverEffect(btnSpanishLatte);
		panelCold.add(btnSpanishLatte);
		btnSpanishLatte.addActionListener(e -> {
			lastClickedItem = "Spanish Latte";
			addToOrder("Spanish Latte", menu.get("Spanish Latte"));
		});

		// AMERICANO

		JButton btnAmericano = new JButton("Americano");
		btnAmericano.setBounds(20, 63, 234, 232);
		addHoverEffect(btnAmericano);
		panelCold.add(btnAmericano);
		btnAmericano.addActionListener(e -> {
			lastClickedItem = "Americano";
			addToOrder("Americano", menu.get("Americano"));
		});

		// WHITE MOCHA

		JButton btnWhiteMocha = new JButton("White Mocha");
		btnWhiteMocha.setBounds(20, 398, 234, 232);
		addHoverEffect(btnWhiteMocha);
		panelCold.add(btnWhiteMocha);
		btnWhiteMocha.addActionListener(e -> {
			lastClickedItem = "White Mocha";
			addToOrder("White Mocha", menu.get("White Mocha"));
		});

		// CARAMEL MACCHIATO COLD

		JButton btnCaramelMC = new JButton("Caramel Macchiato Cold");
		btnCaramelMC.setBounds(275, 398, 234, 232);
		addHoverEffect(btnCaramelMC);
		panelCold.add(btnCaramelMC);
		btnCaramelMC.addActionListener(e -> {
			lastClickedItem = "Caramel Macchiato Cold";
			addToOrder("Caramel Macchiato Cold", menu.get("Caramel Macchiato Cold"));
		});

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

		btnCold = new JButton("Cold");
		btnCold.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCold.setBackground(normalColor);
		btnCold.setForeground(Color.BLACK);
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

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(162, 114, 94));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(197, 43, 530, 719);
		frame.getContentPane().add(panel_1);
		btnCold.setBounds(37, 120, 140, 139);
		frame.getContentPane().add(btnCold);

		btnHot = new JButton("Hot");
		btnHot.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHot.setBackground(normalColor);
		btnHot.setForeground(Color.BLACK);
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
		btnPastries.setForeground(Color.BLACK);
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
		btnNonCof.setForeground(Color.BLACK);
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
		lblmenubg.setBounds(0, 0, 752, 985);
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
