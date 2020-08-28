import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Screen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen frame = new Screen();
					frame.setUndecorated(true);

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
	public Screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u500B\u4EBA\u8A08\u7C3F");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 60));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 34, 294, 150);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\money.png").getImage().getScaledInstance(105,89, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_1.setBounds(99, 213, 105, 89);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u8D8A\u65E5\u5DE5\u696D\u5927\u5B66\r\n");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		lblNewLabel_2.setBounds(84, 519, 133, 31);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("\u30ED\u30B0\u30A4\u30F3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				login lframe = new login();
				lframe.setUndecorated(true);

				lframe.setVisible(true);
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			
				
			}
		});
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		btnNewButton.setBounds(84, 412, 150, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\wrong.png").getImage().getScaledInstance(31,31, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_3.setBounds(273, 0, 31, 31);
		contentPane.add(lblNewLabel_3);
	}
}
