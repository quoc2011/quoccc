import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class MENU extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MENU frame = new MENU();
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
	public MENU() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(0, 0, 304, 171);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel HELLO = new JLabel("\u304A\u306F\u3088\u3046,");
		HELLO.setBounds(10, 11, 85, 29);
		HELLO.setFont(new Font("Yu Gothic Light", Font.BOLD, 18));
		panel.add(HELLO);
		
		JLabel NAME = new JLabel("TRINH HOANG QUOC.");
		NAME.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		NAME.setBounds(89, 8, 205, 26);
		panel.add(NAME);
		
		JLabel STK = new JLabel("STK:");
		STK.setFont(new Font("Tahoma", Font.BOLD, 20));
		STK.setBounds(115, 75, 46, 29);
		panel.add(STK);
		
		JLabel lblNewLabel = new JLabel("VND:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(115, 115, 74, 18);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("19999999");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(171, 76, 123, 29);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("452,067,760");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(171, 109, 138, 32);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\user (1).png").getImage().getScaledInstance(95,98, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_3.setBounds(10, 51, 95, 98);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\payment.png").getImage().getScaledInstance(76,71, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_5.setBounds(130, 298, 76, 71);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel_6.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\pay.png").getImage().getScaledInstance(76,71, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_6.setBounds(213, 211, 76, 71);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\money (1).png").getImage().getScaledInstance(76,71, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_4.setBounds(20, 211, 76, 71);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel_7.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\money (2).png").getImage().getScaledInstance(76,71, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_7.setBounds(10, 391, 76, 71);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel_8.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\fast.png").getImage().getScaledInstance(76,71, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_8.setBounds(218, 391, 76, 71);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u8D8A\u65E5\u5DE5\u696D\u5927\u5B66");
		lblNewLabel_9.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblNewLabel_9.setBounds(108, 532, 115, 29);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u30B8\u30E7\u30AE\u30F3\u30B0\r\n");
		lblNewLabel_10.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblNewLabel_10.setBounds(213, 462, 81, 29);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("\u7BC0\u7D04\u3059\u308B");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblNewLabel_11.setBounds(10, 462, 76, 29);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("\u6295\u8CC7\u30B3\u30B9\u30C8");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblNewLabel_12.setBounds(113, 367, 110, 29);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("\u5FC5\u8981\u30B3\u30B9\u30C8");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblNewLabel_13.setBounds(0, 272, 115, 47);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("\u767A\u751F\u30B3\u30B9\u30C8");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblNewLabel_14.setBounds(205, 281, 99, 29);
		contentPane.add(lblNewLabel_14);
	}

}
