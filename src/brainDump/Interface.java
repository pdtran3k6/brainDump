package brainDump;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Interface {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
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
		
		JLabel header = new JLabel("What's on your mind right now? Get it out.");
		header.setFont(new Font("Tahoma", Font.PLAIN, 14));
		header.setBounds(10, 31, 414, 37);
		frame.getContentPane().add(header);
		
		JLabel status = new JLabel("");
		status.setHorizontalAlignment(SwingConstants.CENTER);
		status.setFont(new Font("Tahoma", Font.BOLD, 14));
		status.setBounds(10, 176, 414, 37);
		frame.getContentPane().add(status);
		
		JFormattedTextField textField = new JFormattedTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
					String item = textField.getText();
					status.setText(item + "... Got it!");
				}
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(10, 69, 384, 37);
		frame.getContentPane().add(textField);
		
		JButton btnAddToList = new JButton("Add to list");
		btnAddToList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item = textField.getText();
				status.setText(item + "... Got it!");
			}
		});
		btnAddToList.setBackground(Color.WHITE);
		btnAddToList.setForeground(Color.BLACK);
		btnAddToList.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAddToList.setBounds(10, 117, 144, 23);
		frame.getContentPane().add(btnAddToList);
	}
}
