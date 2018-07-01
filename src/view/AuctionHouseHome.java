package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class AuctionHouseHome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuctionHouseHome window = new AuctionHouseHome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AuctionHouseHome() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 994, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MenuItemListener menuListener = new MenuItemListener();
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menuRegisters = new JMenu("Cadastro");
		menuBar.add(menuRegisters);
		
		JMenuItem registerUsers = new JMenuItem("Usuários");
		registerUsers.setActionCommand("users");
		registerUsers.addActionListener(menuListener);
		menuRegisters.add(registerUsers);	

		JMenuItem registerAuctions = new JMenuItem("Leilão");
		registerAuctions.setActionCommand("auction");
		registerAuctions.addActionListener(menuListener);
		menuRegisters.add(registerAuctions);
		
		JMenuItem registerLot = new JMenuItem("Lote");
		registerLot.setActionCommand("lots");
		registerLot.addActionListener(menuListener);
		menuRegisters.add(registerLot);
		
		JMenuItem registerAssets = new JMenuItem("Bens");
		registerAssets.setActionCommand("assets");
		registerAssets.addActionListener(menuListener);
		menuRegisters.add(registerAssets);
		
	}
	
	// Inner class listeners
	class MenuItemListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equalsIgnoreCase("users")) {
				new UserRegister();
			}
			if (e.getActionCommand().equalsIgnoreCase("auction")) {
				System.out.println("new auction");
			}
			if (e.getActionCommand().equalsIgnoreCase("lots")) {
				new LotRegister();
			}
			if (e.getActionCommand().equalsIgnoreCase("assets")) {
				new AssetsRegister();
			}
		}
	}
}


