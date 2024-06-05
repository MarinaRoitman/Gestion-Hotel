package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Interfaz_EliminarHabitacion extends JFrame {

    private JPanel contentPane;
    private JTextField textDNI;
    private JTextField DNI_EliminarHuesped;

    public Interfaz_EliminarHabitacion() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 607, 408);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(206, 140, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(10, 11, 179, 311);
        contentPane.add(panel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(new Color(231, 198, 255));
        panel_1.setBounds(0, 332, 591, 38);
        contentPane.add(panel_1);
        
        JButton btnAgregar = new JButton("Eliminar");
        btnAgregar.setBackground(new Color(255, 255, 255));
        btnAgregar.setBounds(473, 8, 100, 23);
        panel_1.add(btnAgregar);
        
        JLabel lblEliminarHusped = new JLabel("Eliminar Habitación");
        lblEliminarHusped.setFont(new Font("Calibri", Font.BOLD, 16));
        lblEliminarHusped.setBounds(334, 83, 146, 20);
        contentPane.add(lblEliminarHusped);
        
        JLabel lblNombre_1_1 = new JLabel("Código:");
        lblNombre_1_1.setFont(new Font("Calibri", Font.PLAIN, 16));
        lblNombre_1_1.setBounds(230, 143, 62, 17);
        contentPane.add(lblNombre_1_1);
        
        DNI_EliminarHuesped = new JTextField();
        DNI_EliminarHuesped.setColumns(10);
        DNI_EliminarHuesped.setBounds(312, 137, 236, 25);
        contentPane.add(DNI_EliminarHuesped);
        
        JLabel mensajeErrorDNI = new JLabel("* Campos vacios o Datos incorrectos");
        mensajeErrorDNI.setForeground(Color.RED);
        mensajeErrorDNI.setFont(new Font("Calibri", Font.BOLD, 16));
        mensajeErrorDNI.setBounds(300, 171, 248, 26);
        contentPane.add(mensajeErrorDNI);

        // Centrar la ventana cuando se hace visible
        setLocationRelativeTo(null);
    }
}
