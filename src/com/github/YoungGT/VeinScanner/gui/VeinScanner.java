/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.YoungGT.VeinScanner.gui;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.github.YoungGT.VeinScanner.calc.calcPoints;
import com.github.YoungGT.VeinScanner.dataExchange.returnToShow;

/**
 *
 * @author YoungGT
 */
public class VeinScanner extends javax.swing.JFrame {

	/**
	 * Creates new form VeinScanner
	 */
	public VeinScanner() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextPane1 = new javax.swing.JTextPane();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextPane2 = new javax.swing.JTextPane();
		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		vp11 = new javax.swing.JLabel();
		vp12 = new javax.swing.JLabel();
		vp10 = new javax.swing.JLabel();
		vp01 = new javax.swing.JLabel();
		vp02 = new javax.swing.JLabel();
		vp00 = new javax.swing.JLabel();
		vp22 = new javax.swing.JLabel();
		vp21 = new javax.swing.JLabel();
		vp20 = new javax.swing.JLabel();

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("GT矿脉坐标定位器");
		setAlwaysOnTop(true);
		setLocation(new java.awt.Point(380, 360));
		setName(""); // NOI18N
		setPreferredSize(new java.awt.Dimension(400, 430));
		setResizable(false);

		jScrollPane1.setViewportView(jTextPane1);

		jScrollPane2.setViewportView(jTextPane2);

		jButton1.setText("计算"); // NOI18N
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				calcM(evt);
			}
		});
		jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				calcK(evt);
			}
		});

		jLabel2.setText(",");

		jLabel3.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
		jLabel3.setText("请输入坐标(x,z)：");

		vp11.setText("未知坐标");

		vp12.setText("未知坐标");

		vp10.setText("未知坐标");

		vp01.setText("未知坐标");

		vp02.setText("未知坐标");

		vp00.setText("未知坐标");

		vp22.setText("未知坐标");

		vp21.setText("未知坐标");

		vp20.setText("未知坐标");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
				layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(47).addGroup(layout
								.createParallelGroup(Alignment.TRAILING).addGroup(layout.createParallelGroup(
										Alignment.LEADING)
										.addGroup(layout.createParallelGroup(Alignment.TRAILING)
												.addGroup(layout.createSequentialGroup().addComponent(jLabel3)
														.addPreferredGap(ComponentPlacement.RELATED))
												.addGroup(layout.createSequentialGroup()
														.addGroup(layout.createParallelGroup(Alignment.LEADING)
																.addComponent(vp10, GroupLayout.PREFERRED_SIZE, 59,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(vp00))
														.addGap(57)))
										.addComponent(vp20))
								.addGroup(layout.createSequentialGroup()
										.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 61,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)))
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addGroup(layout
												.createParallelGroup(
														Alignment.LEADING)
												.addGroup(layout.createParallelGroup(Alignment.LEADING)
														.addGroup(layout.createSequentialGroup()
																.addPreferredGap(ComponentPlacement.RELATED, 16,
																		Short.MAX_VALUE)
																.addComponent(jButton1))
														.addGroup(layout.createSequentialGroup().addComponent(vp21)
																.addPreferredGap(ComponentPlacement.RELATED)))
												.addGroup(layout.createSequentialGroup()
														.addGroup(layout.createParallelGroup(Alignment.LEADING)
																.addComponent(vp01).addComponent(jScrollPane2,
																		GroupLayout.PREFERRED_SIZE, 61,
																		GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 8,
																GroupLayout.PREFERRED_SIZE)))
										.addGroup(layout.createSequentialGroup()
												.addComponent(vp11, GroupLayout.PREFERRED_SIZE, 64,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 61,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(layout.createParallelGroup(Alignment.LEADING)
														.addGroup(layout.createSequentialGroup()
																.addGap(120, 120, Short.MAX_VALUE).addComponent(jLabel4,
																		GroupLayout.PREFERRED_SIZE, 88,
																		GroupLayout.PREFERRED_SIZE))
														.addGroup(layout.createSequentialGroup().addGap(144)
																.addComponent(jLabel1)))
												.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(layout.createSequentialGroup().addGap(53)
												.addGroup(layout.createParallelGroup(Alignment.LEADING)
														.addComponent(vp02).addComponent(vp12).addComponent(vp22))
												.addGap(110)))));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(21)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup().addComponent(jLabel1).addGap(17)).addComponent(jLabel2)
						.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(vp00, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(vp01, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(vp02, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
				.addGap(62)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(vp10, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(vp12, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(vp11, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
				.addGap(63)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(vp22, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addComponent(vp21, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
						.addGap(18).addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(vp20, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE).addComponent(jLabel4)
				.addContainerGap()));
		getContentPane().setLayout(layout);

		getAccessibleContext().setAccessibleName("GT矿脉坐标计算器");

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void calcM(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_calcM
		// TODO add your handling code here:
		try {
			new calcPoints(Integer.parseInt(jTextPane1.getText()), Integer.parseInt(jTextPane1.getText()));
		} catch (Exception e) {
			// TODO: handle exceptio
			new returnToShow("ERROR");
		}
	}// GEN-LAST:event_calcM

	private void calcK(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_calcK
		// TODO add your handling code here:
		try {
			new calcPoints(Integer.parseInt(jTextPane1.getText()), Integer.parseInt(jTextPane1.getText()));
		} catch (Exception e) {
			// TODO: handle exception
			new returnToShow("ERROR");
		}
	}// GEN-LAST:event_calcK

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(VeinScanner.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(VeinScanner.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(VeinScanner.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(VeinScanner.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VeinScanner().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	public static javax.swing.JLabel jLabel4;
	public static javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextPane jTextPane1;
	private javax.swing.JTextPane jTextPane2;
	public static javax.swing.JLabel vp00;
	public static javax.swing.JLabel vp01;
	public static javax.swing.JLabel vp02;
	public static javax.swing.JLabel vp10;
	public static javax.swing.JLabel vp11;
	public static javax.swing.JLabel vp12;
	public static javax.swing.JLabel vp20;
	public static javax.swing.JLabel vp21;
	public static javax.swing.JLabel vp22;
	// End of variables declaration//GEN-END:variables
}
