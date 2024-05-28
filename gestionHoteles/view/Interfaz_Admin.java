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

        JButton btnAgregarProducto = new JButton("Agregar Producto");
        btnAgregarProducto.setForeground(new Color(128, 0, 128));
        btnAgregarProducto.setFont(new Font("Calibri", Font.PLAIN, 16));
        btnAgregarProducto.setBackground(new Color(255, 255, 255));
        btnAgregarProducto.setBounds(955, 257, 161, 40);
        contentPane.add(btnAgregarProducto);

        JButton btnEliminarProducto = new JButton("Eliminar Producto");
        btnEliminarProducto.setForeground(new Color(128, 0, 128));
        btnEliminarProducto.setFont(new Font("Calibri", Font.PLAIN, 16));
        btnEliminarProducto.setBackground(Color.WHITE);
        btnEliminarProducto.setBounds(955, 326, 161, 40);
        contentPane.add(btnEliminarProducto);

        JButton btnModificarProducto = new JButton("Modificar Producto");
        btnModificarProducto.setForeground(new Color(128, 0, 128));
        btnModificarProducto.setFont(new Font("Calibri", Font.PLAIN, 16));
        btnModificarProducto.setBackground(Color.WHITE);
        btnModificarProducto.setBounds(955, 393, 161, 40);
        contentPane.add(btnModificarProducto);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(199, 111, 251));
        panel.setBounds(0, 0, 1164, 57);
        contentPane.add(panel);
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
