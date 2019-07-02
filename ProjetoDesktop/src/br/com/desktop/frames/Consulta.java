package br.com.desktop.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Consulta extends JFrame {

	private JPanel contentPane;
	private JTextField txtPaciente;
	private JTextField txtId;
	private JTextField txtData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta frame = new Consulta();
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
	public Consulta() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Consulta.class.getResource("/br/com/desktop/icons/consulta1.png")));
		setTitle("Consulta");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 744, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setToolTipText("Editar consulta");
		btnNewButton.setIcon(new ImageIcon(Consulta.class.getResource("/br/com/desktop/icons/update.png")));
		btnNewButton.setBounds(362, 361, 64, 64);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setToolTipText("Agendar consulta");
		button.setIcon(new ImageIcon(Consulta.class.getResource("/br/com/desktop/icons/create.png")));
		button.setBounds(165, 361, 64, 64);
		contentPane.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setToolTipText("Apagar consulta");
		button_1.setIcon(new ImageIcon(Consulta.class.getResource("/br/com/desktop/icons/delete.png")));
		button_1.setBounds(465, 361, 64, 64);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setToolTipText("Pesquisar consulta");
		button_2.setIcon(new ImageIcon(Consulta.class.getResource("/br/com/desktop/icons/read.png")));
		button_2.setBounds(262, 361, 64, 64);
		contentPane.add(button_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(370, 11, 348, 167);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Paciente:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(0, 17, 58, 14);
		panel.add(lblNewLabel);
		
		txtPaciente = new JTextField();
		txtPaciente.setBounds(68, 14, 134, 20);
		panel.add(txtPaciente);
		txtPaciente.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Consulta.class.getResource("/br/com/desktop/icons/pesquisar.png")));
		lblNewLabel_1.setBounds(212, 11, 32, 32);
		panel.add(lblNewLabel_1);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(297, 14, 41, 20);
		panel.add(txtId);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(255, 17, 32, 14);
		panel.add(lblId);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 53, 328, 103);
		panel.add(textPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 190, 708, 160);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(292, 46, 142, 22);
		panel_1.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Fonoaudi\u00F3logo(a)", "Nutricionista", "Fisioterapeuta", "Vocal Coach"}));
		
		JLabel lblTipoDeEspecialista = new JLabel("Tipo de Especialista:");
		lblTipoDeEspecialista.setBounds(71, 50, 115, 14);
		panel_1.add(lblTipoDeEspecialista);
		
		JLabel lblAgendarConsulta = new JLabel("Agendar consulta:");
		lblAgendarConsulta.setBounds(191, 99, 93, 14);
		panel_1.add(lblAgendarConsulta);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 11, 350, 167);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblData = new JLabel("DATA DA CONSULTA: ");
		lblData.setHorizontalAlignment(SwingConstants.RIGHT);
		lblData.setBounds(0, 11, 140, 14);
		panel_2.add(lblData);
		
		JLabel lblAgendamento = new JLabel("AGENDAMENTO:");
		lblAgendamento.setBounds(54, 89, 48, 14);
		panel_2.add(lblAgendamento);
		
		JLabel lblHorrio = new JLabel("HOR\u00C1RIO DA CONSULTA:");
		lblHorrio.setBounds(10, 64, 182, 14);
		panel_2.add(lblHorrio);
		
		txtData = new JTextField();
		txtData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		MaskFormatter dataConsulta=null;
		try {
			dataConsulta= new MaskFormatter("##/##/####");
		} catch (Exception e) {e.printStackTrace();}
		
		txtData.setBounds(143, 8, 74, 20);
		panel_2.add(txtData);
		txtData.setColumns(10);
	}
}
