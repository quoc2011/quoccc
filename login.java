import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel login;
	private JButton signin;
	private JLabel chude;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 600);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(79, 248, 171, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(79, 307, 171, 26);
		contentPane.add(passwordField);
		
		JLabel username = new JLabel("");
		username.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\user.png").getImage().getScaledInstance(34,32, java.awt.Image.SCALE_SMOOTH)));
		username.setBounds(35, 248, 34, 32);
		contentPane.add(username);
		
		JLabel pass = new JLabel("");
		pass.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\key.png").getImage().getScaledInstance(34,26, java.awt.Image.SCALE_SMOOTH)));
		pass.setBounds(35, 307, 34, 26);
		contentPane.add(pass);
		
		login = new JLabel("\u30ED\u30B0\u30A4\u30F3");
		login.setForeground(Color.BLACK);
		login.setFont(new Font("Yu Gothic UI", Font.BOLD, 65));
		login.setHorizontalAlignment(SwingConstants.CENTER);
		login.setBounds(53, 85, 207, 102);
		contentPane.add(login);
		
		signin = new JButton("\u30ED\u30B0\u30A4\u30F3");
		signin.setHorizontalTextPosition(SwingConstants.CENTER);
		signin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		signin.setFont(new Font("Yu Gothic Medium", Font.BOLD, 16));
		signin.setBounds(86, 408, 133, 32);
		contentPane.add(signin);
		
		chude = new JLabel("\u8D8A\u65E5\u5DE5\u696D\u5927\u5B66");
		chude.setForeground(Color.BLACK);
		chude.setHorizontalTextPosition(SwingConstants.CENTER);
		chude.setHorizontalAlignment(SwingConstants.CENTER);
		chude.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		chude.setBounds(103, 532, 105, 29);
		contentPane.add(chude);
	}
}
