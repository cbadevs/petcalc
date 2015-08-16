package petcalc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class marFormulario extends JFrame implements ActionListener, ChangeListener, ItemListener {
	private JLabel label1, label2, operacion, resultado;
	private JCheckBox check1;
	private JTextField textfield1;
	private JButton boton1;
	private JComboBox combo1;
	private JRadioButton radio1,radio2,radio3;
    private ButtonGroup bg;

	public marFormulario() {
		setLayout(null);
		
		check1 = new JCheckBox("Apagado");
		check1.setBounds(10, 10, 100, 30);
		check1.addChangeListener(this);
		add(check1);
		
		label1 = new JLabel("La operaciones:");
		label1.setBounds(10, 50, 200, 30);
		add(label1);
		
		operacion = new JLabel("- * - = -");
		operacion.setBounds(120, 50, 400, 30);
		add(operacion);
		
		label2 = new JLabel("La X :");
		label2.setBounds(10, 100, 100, 30);
		add(label2);
		
		textfield1=new JTextField();
        textfield1.setBounds(100,100,50,30);
        add(textfield1);

		boton1 = new JButton("Resolver");
		boton1.setBounds(10, 225, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
		boton1.setEnabled(false);

		combo1 = new JComboBox();
		combo1.setBounds(300, 10, 80, 20);
		add(combo1);
		combo1.addItem("Nivel 1");
		combo1.addItem("Nivel 2");
		combo1.addItem("Nivel 3");
		combo1.addItem("Nivel 4");
		combo1.addItemListener(this);
		
		bg=new ButtonGroup();
        radio1=new JRadioButton("Suma");
        radio1.setBounds(300,40,100,30);
        radio1.addChangeListener(this);
        add(radio1);
        bg.add(radio1);
        radio2=new JRadioButton("Rest");
        radio2.setBounds(300,70,100,30);
        radio2.addChangeListener(this);        
        add(radio2);
        bg.add(radio2);
        radio3=new JRadioButton("Mult");
        radio3.setBounds(300,100,100,30);
        radio3.addChangeListener(this);        
        add(radio3);
        bg.add(radio3);  
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == combo1) {
			String seleccionado = (String) combo1.getSelectedItem();
			setTitle(seleccionado);
		}
	}

	public void stateChanged(ChangeEvent e) {
		if (check1.isSelected() == true) {
			radio1.setSelected(true);
			boton1.setEnabled(true);
		} else {
			boton1.setEnabled(false);
		}
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			System.exit(0);
		}
	}

	public static void main(String[] ar) {
		marFormulario formulario1 = new marFormulario();
		formulario1.setBounds(10, 10, 400, 300);
		formulario1.setVisible(true);
	}
}