package petcalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ChangeListener;

public class ver extends JFrame {

	private JPanel contentPane;
	private JTextField valorX;
	private final ButtonGroup operador = new ButtonGroup();
	private JComboBox nivel = new JComboBox();
	JLabel mostrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ver frame = new ver();
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
	public ver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEnviar = new JButton("Resolver");
		btnEnviar.setBounds(321, 227, 89, 23);
		contentPane.add(btnEnviar);
		
		JRadioButton r1 = new JRadioButton("Suma");
		r1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println(nivel.getSelectedIndex());
			}
		});
		operador.add(r1);
		r1.setSelected(true);
		r1.setBounds(319, 37, 109, 23);
		contentPane.add(r1);
		
		JRadioButton r2 = new JRadioButton("Rest");
		r2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println(nivel.getSelectedIndex());
			}
		});
		operador.add(r2);
		r2.setBounds(319, 63, 109, 23);
		contentPane.add(r2);
		
		JRadioButton r3 = new JRadioButton("Divi");
		operador.add(r3);
		r3.setBounds(319, 89, 109, 23);
		contentPane.add(r3);
		
		JRadioButton r4 = new JRadioButton("Mult");
		operador.add(r4);
		r4.setBounds(319, 115, 109, 23);
		contentPane.add(r4);
		
		nivel.setModel(new DefaultComboBoxModel(new String[] {"Nivel 1", "Nivel 2", "Nivel 3", "Nivel 4"}));
		nivel.setBounds(321, 11, 89, 20);
		contentPane.add(nivel);
		
		JLabel lblOperacin = new JLabel("Operaci\u00F3n :");
		lblOperacin.setBounds(21, 41, 67, 14);
		contentPane.add(lblOperacin);
		
		JLabel lblLaX = new JLabel("La X:");
		lblLaX.setBounds(21, 67, 46, 14);
		contentPane.add(lblLaX);
		
		JLabel mostrar = new JLabel("- * - = -");
		mostrar.setBounds(87, 41, 46, 14);
		contentPane.add(mostrar);
		
		valorX = new JTextField();
		valorX.setBounds(77, 64, 67, 20);
		contentPane.add(valorX);
		valorX.setColumns(10);
		
		JLabel resultado = new JLabel("----------------");
		resultado.setBounds(21, 119, 241, 14);
		contentPane.add(resultado);
	}
	
	public void stateChanged(ChangeEvent e) {
		/*if (check1.isSelected() == true) {
			radio1.setSelected(true);
			boton1.setEnabled(true);
		} else {
			boton1.setEnabled(false);
		}*/
		
		Operaciones juego;
		juego = new Operaciones();
		juego.Iniciar(nivel.getSelectedIndex());
		
		System.out.println(nivel.getSelectedIndex());
		
		juego.Suma();
		
		System.out.println(operador.getSelection().getSelectedObjects().toString());
		
		switch (operador.getSelection().getSelectedObjects().toString()) {
		case "Suma":
			juego.Suma();
			break;
		case "Rest":
			juego.Rest();
			break;
		case "Divi":
			juego.Milt();
			break;
		case "Mult":
			juego.Divi();
			break;
		}

/*		System.out.println(juego.Mostrar());

		System.out.print("Ingrese el valor:");
		valorX = teclado.nextInt();

		if (valorX == juego.setOculto()) {
			System.out.print("Felicitaciones");
		} else {
			System.out.print("Eso ha estado serca vuele a intentarlo");
		}
		*/
	}
}
