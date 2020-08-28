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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class phithietyeu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					phithietyeu frame = new phithietyeu();
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
	public phithietyeu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 314, 47);
		panel.setBackground(Color.YELLOW);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u5FC5\u8981\u30B3\u30B9\u30C8");
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(60, 0, 185, 58);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose ();
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\wrong.png").getImage().getScaledInstance(37,36, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_1.setBounds(267, 0, 37, 36);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose ();
				MENU m12frame = new MENU();
				m12frame.setUndecorated(true);
				m12frame.setVisible(true);
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Downloads\\return.png").getImage().getScaledInstance(37,36, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_2.setBounds(0, 0, 37, 36);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 46, 304, 515);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon (new ImageIcon("C:\\Users\\Admin\\Desktop\\118507899_740822143129872_5601457749385823101_n.jpg").getImage().getScaledInstance(304,515, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_3.setBounds(0, 0, 304, 515);
		panel_1.add(lblNewLabel_3);
	}
}
