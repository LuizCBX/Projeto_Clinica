package br.com.desktop.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/br/com/desktop/icons/pesquisar.png")));
		setTitle("Sistema Desktop Voz&Vida\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSobre = new JButton("");
		btnSobre.setIcon(new ImageIcon(Principal.class.getResource("/br/com/desktop/icons/question-mark.png")));
		btnSobre.setToolTipText("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				About sobre = new About();
				sobre.setVisible(true);
				
			}
		});
		btnSobre.setBounds(493, 11, 32, 32);
		contentPane.add(btnSobre);
		
		//PACIENTES
		JButton btnPacientes = new JButton("Pacientes");
		btnPacientes.setToolTipText("Pacientes");
		btnPacientes.setIcon(new ImageIcon(Principal.class.getResource("/br/com/desktop/icons/paciente.png")));
		btnPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Clientes cliente = new Clientes();
				cliente.setVisible(true);
				
			}
		});
		btnPacientes.setBounds(27, 45, 128, 128);
		contentPane.add(btnPacientes);
		
		JButton btnUsuarios = new JButton("Usu\u00E1rios");
		btnUsuarios.setToolTipText("Usu\u00E1rios");
		btnUsuarios.setIcon(new ImageIcon(Principal.class.getResource("/br/com/desktop/icons/usuarios.png")));
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuarios usuario = new Usuarios();
				usuario.setVisible(true);
			}
		});
		btnUsuarios.setBounds(27, 212, 128, 128);
		contentPane.add(btnUsuarios);
		
		JButton btnRelatorios = new JButton("Relat\u00F3rios");
		btnRelatorios.setToolTipText("Relat\u00F3rios");
		btnRelatorios.setIcon(new ImageIcon(Principal.class.getResource("/br/com/desktop/icons/relatorio.png")));
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reports report = new Reports();
				report.setVisible(true);
			}
		});
		btnRelatorios.setBounds(343, 212, 128, 128);
		contentPane.add(btnRelatorios);
		
		JButton btnConsultas = new JButton("Consultas");
		btnConsultas.setToolTipText("Consultas");
		btnConsultas.setIcon(new ImageIcon(Principal.class.getResource("/br/com/desktop/icons/consulta1.png")));
		btnConsultas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Consulta consulta = new Consulta();
				consulta.setVisible(true);
			}
		});
		btnConsultas.setBounds(343, 45, 128, 128);
		contentPane.add(btnConsultas);
		
		//PROFISSIONAIS
		JButton btnTipoEspecialista = new JButton("Tipo especialista");
		btnTipoEspecialista.setToolTipText("Profissionais");
		btnTipoEspecialista.setIcon(new ImageIcon(Principal.class.getResource("/br/com/desktop/icons/medico.png")));
		btnTipoEspecialista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TipoEspecialista profissionais =  new TipoEspecialista();
				profissionais.setVisible(true);
				
			}
		});
		btnTipoEspecialista.setBounds(186, 125, 128, 128);
		contentPane.add(btnTipoEspecialista);
	}

}
