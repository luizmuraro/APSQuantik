package InterfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import javax.swing.JMenu;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class InterfaceJogo {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private AtorJogador atorJogador;

	private Boolean pecaAzul;
	private Boolean primeiraAcao = true;
	private final Color posicaoVazia = Color.white;
	private ImageIcon naipe;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceJogo window = new InterfaceJogo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void pegaPeca(JButton button) {
		if(primeiraAcao) {
			removePeca(button);
		}else {
			colocaPeca(button);
		}
	} 

	public void removePeca(JButton button) {
		switch (button.getY()) {
		case 68:
			naipe = new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_paus64.png"));
			break;
		case 169:
			naipe = new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_copas64.png"));
			break;
		case 268:
			naipe = new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_espadas64.png"));
			break;
		case 366:
			naipe = new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_ouros64.png"));
			break;
		}
		
		if(button.getBackground().equals(Color.BLUE)) {
			pecaAzul = true;
		} else if (button.getBackground().equals(Color.YELLOW)) {
			pecaAzul = false;
		}	
		button.setBackground(Color.WHITE);
		button.setIcon(new ImageIcon(InterfaceJogo.class.getResource("")));
		primeiraAcao = false;
	
	} 
	public void colocaPeca(JButton button) {
		
		if(button.getBackground().equals(posicaoVazia)) {
			button.setIcon(naipe);
			primeiraAcao = true;
			if(pecaAzul) {
				button.setBackground(Color.BLUE);
			} else {
				button.setBackground(Color.YELLOW);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Casa ocupada");
		}
	} 
	
	/**
	 * Create the application.-
	 */
	public InterfaceJogo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		atorJogador = new AtorJogador();
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 800, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 800, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Jogo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmConectar = new JMenuItem("conectar");
		mntmConectar.setAction(action);
		mnNewMenu.add(mntmConectar);
		
		JMenuItem mntmDesconectar = new JMenuItem("desconectar");
		mntmDesconectar.setAction(action_1);
		mnNewMenu.add(mntmDesconectar);
		
		JMenuItem mntmIniciarPartida = new JMenuItem("iniciar partida");
		mntmIniciarPartida.setAction(action_2);
		mnNewMenu.add(mntmIniciarPartida);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(btnNewButton);
			}
		});
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_paus64.png")));
		btnNewButton.setBounds(3, 68, 64, 64);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("");
		button.setBorder(null);
		button.setBackground(Color.BLUE);
		button.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_paus64.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pegaPeca(button);
			}
		});
		
		
		
		button.setBounds(74, 68, 64, 64);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBorder(null);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_1);
			}
		});
		button_1.setBackground(Color.BLUE);
		button_1.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_copas64.png")));
		button_1.setBounds(3, 169, 64, 64);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBorder(null);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_2);
			}
		});
		button_2.setBackground(Color.BLUE);
		button_2.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_copas64.png")));
		button_2.setBounds(74, 169, 64, 64);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBorder(null);
		button_3.setBackground(Color.BLUE);
		button_3.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_espadas64.png")));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_3);
			}
		});
		button_3.setBounds(3, 268, 64, 64);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBorder(null);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_4);
			}
		});
		button_4.setBackground(Color.BLUE);
		button_4.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_espadas64.png")));
		button_4.setBounds(74, 268, 64, 64);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setBorder(null);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_5);
			}
		});
		button_5.setBackground(Color.BLUE);
		button_5.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_ouros64.png")));
		button_5.setBounds(3, 366, 64, 64);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setBorder(null);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_6);
			}
		});
		button_6.setBackground(Color.BLUE);
		button_6.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_ouros64.png")));
		button_6.setBounds(74, 366, 64, 64);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setBorder(null);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_7);
			}
		});
		button_7.setBackground(Color.YELLOW);
		button_7.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_paus64.png")));
		button_7.setBounds(646, 68, 64, 64);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setBorder(null);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_8);
			}
		});
		button_8.setBackground(Color.YELLOW);
		button_8.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_paus64.png")));
		button_8.setBounds(717, 68, 64, 64);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBorder(null);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_9);
			}
		});
		button_9.setBackground(Color.YELLOW);
		button_9.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_copas64.png")));
		button_9.setBounds(646, 169, 64, 64);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.setBorder(null);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_10);
			}
		});
		button_10.setBackground(Color.YELLOW);
		button_10.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_copas64.png")));
		button_10.setBounds(717, 169, 64, 64);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setBorder(null);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_11);
			}
		});
		button_11.setBackground(Color.YELLOW);
		button_11.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_espadas64.png")));
		button_11.setBounds(646, 268, 64, 64);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.setBorder(null);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_12);
			}
		});
		button_12.setBackground(Color.YELLOW);
		button_12.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_espadas64.png")));
		button_12.setBounds(717, 268, 64, 64);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setBorder(null);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_13);
			}
		});
		button_13.setBackground(Color.YELLOW);
		button_13.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_ouros64.png")));
		button_13.setBounds(646, 366, 64, 64);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setBorder(null);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_14);
			}
		});
		button_14.setBackground(Color.YELLOW);
		button_14.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/resources/Naipe_ouros64.png")));
		button_14.setBounds(717, 366, 64, 64);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_15);
			}
		});
		button_15.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_15.setBackground(Color.WHITE);
		button_15.setBounds(166, 43, 110, 110);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_16);
			}
		});
		button_16.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_16.setBackground(Color.WHITE);
		button_16.setBounds(276, 43, 110, 110);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_17);
			}
		});
		button_17.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_17.setBackground(Color.WHITE);
		button_17.setBounds(386, 43, 110, 110);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_18);
			}
		});
		button_18.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_18.setBackground(Color.WHITE);
		button_18.setBounds(496, 43, 110, 110);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_19);
			}
		});
		button_19.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_19.setBackground(Color.WHITE);
		button_19.setBounds(166, 153, 110, 110);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_20);
			}
		});
		button_20.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_20.setBackground(Color.WHITE);
		button_20.setBounds(276, 153, 110, 110);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_21);
			}
		});
		button_21.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_21.setBackground(Color.WHITE);
		button_21.setBounds(386, 153, 110, 110);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_22);
			}
		});
		button_22.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_22.setBackground(Color.WHITE);
		button_22.setBounds(496, 153, 110, 110);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_23);
			}
		});
		button_23.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_23.setBackground(Color.WHITE);
		button_23.setBounds(166, 252, 110, 110);
		frame.getContentPane().add(button_23);
		
		JButton button_24 = new JButton("");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_24);
			}
		});
		button_24.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_24.setBackground(Color.WHITE);
		button_24.setBounds(276, 252, 110, 110);
		frame.getContentPane().add(button_24);
		
		JButton button_25 = new JButton("");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_25);
			}
		});
		button_25.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_25.setBackground(Color.WHITE);
		button_25.setBounds(386, 252, 110, 110);
		frame.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_26);
			}
		});
		button_26.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_26.setBackground(Color.WHITE);
		button_26.setBounds(496, 252, 110, 110);
		frame.getContentPane().add(button_26);
		
		JButton button_27 = new JButton("");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_27);
			}
		});
		button_27.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_27.setBackground(Color.WHITE);
		button_27.setBounds(166, 350, 110, 110);
		frame.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_28);
			}
		});
		button_28.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_28.setBackground(Color.WHITE);
		button_28.setBounds(276, 350, 110, 110);
		frame.getContentPane().add(button_28);
		
		JButton button_29 = new JButton("");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_29);
			}
		});
		button_29.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_29.setBackground(Color.WHITE);
		button_29.setBounds(386, 350, 110, 110);
		frame.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegaPeca(button_30);
			}
		});
		button_30.setBorder(new LineBorder(new Color(0, 0, 0)));
		button_30.setBackground(Color.WHITE);
		button_30.setBounds(496, 350, 110, 110);
		frame.getContentPane().add(button_30);
	}
	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "conectar");
			putValue(SHORT_DESCRIPTION, "conectar a Netgames Server");
		}
		public void actionPerformed(ActionEvent e) {
			// Necess�rio definir endere�o do servidor e nome do jogador
			String mensagem = atorJogador.conectar("netgames.labsoft.ufsc.br", "nomeJogador?");
			JOptionPane.showMessageDialog(null, mensagem);
		}
	}
	private class SwingAction_1 extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_1() {
			putValue(NAME, "desconectar");
			putValue(SHORT_DESCRIPTION, "desconectar de Netgames Server");
		}
		public void actionPerformed(ActionEvent e) {
			String mensagem = atorJogador.desconectar();
			JOptionPane.showMessageDialog(null, mensagem);
		}
	}
	private class SwingAction_2 extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction_2() {
			putValue(NAME, "iniciar partida");
			putValue(SHORT_DESCRIPTION, "iniciar partida do seu jogo");
		}
		public void actionPerformed(ActionEvent e) {
			String mensagem = atorJogador.iniciarPartida();
			JOptionPane.showMessageDialog(null, mensagem);
		}
	}
}
