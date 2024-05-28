package view;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Interfaz_Registro extends JFrame {

	private JPanel contentPane;
	private JTextField text_Dni;
	private JPasswordField text_Contraseña;
	private JTextField textField;
	private JTextField text_Nombre;
	private JTextField text_Apellido;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_Login frame = new Interfaz_Login();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Interfaz_Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1180, 683);
		contentPane = new BackgroundPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(301, 41, 539, 552);
		contentPane.add(panel);
		
		text_Dni = new JTextField();
		text_Dni.setText(" ");
		text_Dni.setForeground(Color.BLACK);
		text_Dni.setFont(new Font("Calibri", Font.PLAIN, 17));
		text_Dni.setColumns(10);
		text_Dni.setBackground(Color.WHITE);
		text_Dni.setBounds(272, 224, 240, 41);
		panel.add(text_Dni);
		
		JLabel lblNewLabel_2 = new JLabel("DNI");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(29, 191, 65, 32);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Contraseña");
		lblNewLabel_2_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(272, 191, 240, 32);
		panel.add(lblNewLabel_2_1);
		
		text_Contraseña = new JPasswordField();
		text_Contraseña.setForeground(Color.BLACK);
		text_Contraseña.setFont(new Font("Calibri", Font.BOLD, 15));
		text_Contraseña.setBackground(Color.WHITE);
		text_Contraseña.setBounds(29, 224, 222, 41);
		panel.add(text_Contraseña);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setForeground(Color.WHITE);
		btnRegistrarse.setFont(new Font("Calibri", Font.BOLD, 16));
		btnRegistrarse.setBackground(new Color(70, 70, 70));
		btnRegistrarse.setBounds(29, 481, 483, 41);
		panel.add(btnRegistrarse);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(new Color(204, 125, 251));
		panel_1.setBackground(new Color(204, 125, 251));
		panel_1.setBounds(0, 0, 539, 91);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("¡Bienvenido!");
		lblNewLabel.setForeground(new Color(64, 0, 64));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 25));
		lblNewLabel.setBackground(new Color(64, 0, 64));
		lblNewLabel.setBounds(20, 11, 141, 49);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Complete su información");
		lblNewLabel_2_2_2.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblNewLabel_2_2_2.setBounds(20, 48, 167, 32);
		panel_1.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_mail = new JLabel("Email\r\n");
		lblNewLabel_mail.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblNewLabel_mail.setBounds(29, 278, 102, 32);
		panel.add(lblNewLabel_mail);
		
		textField = new JTextField();
		textField.setText(" ");
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Calibri", Font.PLAIN, 17));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(29, 307, 483, 41);
		panel.add(textField);
		
		text_Nombre = new JTextField();
		text_Nombre.setText(" ");
		text_Nombre.setForeground(Color.BLACK);
		text_Nombre.setFont(new Font("Calibri", Font.PLAIN, 17));
		text_Nombre.setColumns(10);
		text_Nombre.setBackground(Color.WHITE);
		text_Nombre.setBounds(29, 139, 222, 41);
		panel.add(text_Nombre);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nombre");
		lblNewLabel_2_2.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(29, 107, 65, 32);
		panel.add(lblNewLabel_2_2);
		
		text_Apellido = new JTextField();
		text_Apellido.setText(" ");
		text_Apellido.setForeground(Color.BLACK);
		text_Apellido.setFont(new Font("Calibri", Font.PLAIN, 17));
		text_Apellido.setColumns(10);
		text_Apellido.setBackground(Color.WHITE);
		text_Apellido.setBounds(274, 139, 238, 41);
		panel.add(text_Apellido);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Apellido");
		lblNewLabel_2_2_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblNewLabel_2_2_1.setBounds(274, 107, 65, 32);
		panel.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_mail_1 = new JLabel("Preferencia de contacto");
		lblNewLabel_mail_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblNewLabel_mail_1.setBounds(29, 384, 169, 32);
		panel.add(lblNewLabel_mail_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Email", "SMS", "Whatsapp"}));
		comboBox.setBounds(29, 416, 483, 41);
		panel.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("* Por favor complete los campos");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 16));
		lblNewLabel_3.setBounds(282, 366, 230, 20);
		panel.add(lblNewLabel_3);
		
		Button button = new Button("Volver\r\n");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Interfaz_Login login = new Interfaz_Login();
				login.setVisible(true);
				login.setLocationRelativeTo(null); 
                dispose(); 
			}
		});
		
		button.setFont(new Font("Calibri", Font.BOLD, 14));
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(70, 70, 70));
		button.setBounds(25, 22, 87, 34);
		contentPane.add(button);
	}
}


class BackgroundPanel1 extends JPanel {
	private Image backgroundImage;

	public BackgroundPanel1() {
		// Cargar la imagen
		ImageIcon icon = new ImageIcon("C:\\Users\\marti\\Documents\\GitHub\\Gestion-Hotel\\gestionHoteles\\img\\blob-login.png");
		backgroundImage = icon.getImage();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Dibujar la imagen escalada para llenar todo el panel
		g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
	}
}
