package fr.iutvalence.S3.TurtleBot.Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class TurtleBot {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TurtleBot window = new TurtleBot();
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
	public TurtleBot() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Titre
		JLabel lblContrleDunRobot = new JLabel("- Carte -");
		lblContrleDunRobot.setBounds(0, 0, 284, 33);
		lblContrleDunRobot.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblContrleDunRobot);
		
		JButton button = new JButton("");
		button.setBackground(UIManager.getColor("Button.background"));
		button.setIcon(new ImageIcon(TurtleBot.class.getResource("/fr/iutvalence/S3/TurtleBot/Ic\u00F4nes/croix2.png")));
		button.setBounds(244, 0, 40, 40);
		frame.getContentPane().add(button);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 49, 264, 352);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Carte");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 264, 352);
		lblNewLabel.setBackground(UIManager.getColor("Button.darkShadow"));
		panel.add(lblNewLabel);
	}
}