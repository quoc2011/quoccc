import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class chayboquoc extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chayboquoc frame = new chayboquoc();
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
	public chayboquoc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(0, 0, 304, 38);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u571F\u66DC\u65E5");
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(112, 0, 75, 38);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose ();
			}
		});
		lblNewLabel_8.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\wrong.png").getImage().getScaledInstance(31,27, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_8.setBounds(273, 0, 31, 27);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose ();
				MENU m1frame = new MENU();
				m1frame.setUndecorated(true);

				m1frame.setVisible(true);
			}
		});
		lblNewLabel_9.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\return.png").getImage().getScaledInstance(31,28, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_9.setBounds(0, 0, 31, 28);
		panel.add(lblNewLabel_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 37, 304, 230);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Desktop\\118369856_1714370095405347_8672121704493614457_n.png").getImage().getScaledInstance(304,230, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_1.setBounds(0, 0, 304, 230);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 266, 304, 316);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.YELLOW);
		panel_3.setBounds(10, 0, 284, 70);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\trail-running.png").getImage().getScaledInstance(64,48, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_2.setBounds(10, 11, 64, 48);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2,2 km");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(74, 12, 158, 47);
		panel_3.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.YELLOW);
		panel_4.setBounds(10, 81, 284, 70);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\time.png").getImage().getScaledInstance(64,48, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_4.setBounds(10, 11, 64, 48);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("0:37:20");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(84, 11, 135, 48);
		panel_4.add(lblNewLabel_5);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.YELLOW);
		panel_5.setBounds(10, 162, 284, 70);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\weather.png").getImage().getScaledInstance(64,48, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_6.setBounds(10, 11, 64, 48);
		panel_5.add(lblNewLabel_6);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.YELLOW);
		panel_6.setBounds(10, 243, 284, 51);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("1,936 VND");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_7.setBounds(82, 11, 170, 29);
		panel_6.add(lblNewLabel_7);
	}
}
