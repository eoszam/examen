package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Examen.ArregloNotas;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Arreglos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtArreglos;
	private JButton btnProcesar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arreglos frame = new Arreglos();
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
	public Arreglos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			txtArreglos = new JTextArea();
			txtArreglos.setBounds(10, 63, 414, 187);
			contentPane.add(txtArreglos);
		}
		{
			btnProcesar = new JButton("Procesar");
			btnProcesar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			        ArregloNotas arreglo = new ArregloNotas(10);
					
					imprimir("Posición de la primera nota mayor a 16: " + arreglo.posicionPrimeraNotaMayor16());
					imprimir("Suma de las notas: " + arreglo.sumarNotas());
					imprimir("Nota mayor: " + arreglo.retornarNotaMayor());
					imprimir("Reemplazo de 10.5 por la nota mayor: " + arreglo.reemplazarNota10());
					imprimir("Incremento de la primera nota mayor a 16: " + arreglo.incrementarNotaMayor16());
				}
				public void imprimir(String text) {
					txtArreglos.append(text+"\n");
				}
			});
			btnProcesar.setBounds(169, 29, 89, 23);
			contentPane.add(btnProcesar);
		}
	}

}
