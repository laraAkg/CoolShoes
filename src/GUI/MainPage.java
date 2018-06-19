package GUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPage {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Cool Shoes");
		JPanel topPanel = new JPanel();
		JPanel downPanel = new JPanel();
		JLabel order = new JLabel("Order");

		
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		topPanel.setBackground(Color.RED);
		downPanel.setBackground(Color.BLACK);
		topPanel.add(order);
		frame.add(topPanel, BorderLayout.NORTH);
		frame.add(downPanel, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setSize(600,600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
