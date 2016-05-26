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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


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
		frame.getContentPane().setBackground(new Color(238, 232, 170));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 479, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Header
		JLabel header = new JLabel("         What's on your mind right now? Get it out.");
		header.setBounds(10, 7, 612, 39);
		header.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(header);
		
		// Status box
		JLabel status = new JLabel("");
		status.setBounds(10, 108, 444, 37);
		status.setHorizontalAlignment(SwingConstants.CENTER);
		status.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(status);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 157, 208, 230);
		frame.getContentPane().add(scrollPane);
		
		JTextArea itemList = new JTextArea();
		scrollPane.setViewportView(itemList);
		
		// When pressed 'Enter' or click the '+' button, input text will be displayed and stored in the current list
		// Input box
		JFormattedTextField textField = new JFormattedTextField();
		textField.setBounds(10, 57, 389, 29);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(textField);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
					String item = textField.getText();
					status.setText('"' + item + '"' + "... Got it!");
					itemList.append(item + "\n");
					textField.setText("");
				}
			}
		});
		
		// Button '+'
		JButton btnAddToList = new JButton("+");
		btnAddToList.setBounds(409, 57, 45, 29);
		btnAddToList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item = textField.getText();
				status.setText('"' + item + '"' + "... Got it!");
				itemList.append(item + "\n");
				textField.setText("");
			}
		});
		btnAddToList.setBackground(Color.WHITE);
		btnAddToList.setForeground(Color.BLACK);
		btnAddToList.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.getContentPane().add(btnAddToList);
		
		JButton btnDone = new JButton("Done");
		btnDone.setForeground(Color.BLACK);
		btnDone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDone.setBackground(Color.WHITE);
		btnDone.setBounds(266, 174, 93, 29);
		frame.getContentPane().add(btnDone);
		
		
	}
}
