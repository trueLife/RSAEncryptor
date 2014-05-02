import java.math.BigInteger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.UIManager;

/**
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version. This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details. see <http://www.gnu.org/licenses/> RSAEncryptor for big number
 * handling support BigInteger class is used In this program we are using the
 * rsa algorithm for encoding numbers in desired bit depth. p and q valus must
 * be prime among them.and e is also must be prime number. selecting e as a big
 * value will cause better encryption
 * 
 * @author sivan suvari RSAEncryptor program gui class
 * @see Readme.md
 * 
 */

public class Form extends javax.swing.JFrame {

	static javax.swing.JTextArea desttextarea;
	static Worker worker = new Worker();
	static javax.swing.JTextField eText;
	static javax.swing.JTextArea fiText;
	static javax.swing.JButton maxEBtn;
	static javax.swing.JButton genKeys;
	static javax.swing.JButton encryptBtn;
	static javax.swing.JButton decryptBtn;
	static javax.swing.JButton clearFormBtn;
	static javax.swing.JButton clearInput;
	static javax.swing.JButton clearOutput;
	static javax.swing.JLabel eLabel;
	static javax.swing.JPanel jPanel1;
	static javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane11;
	private javax.swing.JScrollPane jScrollPane13;
	private javax.swing.JScrollPane jScrollPane15;
	private javax.swing.JScrollPane jScrollPane16;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JScrollPane jScrollPane7;
	private javax.swing.JScrollPane jScrollPane8;
	static javax.swing.JTextArea ntextarea;
	static javax.swing.JTextArea ntextarea1;
	static javax.swing.JTextArea privatetextfield;
	static javax.swing.JTextArea privateKeyText;
	static javax.swing.JTextArea ptextarea;
	static javax.swing.JTextArea qtextarea;
	static javax.swing.JTextArea publictextfield;
	static javax.swing.JTextArea publictextfield1;
	static javax.swing.JTextArea srctextarea;

	public Form() {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		initComponents();

		setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);

	}

	public static void main(String args[]) {

		try {
			javax.swing.UIManager.setLookAndFeel(UIManager
					.getCrossPlatformLookAndFeelClassName());

		} catch (Exception ex) {
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Form().setVisible(true);
			}
		});
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jScrollPane3 = new javax.swing.JScrollPane();
		qtextarea = new javax.swing.JTextArea();
		ntextarea = new javax.swing.JTextArea();
		jScrollPane1 = new javax.swing.JScrollPane();
		ptextarea = new javax.swing.JTextArea();
		jScrollPane5 = new javax.swing.JScrollPane();
		srctextarea = new javax.swing.JTextArea();
		jScrollPane11 = new javax.swing.JScrollPane();
		privateKeyText = new javax.swing.JTextArea();
		jScrollPane13 = new javax.swing.JScrollPane();
		publictextfield1 = new javax.swing.JTextArea();
		jScrollPane15 = new javax.swing.JScrollPane();
		ntextarea1 = new javax.swing.JTextArea();
		jScrollPane4 = new javax.swing.JScrollPane();
		fiText = new javax.swing.JTextArea();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane7 = new javax.swing.JScrollPane();
		publictextfield = new javax.swing.JTextArea();
		eText = new javax.swing.JTextField();
		genKeys = new javax.swing.JButton();
		encryptBtn = new javax.swing.JButton();
		eLabel = new javax.swing.JLabel();
		decryptBtn = new javax.swing.JButton();
		jScrollPane8 = new javax.swing.JScrollPane();
		privatetextfield = new javax.swing.JTextArea();
		clearFormBtn = new javax.swing.JButton();
		maxEBtn = new javax.swing.JButton();
		jScrollPane16 = new javax.swing.JScrollPane();
		desttextarea = new javax.swing.JTextArea();
		clearInput = new javax.swing.JButton();
		clearOutput = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Rsa Implementation");
		setBackground(new java.awt.Color(0, 51, 51));
		setLocationByPlatform(true);
		setUndecorated(true);

		jPanel1.setBackground(new java.awt.Color(0, 102, 102));
		jPanel1.setForeground(new java.awt.Color(255, 255, 255));

		// ntextarea.setBackground(new java.awt.Color(0, 0, 0));
		ntextarea.setColumns(20);
		ntextarea.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
		ntextarea.setForeground(java.awt.Color.gray);
		ntextarea.setLineWrap(true);
		ntextarea.setRows(2);
		ntextarea.setWrapStyleWord(true);
		ntextarea.setBorder(javax.swing.BorderFactory.createTitledBorder("n"));
		ntextarea.setDoubleBuffered(true);
		ntextarea.setDragEnabled(true);
		ntextarea.setInheritsPopupMenu(true);
		jScrollPane3.setViewportView(ntextarea);

		// ptextarea.setBackground(new java.awt.Color(0, 0, 0));
		ptextarea.setColumns(20);
		ptextarea.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
		ptextarea.setForeground(java.awt.Color.gray);
		ptextarea.setLineWrap(true);
		ptextarea.setRows(2);
		ptextarea.setText("53");
		ptextarea.setWrapStyleWord(true);
		ptextarea.setBorder(javax.swing.BorderFactory.createTitledBorder("p"));
		ptextarea.setDoubleBuffered(true);
		ptextarea.setDragEnabled(true);
		ptextarea.setInheritsPopupMenu(true);

		jScrollPane1.setViewportView(ptextarea);

		qtextarea.setColumns(20);
		qtextarea.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
		qtextarea.setForeground(java.awt.Color.gray);
		qtextarea.setLineWrap(true);
		qtextarea.setRows(2);
		qtextarea.setText("61");
		qtextarea.setWrapStyleWord(true);
		qtextarea.setBorder(javax.swing.BorderFactory.createTitledBorder("q"));
		qtextarea.setDoubleBuffered(true);
		qtextarea.setDragEnabled(true);
		qtextarea.setInheritsPopupMenu(true);

		jScrollPane2.setViewportView(qtextarea);

		// srctextarea.setBackground(new java.awt.Color(0, 0, 0));
		srctextarea.setColumns(20);
		srctextarea.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
		srctextarea.setForeground(java.awt.Color.green);
		srctextarea.setLineWrap(true);
		srctextarea.setRows(5);
		srctextarea.setText("65");
		srctextarea.setWrapStyleWord(true);
		srctextarea.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Input Number"));
		srctextarea.setCaretPosition(0);
		srctextarea.setDoubleBuffered(true);
		srctextarea.setDragEnabled(true);
		srctextarea.setInheritsPopupMenu(true);

		jScrollPane5.setViewportView(srctextarea);

		privateKeyText.setColumns(10);
		privateKeyText.setRows(1);
		privateKeyText.setTabSize(5);
		privateKeyText.setToolTipText("");
		privateKeyText.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Private Key"));

		jScrollPane11.setViewportView(privateKeyText);

		publictextfield1.setColumns(10);
		publictextfield1.setRows(1);
		publictextfield1.setTabSize(5);
		publictextfield1.setToolTipText("");
		publictextfield1.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Public Key"));
		jScrollPane13.setViewportView(publictextfield1);

		ntextarea1.setColumns(20);
		ntextarea1.setLineWrap(true);
		ntextarea1.setRows(2);
		ntextarea1.setBorder(javax.swing.BorderFactory.createTitledBorder("n"));
		jScrollPane15.setViewportView(ntextarea1);

		// fitextarea.setBackground(new java.awt.Color(0, 0, 0));
		fiText.setColumns(20);
		fiText.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
		fiText.setForeground(java.awt.Color.gray);
		fiText.setLineWrap(true);
		fiText.setRows(2);
		fiText.setWrapStyleWord(true);
		fiText.setBorder(javax.swing.BorderFactory.createTitledBorder("fi"));
		fiText.setDoubleBuffered(true);
		fiText.setDragEnabled(true);
		fiText.setInheritsPopupMenu(true);
		jScrollPane4.setViewportView(fiText);

		// jPanel2.setBackground(new java.awt.Color(0, 0, 0));

		// publictextfield.setBackground(new java.awt.Color(0, 0, 0));
		publictextfield.setColumns(10);
		publictextfield.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
		publictextfield.setForeground(new java.awt.Color(102, 102, 102));
		publictextfield.setRows(1);
		publictextfield.setTabSize(5);
		publictextfield.setToolTipText("");
		publictextfield.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Genel Anahtar"));
		publictextfield.setDoubleBuffered(true);
		jScrollPane7.setViewportView(publictextfield);

		eText.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
		eText.setText("17");

		genKeys.setForeground(new java.awt.Color(153, 153, 153));
		genKeys.setText("Generate Keys");
		genKeys.setContentAreaFilled(false);
		genKeys.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				genKeysBtnActionPerformed(evt);
			}
		});

		encryptBtn.setForeground(new java.awt.Color(153, 153, 153));
		encryptBtn.setText("Encrypt");
		encryptBtn.setContentAreaFilled(false);
		encryptBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				encryptBtnActionPerformed(evt);
			}
		});

		eLabel.setForeground(new java.awt.Color(255, 255, 255));
		eLabel.setText("E :");

		decryptBtn.setForeground(new java.awt.Color(153, 153, 153));
		decryptBtn.setText("Decrypt ");
		decryptBtn.setContentAreaFilled(false);
		decryptBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				decryptBtnActionPerformed(evt);
			}
		});

		// privatetextfield.setBackground(new java.awt.Color(0, 0, 0));
		privatetextfield.setColumns(10);
		privatetextfield.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
		privatetextfield.setForeground(new java.awt.Color(102, 102, 102));
		privatetextfield.setRows(1);
		privatetextfield.setTabSize(5);
		privatetextfield.setToolTipText("");
		privatetextfield.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Gizli Anahtar"));
		privatetextfield.setDoubleBuffered(true);
		jScrollPane8.setViewportView(privatetextfield);

		clearFormBtn.setForeground(new java.awt.Color(153, 153, 153));
		clearFormBtn.setText("Clear Form");
		clearFormBtn.setContentAreaFilled(false);
		clearFormBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clearFormBtnActionPerformed(evt);
			}
		});

		maxEBtn.setText("Calc MaxE");
		maxEBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				maxEBtnActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane8)
														.addComponent(
																jScrollPane7)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				eLabel)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												eText,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												141,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												maxEBtn))
																						.addGroup(
																								jPanel2Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(
																												genKeys,
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												233,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												jPanel2Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																encryptBtn,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																170,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																decryptBtn,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																170,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																clearFormBtn,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																170,
																																javax.swing.GroupLayout.PREFERRED_SIZE))))))
										.addContainerGap()));

		jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { genKeys, encryptBtn, decryptBtn,
						clearFormBtn });

		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												genKeys,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												encryptBtn,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												decryptBtn,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												clearFormBtn,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(eLabel)
														.addComponent(eText)
														.addComponent(maxEBtn))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane7)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane8)
										.addContainerGap()));

		// desttextarea.setBackground(new java.awt.Color(0, 0, 0));
		desttextarea.setColumns(20);
		desttextarea.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
		desttextarea.setForeground(java.awt.Color.red);
		desttextarea.setLineWrap(true);
		desttextarea.setRows(5);
		desttextarea.setWrapStyleWord(true);
		desttextarea.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Encrypted Data"));
		desttextarea.setDoubleBuffered(true);
		desttextarea.setDragEnabled(true);
		desttextarea.setInheritsPopupMenu(true);
		jScrollPane16.setViewportView(desttextarea);

		// clearInput.setBackground(new java.awt.Color(0, 0, 0));
		clearInput.setForeground(new java.awt.Color(153, 153, 153));
		clearInput.setText("Clear Input");
		clearInput.setContentAreaFilled(false);
		clearInput.setOpaque(true);
		clearInput.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clearInputActionPerformed(evt);
			}
		});

		// clearOutput.setBackground(new java.awt.Color(0, 0, 0));
		clearOutput.setForeground(new java.awt.Color(153, 153, 153));
		clearOutput.setText("Clear Output");
		clearOutput.setContentAreaFilled(false);
		clearOutput.setOpaque(true);
		clearOutput.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clearOutputActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane5)
														.addComponent(
																clearInput,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane16)
														.addComponent(
																clearOutput,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)))
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane2)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jScrollPane3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				0,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jScrollPane4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				0,
																				Short.MAX_VALUE))
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																350,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				97,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jScrollPane2,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				97,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jScrollPane3,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								117,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jScrollPane4,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								117,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addComponent(
																jPanel2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jScrollPane5,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																136,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane16))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																clearInput,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																clearOutput,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup()
						.addGap(4, 4, 4)
						.addComponent(jPanel1,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addComponent(jPanel1,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addContainerGap()));

		pack();
	}// </editor-fold>

	private void genKeysBtnActionPerformed(java.awt.event.ActionEvent evt) {
		if (ptextarea.getText().trim().length() == 0
				|| qtextarea.getText().trim().length() == 0
				|| eText.getText().trim().length() == 0) {
			JOptionPane
					.showMessageDialog(
							this,
							"please provide p and q numbers and these numbers must be prime among them",
							"Error", JOptionPane.WARNING_MESSAGE);
			return;
		}
		worker.generateKeys();
	}

	private void decryptBtnActionPerformed(java.awt.event.ActionEvent evt) {
		worker.decrypt();

	}

	private void encryptBtnActionPerformed(java.awt.event.ActionEvent evt) {
		worker.encrypt();
	}

	private void clearFormBtnActionPerformed(java.awt.event.ActionEvent evt) {
		ptextarea.setText("");
		qtextarea.setText("");
		eText.setText("");
		srctextarea.setText("");
		desttextarea.setText("");
		publictextfield.setText("");
		privatetextfield.setText("");
		ntextarea.setText("");
		fiText.setText("");
	}

	private void maxEBtnActionPerformed(java.awt.event.ActionEvent evt) {
		worker.maxE();
	}

	private void clearInputActionPerformed(java.awt.event.ActionEvent evt) {
		srctextarea.setText(""); // TODO add your handling code here:
	}

	private void clearOutputActionPerformed(java.awt.event.ActionEvent evt) {
		desttextarea.setText(""); // TODO add your handling code here:
	}

}
