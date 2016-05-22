package brainDump;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Color;

public class Layout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layout window = new Layout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Layout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddToList = new JButton("Add to list");
		btnAddToList.setBackground(Color.GRAY);
		btnAddToList.setForeground(Color.BLACK);
		btnAddToList.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAddToList.setBounds(10, 117, 144, 23);
		frame.getContentPane().add(btnAddToList);
		
		JFormattedTextField textField = new JFormattedTextField();
		textField.setBounds(10, 69, 384, 37);
		frame.getContentPane().add(textField);
		
		JLabel header = new JLabel("What's on your mind right now? Get it out.");
		header.setFont(new Font("Tahoma", Font.PLAIN, 14));
		header.setBounds(10, 31, 414, 37);
		frame.getContentPane().add(header);
		
		JLabel status = new JLabel("");
		status.setFont(new Font("Tahoma", Font.BOLD, 14));
		status.setBounds(10, 176, 414, 37);
		frame.getContentPane().add(status);
	}
}
