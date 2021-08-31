package gui;


import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textFieldLU;
	private JTextField textFieldApellido;
	private JTextField textFieldNombre;
	private JTextField textFieldEmail;
	private JTextField textFieldGithubURL;
	private JLabel lblHoraGenerada;
	private JPanel panel;
	private JLabel ImgLabel;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\54293\\Desktop\\Universidad\\2nd year\\Segundo Cuatrimestre\\Tecnologia de la programacion\\New folder\\proyecto-1\\src\\images\\tdp.png"));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(626, 249));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 183);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 250));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(null);
		
		JLabel lblLU = new JLabel("LU");
		lblLU.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLU.setBounds(22, 23, 61, 14);
		tabInformation.add(lblLU);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellido.setBackground(Color.WHITE);
		lblApellido.setBounds(22, 48, 61, 14);
		tabInformation.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(22, 73, 61, 14);
		tabInformation.add(lblNombre);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setBounds(22, 98, 61, 14);
		tabInformation.add(lblEmail);
		
		JLabel lblGithubURL = new JLabel("Github URL");
		lblGithubURL.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGithubURL.setBounds(22, 123, 71, 14);
		tabInformation.add(lblGithubURL);
		
		textFieldLU = new JTextField();
		textFieldLU.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldLU.setToolTipText("Muesta el numero de libreta del alumno\r\n");
		textFieldLU.setBounds(103, 23, 266, 20);
		tabInformation.add(textFieldLU);
		textFieldLU.setColumns(10);
		textFieldLU.setText(""+studentData.getId());
		
		
		textFieldApellido = new JTextField();
		textFieldApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldApellido.setToolTipText("Muestra el apellido del alumno.\r\n");
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(103, 48, 266, 20);
		tabInformation.add(textFieldApellido);
		textFieldApellido.setText(""+studentData.getLastName());
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldNombre.setToolTipText("Muestra el nombre del alumno.\r\n");
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(103, 73, 266, 20);
		tabInformation.add(textFieldNombre);
		textFieldNombre.setText(""+studentData.getFirstName());

		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldEmail.setToolTipText("Muestra el E-mail del alumno.\r\n");
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(104, 98, 266, 20);
		tabInformation.add(textFieldEmail);
		textFieldEmail.setText(""+studentData.getMail());
		
		textFieldGithubURL = new JTextField();
		textFieldGithubURL.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldGithubURL.setToolTipText("Muestra el URL de Github del alumno.\r\n");
		textFieldGithubURL.setColumns(10);
		textFieldGithubURL.setBounds(104, 123, 266, 20);
		tabInformation.add(textFieldGithubURL);
		contentPane.add(tabbedPane);
		textFieldGithubURL.setText(""+studentData.getGithubURL());
		

		
		lblHoraGenerada = new JLabel("");
		lblHoraGenerada.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHoraGenerada.setBounds(15, 188, 420, 14);
		contentPane.add(lblHoraGenerada);
		SimpleDateFormat formatmatter = new SimpleDateFormat("'Esta ventana fue generada el ' dd/MM/yyyy 'a las ' HH:mm:ss");
		Date fecha = new Date(System.currentTimeMillis());
		lblHoraGenerada.setText(""+formatmatter.format(fecha));
		
		panel = new JPanel();
		panel.setBounds(434, 25, 176, 158);
		contentPane.add(panel);
		panel.setLayout(null);
		
		ImgLabel = new JLabel("");
		ImgLabel.setBounds(0, 0, 176, 158);
		panel.add(ImgLabel);
		ImgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ImgLabel.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())));
		
		
	}
}
