package view;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JLabel;

public class Interfaz_Admin extends JFrame {

	private JPanel contentPane;
	private JTable table;
	static DefaultTableModel tablaFuncional = new DefaultTableModel();


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_Admin frame = new Interfaz_Admin();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Interfaz_Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1180, 683);
		contentPane = new BackgroundPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(94, 132, 810, 417);
        contentPane.add(scrollPane);

        table = new JTable();
        table.setForeground(new Color(255, 255, 255));
        table.setModel(tablaFuncional);
        scrollPane.setViewportView(table);

        tablaFuncional.addColumn("Código");
        tablaFuncional.addColumn("Habitacion");
        tablaFuncional.addColumn("Descripción");
        tablaFuncional.addColumn("Cantidad Personas");
        tablaFuncional.addColumn("Tipo");
        tablaFuncional.addColumn("Precio");
        tablaFuncional.addColumn("Activo");

        JButton btnAgregarHabitacion = new JButton("Agregar Habitación");
        btnAgregarHabitacion.setForeground(new Color(128, 0, 128));
        btnAgregarHabitacion.setFont(new Font("Calibri", Font.PLAIN, 16));
        btnAgregarHabitacion.setBackground(new Color(255, 255, 255));
        btnAgregarHabitacion.setBounds(946, 258, 181, 40);
        contentPane.add(btnAgregarHabitacion);

        JButton btnEliminarHabitacion = new JButton("Eliminar Habitación");
        btnEliminarHabitacion.setForeground(new Color(128, 0, 128));
        btnEliminarHabitacion.setFont(new Font("Calibri", Font.PLAIN, 16));
        btnEliminarHabitacion.setBackground(Color.WHITE);
        btnEliminarHabitacion.setBounds(946, 327, 181, 40);
        contentPane.add(btnEliminarHabitacion);

        JButton btnModificarHabitacion = new JButton("Modificar Habitación");
        btnModificarHabitacion.setForeground(new Color(128, 0, 128));
        btnModificarHabitacion.setFont(new Font("Calibri", Font.PLAIN, 16));
        btnModificarHabitacion.setBackground(Color.WHITE);
        btnModificarHabitacion.setBounds(946, 394, 181, 40);
        contentPane.add(btnModificarHabitacion);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(199, 111, 251));
        panel.setBounds(0, 0, 1164, 66);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("¿Que operación desea realizar?");
        lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel.setBounds(430, 23, 286, 23);
        panel.add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Atrás");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(62, 62, 62));
        btnNewButton.setFont(new Font("Calibri", Font.BOLD, 16));
        btnNewButton.setBounds(20, 21, 77, 28);
        panel.add(btnNewButton);
    }
}

class BackgroundPanel2 extends JPanel {
	private Image backgroundImage;

	public BackgroundPanel2() {
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
