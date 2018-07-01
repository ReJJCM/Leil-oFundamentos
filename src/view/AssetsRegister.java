package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class AssetsRegister extends JFrame {

	private JPanel contentPane;
	private JTextField shortDescription;
	private JTextPane fullDescription;
	private JComboBox category;
	private String[] categories;
	private JButton save;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssetsRegister frame = new AssetsRegister();
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
	public AssetsRegister() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 520, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);

		this.categories = new String[] { "Jóias", "Carros", "Relógios" };
		AssetsRegisterListener listener = new AssetsRegisterListener();

		JLabel lblDescription = new JLabel("Descrição");
		lblDescription.setBounds(19, 19, 100, 16);
		contentPane.add(lblDescription);

		shortDescription = new JTextField();
		shortDescription.setBounds(131, 14, 179, 26);
		contentPane.add(shortDescription);
		shortDescription.setColumns(10);

		JLabel lblCategory = new JLabel("Categoria");
		lblCategory.setBounds(19, 65, 100, 16);
		contentPane.add(lblCategory);

		category = new JComboBox();
		category.setModel(new DefaultComboBoxModel(new String[] { "Jóias", "Carros", "Relógios" }));
		category.setSelectedIndex(0);

		category.setBounds(131, 61, 179, 27);
		contentPane.add(category);

		JLabel lblDetalhes = new JLabel("Detalhes");
		lblDetalhes.setBounds(19, 116, 100, 16);
		contentPane.add(lblDetalhes);

		fullDescription = new JTextPane();
		fullDescription.setBounds(131, 116, 244, 240);
		contentPane.add(fullDescription);

		save = new JButton("Salvar");
		save.setBounds(384, 371, 117, 29);
		save.setActionCommand("save");
		save.addActionListener(listener);
		contentPane.add(save);
	}

	class AssetsRegisterListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand().equalsIgnoreCase("save")) {
				System.out.println("Novo Assets \n Descrição = " + shortDescription.getText() + "\n"
						+ "Descrição completa = " + fullDescription.getText() + "\n" + "Categoria = "
						+ categories[category.getSelectedIndex()] + "\n");
				shortDescription.setText("");
				fullDescription.setText("");
				category.setSelectedIndex(0);
			}
		}

	}
}
