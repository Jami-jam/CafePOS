package cafepos.src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;

public class Payment {

    private JFrame frame;
    private JTextArea textAreaOrder;
    private JScrollPane scrollPane;
    private JLabel lblTotalAmount;
	private double total;
	private LinkedHashMap<String, Double> order;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Payment window = new Payment();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Payment() {
        textAreaOrder = new JTextArea(8, 20);
        scrollPane = new JScrollPane(textAreaOrder);
        initialize();
    }

    public Payment(double total, LinkedHashMap<String, Double> order) {
        this.total = total; 
        this.order = order;
        textAreaOrder = new JTextArea(8, 20);
        scrollPane = new JScrollPane(textAreaOrder);
        initialize(total, order);  // PASS DATA
    }

    private void initialize() {
        initialize(0.0, new LinkedHashMap<String, Double>());
    }

    private void initialize(double total, LinkedHashMap<String, Double> order) {
        frame = new JFrame();
        frame.setBounds(0, 0, 768, 1024);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblCheckout = new JLabel("CHECK OUT");
        lblCheckout.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblCheckout.setHorizontalAlignment(SwingConstants.CENTER);
        lblCheckout.setBounds(24, 29, 149, 59);
        frame.getContentPane().add(lblCheckout);

        lblTotalAmount = new JLabel("₱0.00");
        lblTotalAmount.setHorizontalAlignment(SwingConstants.CENTER);
        lblTotalAmount.setFont(new Font("Arial", Font.BOLD, 20));
        lblTotalAmount.setBounds(325, 499, 150, 34);
        frame.getContentPane().add(lblTotalAmount);

        JLabel lblTotal = new JLabel("TOTAL:");
        lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
        lblTotal.setBounds(68, 499, 88, 34);
        frame.getContentPane().add(lblTotal);

        textAreaOrder.setEditable(false);
        scrollPane.setBounds(100, 111, 541, 377);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.getContentPane().add(scrollPane);

        updateOrderDisplay(order, total);

        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(e -> {
            Menu mainApp = new Menu();
            mainApp.setVisible(true);
            frame.dispose();
        });
        btnBack.setBounds(169, 588, 149, 67);
        frame.getContentPane().add(btnBack);

        JButton btnContinue = new JButton("Continue");
        btnContinue.addActionListener(e -> {
            Receipt receipt = new Receipt(total, order);  // ← PASS total & order
            receipt.setVisible(true);
            frame.dispose();
        });
        btnContinue.setBounds(439, 588, 149, 67);
        frame.getContentPane().add(btnContinue);
    }


    private void updateOrderDisplay(LinkedHashMap<String, Double> order, double total) {
        StringBuilder orderText = new StringBuilder("Order Summary:\n\n");
        for (String item : order.keySet()) {
            orderText.append(item).append(" - ₱").append(String.format("%.2f", order.get(item))).append("\n");
        }
        orderText.append("\n").append("TOTAL: ₱").append(String.format("%.2f", total));
        textAreaOrder.setText(orderText.toString());
        lblTotalAmount.setText("₱" + String.format("%.2f", total));
    }


    public void setVisible(boolean b) {
        frame.setVisible(b);
    }
}