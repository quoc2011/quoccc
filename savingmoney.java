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
		lblNewLabel_1.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\pig (1).png").getImage().getScaledInstance(104,91, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_1.setBounds(20, 53, 104, 91);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\pig (1).png").getImage().getScaledInstance(104,
				91, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_2.setBounds(177, 53, 104, 91);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\pig (1).png").getImage().getScaledInstance(104,
				91, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_3.setBounds(101, 228, 104, 91);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u8D8A\u65E5\u5DE5\u696D\u5927\u5B66\r\n");
		lblNewLabel_4.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(101, 448, 104, 25);
		panel_1.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("\u6708");
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
		btnNewButton.setBounds(30, 155, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u9031\r\n\r\n\r\n\r\n");
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
		btnNewButton_1.setBounds(187, 156, 89, 22);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u5E74\r\n");
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
		btnNewButton_2.setBounds(111, 330, 89, 23);
		panel_1.add(btnNewButton_2);
		 

	}
}
