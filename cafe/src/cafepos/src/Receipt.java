package cafepos.src;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.print.PrinterJob;
import java.net.URL;
import java.util.LinkedHashMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.ImageIcon;

public class Receipt {

	private JFrame frame;
	private JTextArea textAreaReceipt;
	private JScrollPane scrollPane;
	private JLabel lblTotalAmount;
	private double total;
	private LinkedHashMap<String, Double> order;
	private static int orderCounter = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt window = new Receipt();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Receipt() {
		textAreaReceipt = new JTextArea(8, 20);
		scrollPane = new JScrollPane(textAreaReceipt);
		initialize(0.0, new LinkedHashMap<String, Double>());
	}

	public Receipt(double total, LinkedHashMap<String, Double> order) {
		this.total = total;
		this.order = order;
		textAreaReceipt = new JTextArea(8, 20);
		scrollPane = new JScrollPane(textAreaReceipt);
		initialize(total, order);
	}

	private void initialize(double total, LinkedHashMap<String, Double> order) {

		frame = new JFrame();
		frame.setBounds(0, 0, 768, 1024);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblReceipt = new JLabel("RECEIPT");
		lblReceipt.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblReceipt.setHorizontalAlignment(SwingConstants.CENTER);
		lblReceipt.setBounds(24, 29, 720, 59);
		frame.getContentPane().add(lblReceipt);

		JLabel lblCafeName = new JLabel("CAFE POS SYSTEM");
		lblCafeName.setFont(new Font("Arial", Font.BOLD, 18));
		lblCafeName.setBounds(50, 100, 668, 30);
		frame.getContentPane().add(lblCafeName);

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy  hh:mm a", Locale.ENGLISH);
		String currentDateTime = "Date/Time: " + now.format(formatter);
		JLabel lblDateTime = new JLabel(currentDateTime);
		lblDateTime.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDateTime.setBounds(50, 135, 668, 25);
		frame.getContentPane().add(lblDateTime);

		orderCounter++;
		String orderNumber = String.format("Order #: %03d", orderCounter);
		JLabel lblOrderNum = new JLabel(orderNumber);
		lblOrderNum.setFont(new Font("Arial", Font.PLAIN, 14));
		lblOrderNum.setBounds(50, 165, 668, 25);
		frame.getContentPane().add(lblOrderNum);

		lblTotalAmount = new JLabel("₱0.00");
		lblTotalAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalAmount.setFont(new Font("Arial", Font.BOLD, 24));
		lblTotalAmount.setBounds(550, 499, 150, 40);
		frame.getContentPane().add(lblTotalAmount);

		JLabel lblTotal = new JLabel("TOTAL AMOUNT:");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Arial", Font.BOLD, 16));
		lblTotal.setBounds(250, 499, 300, 40);
		frame.getContentPane().add(lblTotal);

		textAreaReceipt.setEditable(false);
		textAreaReceipt.setFont(new Font("Monospaced", Font.PLAIN, 14));
		scrollPane.setBounds(50, 200, 668, 280);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(scrollPane);

		updateReceiptDisplay(order, total);

		// BUTTONS
		JButton btnPrintReceipt = new JButton("PRINT RECEIPT");
		btnPrintReceipt.setFont(new Font("Arial", Font.BOLD, 16));
		btnPrintReceipt.setBounds(50, 588, 220, 60);
		btnPrintReceipt.addActionListener(e -> printReceipt());
		frame.getContentPane().add(btnPrintReceipt);

		JButton btnNewOrder = new JButton("New Order");
		btnNewOrder.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewOrder.setBounds(295, 588, 150, 60);
		btnNewOrder.addActionListener(e -> newOrder());
		frame.getContentPane().add(btnNewOrder);

		JButton btnBack = new JButton("Back to Menu");
		btnBack.setFont(new Font("Arial", Font.BOLD, 16));
		btnBack.setBounds(470, 588, 248, 60);
		btnBack.addActionListener(e -> {
			frame.dispose();
			Menu mainApp = new Menu();
			mainApp.setVisible(true);
		});
		frame.getContentPane().add(btnBack);
		
		JLabel lblbg = new JLabel("New label");
	    URL lblbgurl = getClass().getResource("/resources/icons/menu bg.png");
	    if (lblbg != null) {
	    	lblbg.setIcon(new ImageIcon(lblbgurl));
	    
		lblbg.setBounds(0, 0, 752, 985);
		frame.getContentPane().add(lblbg);
	    }
		lblbg.setBounds(0, 0, 752, 985);
		frame.getContentPane().add(lblbg);
	}

	private void updateReceiptDisplay(LinkedHashMap<String, Double> order, double total) {
		if (order == null || order.isEmpty()) {
			textAreaReceipt.setText("No items in order.");
			lblTotalAmount.setText("₱0.00");
			return;
		}

		StringBuilder receiptText = new StringBuilder();
		receiptText.append("================================\n");
		receiptText.append("        CAFE POS SYSTEM\n");
		receiptText.append("================================\n\n");
		receiptText.append("ITEM                    QTY  PRICE\n");
		receiptText.append("--------------------------------\n");

		for (String item : order.keySet()) {
			double itemTotal = order.get(item);
			int quantity = (int) (itemTotal / getPrice(item));
			double pricePerItem = getPrice(item);

			receiptText.append(String.format("%-22s %2d x ₱%5.0f  ₱%6.2f\n", item, quantity, pricePerItem, itemTotal));
		}

		receiptText.append("--------------------------------\n");
		receiptText.append(String.format("%28s ₱%6.2f\n", "TOTAL:", total));
		receiptText.append("================================\n");
		receiptText.append("Thank you for your purchase!\n");

		textAreaReceipt.setText(receiptText.toString());
		lblTotalAmount.setText("₱" + String.format("%.2f", total));
	}

	private double getPrice(String itemName) {
		LinkedHashMap<String, Double> menu = new LinkedHashMap<>();
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
		return menu.getOrDefault(itemName, 0.0);
	}

	private void printReceipt() {
		orderCounter++;
		System.out.println("PRINTING RECEIPT # " + String.format("%03d", orderCounter));
		System.out.println(textAreaReceipt.getText());

		JLabel printMsg = new JLabel("Receipt Printed Successfully!");
		printMsg.setHorizontalAlignment(SwingConstants.CENTER);
		printMsg.setFont(new Font("Arial", Font.BOLD, 18));
		printMsg.setBounds(200, 450, 368, 30);
		frame.getContentPane().add(printMsg);
	}

	private void newOrder() {
		frame.dispose();
		Menu mainApp = new Menu();
		mainApp.setVisible(true);
	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
	}
}