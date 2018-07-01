package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LotRegister extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JList lotList;
	private JList allAssets;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LotRegister frame = new LotRegister();
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
	public LotRegister() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 730, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		

		JLabel lblLote = new JLabel("Lote");
		lblLote.setBounds(20, 25, 61, 16);
		contentPane.add(lblLote);

		textField = new JTextField();
		textField.setBounds(75, 20, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		lotList = new JList();
		lotList.setBounds(48, 113, 200, 300);
		contentPane.add(lotList);

		allAssets = new JList();
		allAssets.setBounds(372, 113, 200, 300);
		contentPane.add(allAssets);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(590, 398, 117, 29);
		contentPane.add(btnSalvar);

		JLabel lblAdicionadoAoLote = new JLabel("Adicionado ao Lote");
		lblAdicionadoAoLote.setBounds(48, 85, 200, 16);
		contentPane.add(lblAdicionadoAoLote);

		JButton addToLot = new JButton("<<");
		addToLot.setBounds(254, 197, 117, 29);
		contentPane.add(addToLot);

		JButton removeFromLot = new JButton(">>");
		removeFromLot.setBounds(254, 239, 117, 29);
		contentPane.add(removeFromLot);
	}
}
