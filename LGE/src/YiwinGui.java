///*
// * 
// * 
// * 	import java.awt.EventQueue;
//	import javax.swing.JFrame;
//	import javax.swing.JButton;
//	import java.awt.event.ActionListener;
//	import java.awt.event.ActionEvent;
//	import javax.swing.JTextPane;
//	import javax.swing.JTabbedPane;
//	import javax.swing.JTextField;
//	import java.util.Random;
//	import javax.swing.JTextArea;
//	import javax.swing.JPanel;
//	import javax.swing.JScrollPane;
//	import java.awt.Color;
//	import javax.swing.JLayeredPane;
//	import javax.swing.JLabel;
//	import java.awt.Font;
//	import javax.swing.JTable;
//	import java.awt.TextArea;
//	import javax.swing.JMenuBar;
//
//	public class GUI
//	{
//
//		private JFrame frame;
//
//		/**
//		 * Launch the application.
//		 */
//		public static void main(String[] args) {
//			EventQueue.invokeLater(new Runnable() {
//				public void run() {
//					try {
//						GUI window = new GUI();
//						window.frame.setVisible(true);
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			});
//		}
//
//		/**
//		 * Create the application.
//		 */
//		public GUI()
//		{
//			initialize();
//		}
//
//		/**
//		 * Initialize the contents of the frame.
//		 */
//		private void initialize() 
//		{
//			frame = new JFrame();
//			frame.getContentPane().setBackground(Color.LIGHT_GRAY);
//			frame.getContentPane().setForeground(Color.GRAY);
//			frame.setBounds(100, 100, 1233, 758);
//			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			frame.getContentPane().setLayout(null);
//			
////			JButton btnNewButton = new JButton("Draw");
////			btnNewButton.addActionListener(new ActionListener() {
////				public void actionPerformed(ActionEvent e) {
////					btnNewButton.setText("Draw a card");
////				}
////			});
//			
//			JButton btnRoll = new JButton("Roll");
////			btnRoll.addActionListener(new ActionListener() {
////				
////				public void actionPerformed(ActionEvent e) {
////					btnRoll.setText("you roll the dice");
////					
////				}
////			});
//			btnRoll.setBounds(10, 606, 115, 105);
//			frame.getContentPane().add(btnRoll);
//			
//			JButton btnEventCard = new JButton("Draw a Plant Card");
//			btnEventCard.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					
//					btnEventCard.setText("you draw a random card");
//					
//					
//				}
//			});
//			btnEventCard.setBounds(154, 606, 115, 105);
//			frame.getContentPane().add(btnEventCard);
//			
//			JButton btnStart = new JButton("start");
//			btnStart.setBounds(10, 24, 97, 49);
//			frame.getContentPane().add(btnStart);
//			
//			JButton btnNewButton_1 = new JButton("1");
//			btnNewButton_1.setBounds(107, 24, 97, 49);
//			frame.getContentPane().add(btnNewButton_1);
//			
//			JButton btnNewButton_2 = new JButton("2");
//			btnNewButton_2.setBounds(205, 24, 97, 49);
//			frame.getContentPane().add(btnNewButton_2);
//			
//			JButton btnNewButton_3 = new JButton("3");
//			btnNewButton_3.setBounds(303, 24, 97, 49);
//			frame.getContentPane().add(btnNewButton_3);
//			
//			JButton btnNewButton_4 = new JButton("4");
//			btnNewButton_4.setBounds(402, 24, 97, 49);
//			frame.getContentPane().add(btnNewButton_4);
//			
//			JButton btnNewButton_5 = new JButton("5");
//			btnNewButton_5.setBounds(500, 24, 97, 49);
//			frame.getContentPane().add(btnNewButton_5);
//			
//			JButton btnNewButton_6 = new JButton("6");
//			btnNewButton_6.setBounds(599, 24, 97, 49);
//			frame.getContentPane().add(btnNewButton_6);
//			
//			JButton btnNewButton_7 = new JButton("7");
//			btnNewButton_7.setBounds(695, 24, 97, 49);
//			frame.getContentPane().add(btnNewButton_7);
//			
//			JButton btnNewButton_8 = new JButton("8");
//			btnNewButton_8.setBounds(792, 24, 97, 49);
//			frame.getContentPane().add(btnNewButton_8);
//			
//			JButton btnNewButton_9 = new JButton("9");
//			btnNewButton_9.setBounds(890, 24, 97, 49);
//			frame.getContentPane().add(btnNewButton_9);
//			
//			JButton btnNewButton_10 = new JButton("10");
//			btnNewButton_10.setBounds(890, 68, 97, 102);
//			frame.getContentPane().add(btnNewButton_10);
//			
//			JButton btnNewButton_11 = new JButton("11");
//			btnNewButton_11.setBounds(890, 171, 97, 49);
//			frame.getContentPane().add(btnNewButton_11);
//			
//			JButton btnNewButton_12 = new JButton("12");
//			btnNewButton_12.setBounds(792, 171, 97, 49);
//			frame.getContentPane().add(btnNewButton_12);
//			
//			JButton btnNewButton_13 = new JButton("13");
//			btnNewButton_13.setBounds(695, 171, 97, 49);
//			frame.getContentPane().add(btnNewButton_13);
//			
//			JButton btnNewButton_14 = new JButton("14");
//			btnNewButton_14.setBounds(599, 171, 97, 49);
//			frame.getContentPane().add(btnNewButton_14);
//			
//			JButton btnNewButton_15 = new JButton("15");
//			btnNewButton_15.setBounds(500, 171, 97, 49);
//			frame.getContentPane().add(btnNewButton_15);
//			
//			JButton btnNewButton_16 = new JButton("16");
//			btnNewButton_16.setBounds(402, 171, 97, 49);
//			frame.getContentPane().add(btnNewButton_16);
//			
//			JButton btnNewButton_17 = new JButton("17");
//			btnNewButton_17.setBounds(303, 171, 97, 49);
//			frame.getContentPane().add(btnNewButton_17);
//			
//			JButton btnNewButton_18 = new JButton("18");
//			btnNewButton_18.setBounds(205, 171, 97, 49);
//			frame.getContentPane().add(btnNewButton_18);
//			
//			JButton Waterfall = new JButton("Waterfall");
//			Waterfall.setForeground(Color.CYAN);
//			Waterfall.setBackground(Color.CYAN);
//			Waterfall.setBounds(599, 70, 97, 99);
//			frame.getContentPane().add(Waterfall);
//			
//			JButton btnNewButton_20 = new JButton("20");
//			btnNewButton_20.setBounds(107, 171, 97, 49);
//			frame.getContentPane().add(btnNewButton_20);
//			
//			JButton btnNewButton_21 = new JButton("21");
//			btnNewButton_21.setBounds(10, 171, 97, 49);
//			frame.getContentPane().add(btnNewButton_21);
//			
//			JButton pipe = new JButton("pipe");
//			pipe.setForeground(Color.GRAY);
//			pipe.setBackground(Color.GRAY);
//			pipe.setBounds(205, 220, 97, 101);
//			frame.getContentPane().add(pipe);
//			
//
//			JButton btnNewButton_22 = new JButton("22");
//			btnNewButton_22.setBounds(10, 220, 97, 101);
//			frame.getContentPane().add(btnNewButton_22);
//			
//			
//			JButton btnNewButton_23 = new JButton("23");
//			btnNewButton_23.setBounds(10, 320, 97, 49);
//			frame.getContentPane().add(btnNewButton_23);
//			
//			JButton btnNewButton_24 = new JButton("24");
//			btnNewButton_24.setBounds(107, 320, 97, 49);
//			frame.getContentPane().add(btnNewButton_24);
//			
//			JButton btnNewButton_25 = new JButton("25");
//			btnNewButton_25.setBounds(205, 320, 97, 49);
//			frame.getContentPane().add(btnNewButton_25);
//			
//			JButton btnNewButton_26 = new JButton("26");
//			btnNewButton_26.setBounds(303, 320, 97, 49);
//			frame.getContentPane().add(btnNewButton_26);
//			
//			JButton btnNewButton_27 = new JButton("27");
//			btnNewButton_27.setBounds(402, 320, 97, 49);
//			frame.getContentPane().add(btnNewButton_27);
//			
//			JButton btnNewButton_28 = new JButton("28");
//			btnNewButton_28.setBounds(500, 320, 97, 49);
//			frame.getContentPane().add(btnNewButton_28);
//			
//			JButton End = new JButton("Fin");
//			End.setBounds(599, 320, 97, 49);
//			frame.getContentPane().add(End);
//
//		}
//	}
//
//
// * 
// * 
// * 
// * 
// * */
// 