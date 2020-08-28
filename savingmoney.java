import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class savingmoney extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					savingmoney frame = new savingmoney();
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
	public savingmoney() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 304, 88);
		panel.setBackground(Color.YELLOW);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u9810\u91D1\r\n\r\n\r\n\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 40));
		lblNewLabel.setBounds(67, 22, 156, 66);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
				
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\wrong.png").getImage().getScaledInstance(31,29, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_5.setBounds(273, 0, 31, 29);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				MENU sxframe = new MENU();
							sxframe.setUndecorated(true);

				sxframe.setVisible(true);
			}
		});
		lblNewLabel_6.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\return.png").getImage().getScaledInstance(31,29, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_6.setBounds(0, 0, 31, 29);
		panel.add(lblNewLabel_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 88, 304, 473);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(20, 53, 104, 91);
		lblNewLabel_1.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\pig (1).png").getImage().getScaledInstance(104,91, java.awt.Image.SCALE_SMOOTH)));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(177, 53, 104, 91);
		lblNewLabel_2.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\pig (1).png").getImage().getScaledInstance(104,
				91, java.awt.Image.SCALE_SMOOTH)));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(101, 228, 104, 91);
		lblNewLabel_3.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\pig (1).png").getImage().getScaledInstance(104,
				91, java.awt.Image.SCALE_SMOOTH)));
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u8D8A\u65E5\u5DE5\u696D\u5927\u5B66\r\n");
		lblNewLabel_4.setBounds(101, 448, 104, 25);
		lblNewLabel_4.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("\u6708");
		btnNewButton.setBounds(30, 155, 89, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 String money;

				 money = JOptionPane.showInputDialog("Enter money for month");
				 double m=Integer.parseInt(money);  
				 m= m*1.004;
			        JOptionPane.showMessageDialog(null,m, "INTEREST MONTHLY", JOptionPane.INFORMATION_MESSAGE);
			    
			
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u9031\r\n\r\n\r\n\r\n");
		btnNewButton_1.setBounds(187, 156, 89, 22);
		btnNewButton_1.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String money1;
				money1 = JOptionPane.showInputDialog("Enter money for week");
				double  w=Integer.parseInt(money1);
				w=w*1.0015;
				JOptionPane.showMessageDialog(null,w, "INTEREST WEEKLY", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u5E74\r\n");
		btnNewButton_2.setBounds(111, 330, 89, 23);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String money2;
				money2 = JOptionPane.showInputDialog("Enter money for YEAR");
				double  y=Integer.parseInt(money2);
				y=y*1.01;
				JOptionPane.showMessageDialog(null,y, "INTEREST YEARLY", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btnNewButton_2.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_7 = new JLabel("1\u9031\u9593\u3042\u305F\u308A\u306E\u91D1\u5229\u306F1.5\uFF05\u3067\u3059\u3002\r\n");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setBounds(59, 364, 187, 35);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u6708\u5229\u306F4\uFF05\u3067\u3059\u3002\r\n");
		lblNewLabel_8.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(69, 382, 153, 35);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u5E74\u6B21\u5F62\u5F0F\u3067\u306F\u3001\u5E74\u5229\u306F10\uFF05\u3067\u3059\u3002");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setForeground(Color.RED);
		lblNewLabel_9.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(59, 410, 187, 27);
		panel_1.add(lblNewLabel_9);
		 

	}
}
