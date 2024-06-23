package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Examen.Asesor;
import javax.swing.JScrollPane;

public class Resolucion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtSolucion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resolucion frame = new Resolucion();
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
	public Resolucion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnProcesar = new JButton("Procesar");
			btnProcesar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Asesor asesor = new Asesor();
					asesor.setNombre("Carlos");
					asesor.setDni(76267074);
					asesor.setCodigo(1111);
					asesor.setRemuneracionDolares(2000.0);
					
					Asesor asesor2 = new Asesor();			
					asesor2.setNombre("Gabriela");
					asesor2.setDni(76267078);
					asesor2.getCodigo();
					asesor2.getRemuneracionDolares();
					
					Asesor asesor3 = new Asesor();
					asesor3.getNombre();
					asesor3.getDni();
					asesor3.getCodigo();
					asesor3.getRemuneracionDolares();
					
					imprimir("Asesor: "+ asesor.getNombre());
					imprimir("DNI: "+ asesor.getDni());
					imprimir("Codigo: "+ asesor.getCodigo());
					imprimir("Remuneración: "+ asesor.getRemuneracionDolares()+"\n");
					
					imprimir("Asesor: "+ asesor2.getNombre());
					imprimir("DNI: "+ asesor2.getDni());
					imprimir("Codigo: "+ asesor2.getCodigo());
					imprimir("Remuneración: "+ asesor2.getRemuneracionDolares()+"\n");
					
					imprimir("asesor: "+ asesor3.getNombre());
					imprimir("DNI: "+ asesor3.getDni());
					imprimir("Codigo: "+ asesor3.getCodigo());
					imprimir("Remuneración: "+ asesor3.getRemuneracionDolares()+"\n");
					
					imprimir ("Institución: " + Asesor.institucion);
				    imprimir("Total asesores creados: " + Asesor.getAsesorCreados());
				    imprimir("Total remuneración en dólares: " + Asesor.getTodasremuneraciones());
					
				}
				public void imprimir(String text) {
					txtSolucion.append(text+"\n");
				}
			});
			btnProcesar.setBounds(165, 21, 89, 23);
			contentPane.add(btnProcesar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 55, 414, 195);
			contentPane.add(scrollPane);
			{
				txtSolucion = new JTextArea();
				scrollPane.setViewportView(txtSolucion);
			}
		}
	}
}
