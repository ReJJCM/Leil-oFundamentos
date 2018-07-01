package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UserRegister extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField email;
	private JTextField nationalId;
	private JLabel lblCpf;
	private JRadioButton isPerson;
	private JRadioButton isCompany;
	private UserController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegister frame = new UserRegister();
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
	public UserRegister() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 453, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);

		controller = new UserController();

		UserRegisterListener listener = new UserRegisterListener();

		isPerson = new JRadioButton("Pessoa Física");
		isPerson.setSelected(true);
		isPerson.setBounds(27, 23, 141, 23);
		isPerson.setActionCommand("changeToPerson");
		isPerson.addActionListener(listener);
		contentPane.add(isPerson);

		isCompany = new JRadioButton("Pessoa Jurídica");
		isCompany.setBounds(207, 23, 141, 23);
		isCompany.setActionCommand("changeToCompany");
		isCompany.addActionListener(listener);
		contentPane.add(isCompany);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(27, 81, 61, 16);
		contentPane.add(lblNome);

		name = new JTextField();
		name.setBounds(116, 76, 217, 26);
		contentPane.add(name);
		name.setColumns(10);

		email = new JTextField();
		email.setColumns(10);
		email.setBounds(116, 152, 217, 26);
		contentPane.add(email);

		nationalId = new JTextField();
		nationalId.setColumns(10);
		nationalId.setBounds(116, 228, 217, 26);
		contentPane.add(nationalId);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(27, 157, 61, 16);
		contentPane.add(lblEmail);

		lblCpf = new JLabel("CPF");
		lblCpf.setBounds(27, 233, 61, 16);
		contentPane.add(lblCpf);

		JButton save = new JButton("Salvar");
		save.setBounds(309, 295, 117, 29);
		save.setActionCommand("save");
		save.addActionListener(listener);
		contentPane.add(save);

	}

	class UserRegisterListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equalsIgnoreCase("changeToCompany")) {
				lblCpf.setText("CNPJ");
				isPerson.setSelected(false);
			}

			if (e.getActionCommand().equalsIgnoreCase("changeToPerson")) {
				lblCpf.setText("CPF");
				isCompany.setSelected(false);
			}

			if (e.getActionCommand().equalsIgnoreCase("save")) {

				controller.insert(name.getText(), email.getText(), nationalId.getText(), isPerson.isSelected(),
						isCompany.isSelected());

				// clear screen
				name.setText("");
				email.setText("");
				nationalId.setText("");
			}
		}

	}
}
