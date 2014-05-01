/*
 * Bu programda rsa algoritması kullanılarak metin şifreleme amaçlanmıştır
 * 
 */

import java.math.BigInteger;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.UIManager;

/**
 * 
 * @author sivan suvari
 *RSAEncryptor // for big number handling support BigInteger class is used
 *In this program we are using the rsa algorithm for encoding numbers in
 *desired bit depth. p and q valus must be prime among them.and e is also
 *must be prime number. selecting e as a big value will
 *cause better encryption
 */

public class Form extends javax.swing.JFrame {
	private javax.swing.JTextArea desttextarea;
	private javax.swing.JTextArea desttextarea1;
	private javax.swing.JTextField etextfield;
	private javax.swing.JTextArea fitextarea;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane10;
	private javax.swing.JScrollPane jScrollPane11;
	private javax.swing.JScrollPane jScrollPane12;
	private javax.swing.JScrollPane jScrollPane13;
	private javax.swing.JScrollPane jScrollPane14;
	private javax.swing.JScrollPane jScrollPane15;
	private javax.swing.JScrollPane jScrollPane16;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JScrollPane jScrollPane7;
	private javax.swing.JScrollPane jScrollPane8;
	private javax.swing.JScrollPane jScrollPane9;
	private javax.swing.JTextArea ntextarea;
	private javax.swing.JTextArea ntextarea1;
	private javax.swing.JTextArea privatetextfield;
	private javax.swing.JTextArea privatetextfield1;
	private javax.swing.JTextArea ptextarea;
	private javax.swing.JTextArea ptextarea1;
	private javax.swing.JTextArea publictextfield;
	private javax.swing.JTextArea publictextfield1;
	private javax.swing.JTextArea qtextarea;
	private javax.swing.JTextArea qtextarea1;
	private javax.swing.JTextArea srctextarea;
	private javax.swing.JTextArea srctextarea1;
	private BigInteger one = new BigInteger("1");
	private BigInteger zero = new BigInteger("0");
	private BigInteger fi, n, p, q, e;
	private List<BigInteger> coprimeNumbers;
	private BigInteger temp = new BigInteger("0");
	private BigInteger kalan;

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
		qtextarea = new javax.swing.JTextArea();
		jScrollPane3 = new javax.swing.JScrollPane();
		ntextarea = new javax.swing.JTextArea();
		jScrollPane1 = new javax.swing.JScrollPane();
		ptextarea = new javax.swing.JTextArea();
		jScrollPane9 = new javax.swing.JScrollPane();
		qtextarea1 = new javax.swing.JTextArea();
		jScrollPane10 = new javax.swing.JScrollPane();
		ptextarea1 = new javax.swing.JTextArea();
		jScrollPane5 = new javax.swing.JScrollPane();
		srctextarea = new javax.swing.JTextArea();
		jScrollPane11 = new javax.swing.JScrollPane();
		privatetextfield1 = new javax.swing.JTextArea();
		jScrollPane12 = new javax.swing.JScrollPane();
		srctextarea1 = new javax.swing.JTextArea();
		jScrollPane13 = new javax.swing.JScrollPane();
		publictextfield1 = new javax.swing.JTextArea();
		jScrollPane14 = new javax.swing.JScrollPane();
		desttextarea1 = new javax.swing.JTextArea();
		jScrollPane15 = new javax.swing.JScrollPane();
		ntextarea1 = new javax.swing.JTextArea();
		jScrollPane4 = new javax.swing.JScrollPane();
		fitextarea = new javax.swing.JTextArea();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane7 = new javax.swing.JScrollPane();
		publictextfield = new javax.swing.JTextArea();
		etextfield = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jScrollPane8 = new javax.swing.JScrollPane();
		privatetextfield = new javax.swing.JTextArea();
		jButton5 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jScrollPane16 = new javax.swing.JScrollPane();
		desttextarea = new javax.swing.JTextArea();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Rsa Algoritması Uygulaması");
		setBackground(new java.awt.Color(0, 51, 51));
		setLocationByPlatform(true);
		setUndecorated(true);

		jPanel1.setBackground(new java.awt.Color(0, 102, 102));
		jPanel1.setForeground(new java.awt.Color(255, 255, 255));

		//qtextarea.setBackground(new java.awt.Color(0, 0, 0));
		qtextarea.setColumns(20);
		qtextarea.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
		qtextarea.setForeground(java.awt.Color.gray);
		qtextarea.setLineWrap(true);
		qtextarea.setRows(2);
		qtextarea
				.setText("944448999\n");
		qtextarea.setWrapStyleWord(true);
		qtextarea.setBorder(javax.swing.BorderFactory.createTitledBorder("q"));
		qtextarea.setDoubleBuffered(true);
		qtextarea.setDragEnabled(true);
		qtextarea.setInheritsPopupMenu(true);
		jScrollPane2.setViewportView(qtextarea);

		//ntextarea.setBackground(new java.awt.Color(0, 0, 0));
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

		//ptextarea.setBackground(new java.awt.Color(0, 0, 0));
		ptextarea.setColumns(20);
		ptextarea.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
		ptextarea.setForeground(java.awt.Color.gray);
		ptextarea.setLineWrap(true);
		ptextarea.setRows(2);
		ptextarea
				.setText("9999999");
		ptextarea.setWrapStyleWord(true);
		ptextarea.setBorder(javax.swing.BorderFactory.createTitledBorder("p"));
		ptextarea.setDoubleBuffered(true);
		ptextarea.setDragEnabled(true);
		ptextarea.setInheritsPopupMenu(true);
		jScrollPane1.setViewportView(ptextarea);

		qtextarea1.setColumns(20);
		qtextarea1.setLineWrap(true);
		qtextarea1.setRows(2);
		qtextarea1.setText("61");
		qtextarea1.setBorder(javax.swing.BorderFactory.createTitledBorder("q"));
		jScrollPane9.setViewportView(qtextarea1);

		ptextarea1.setColumns(20);
		ptextarea1.setLineWrap(true);
		ptextarea1.setRows(2);
		ptextarea1.setText("53");
		ptextarea1.setBorder(javax.swing.BorderFactory.createTitledBorder("p"));
		jScrollPane10.setViewportView(ptextarea1);

		//srctextarea.setBackground(new java.awt.Color(0, 0, 0));
		srctextarea.setColumns(20);
		srctextarea.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
		srctextarea.setForeground(java.awt.Color.green);
		srctextarea.setLineWrap(true);
		srctextarea.setRows(5);
		srctextarea.setText("65");
		srctextarea.setWrapStyleWord(true);
		srctextarea.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Şifrelenecek Sayı"));
		srctextarea.setCaretPosition(0);
		srctextarea.setDoubleBuffered(true);
		srctextarea.setDragEnabled(true);
		srctextarea.setInheritsPopupMenu(true);
		jScrollPane5.setViewportView(srctextarea);

		privatetextfield1.setColumns(10);
		privatetextfield1.setRows(1);
		privatetextfield1.setTabSize(5);
		privatetextfield1.setToolTipText("");
		privatetextfield1.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Gizli Anahtar"));
		jScrollPane11.setViewportView(privatetextfield1);

		srctextarea1.setColumns(20);
		srctextarea1.setRows(5);
		srctextarea1.setText("65");
		srctextarea1.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Şifrelenecek Metin"));
		jScrollPane12.setViewportView(srctextarea1);

		publictextfield1.setColumns(10);
		publictextfield1.setRows(1);
		publictextfield1.setTabSize(5);
		publictextfield1.setToolTipText("");
		publictextfield1.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Genel Anahtar"));
		jScrollPane13.setViewportView(publictextfield1);

		desttextarea1.setColumns(20);
		desttextarea1.setRows(5);
		desttextarea1.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Şifreli Metin"));
		jScrollPane14.setViewportView(desttextarea1);

		ntextarea1.setColumns(20);
		ntextarea1.setLineWrap(true);
		ntextarea1.setRows(2);
		ntextarea1.setBorder(javax.swing.BorderFactory.createTitledBorder("n"));
		jScrollPane15.setViewportView(ntextarea1);

	//	fitextarea.setBackground(new java.awt.Color(0, 0, 0));
		fitextarea.setColumns(20);
		fitextarea.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
		fitextarea.setForeground(java.awt.Color.gray);
		fitextarea.setLineWrap(true);
		fitextarea.setRows(2);
		fitextarea.setWrapStyleWord(true);
		fitextarea
				.setBorder(javax.swing.BorderFactory.createTitledBorder("fi"));
		fitextarea.setDoubleBuffered(true);
		fitextarea.setDragEnabled(true);
		fitextarea.setInheritsPopupMenu(true);
		jScrollPane4.setViewportView(fitextarea);

		//jPanel2.setBackground(new java.awt.Color(0, 0, 0));

		//publictextfield.setBackground(new java.awt.Color(0, 0, 0));
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

		etextfield.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
		etextfield.setText("99371");

		jButton2.setForeground(new java.awt.Color(153, 153, 153));
		jButton2.setText("Anahtarları Bul");
		jButton2.setContentAreaFilled(false);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setForeground(new java.awt.Color(153, 153, 153));
		jButton3.setText("Şifrele");
		jButton3.setContentAreaFilled(false);
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("E :");

		jButton4.setForeground(new java.awt.Color(153, 153, 153));
		jButton4.setText("Şİfre Çöz");
		jButton4.setContentAreaFilled(false);
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		//privatetextfield.setBackground(new java.awt.Color(0, 0, 0));
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

		jButton5.setForeground(new java.awt.Color(153, 153, 153));
		jButton5.setText("Formu Temizle");
		jButton5.setContentAreaFilled(false);
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton1.setText("Max E");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
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
																				jLabel1)
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
																												etextfield,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												141,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jButton1))
																						.addGroup(
																								jPanel2Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(
																												jButton2,
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
																																jButton3,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																170,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jButton4,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																170,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jButton5,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																170,
																																javax.swing.GroupLayout.PREFERRED_SIZE))))))
										.addContainerGap()));

		jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { jButton2, jButton3, jButton4,
						jButton5 });

		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton3,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton4,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton5,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																etextfield)
														.addComponent(jButton1))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane7)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane8)
										.addContainerGap()));

		//desttextarea.setBackground(new java.awt.Color(0, 0, 0));
		desttextarea.setColumns(20);
		desttextarea.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
		desttextarea.setForeground(java.awt.Color.red);
		desttextarea.setLineWrap(true);
		desttextarea.setRows(5);
		desttextarea.setWrapStyleWord(true);
		desttextarea.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Şifreli Sayı"));
		desttextarea.setDoubleBuffered(true);
		desttextarea.setDragEnabled(true);
		desttextarea.setInheritsPopupMenu(true);
		jScrollPane16.setViewportView(desttextarea);

		//jButton6.setBackground(new java.awt.Color(0, 0, 0));
		jButton6.setForeground(new java.awt.Color(153, 153, 153));
		jButton6.setText("Girdiyi Temizle");
		jButton6.setContentAreaFilled(false);
		jButton6.setOpaque(true);
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		//jButton7.setBackground(new java.awt.Color(0, 0, 0));
		jButton7.setForeground(new java.awt.Color(153, 153, 153));
		jButton7.setText("Çıktıyı Temizle");
		jButton7.setContentAreaFilled(false);
		jButton7.setOpaque(true);
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
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
																jButton6,
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
																jButton7,
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
																jButton6,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton7,
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

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		if (ptextarea.getText().trim().length() == 0
				|| qtextarea.getText().trim().length() == 0
				|| etextfield.getText().trim().length() == 0) {
			JOptionPane.showMessageDialog(this,
					"Lütfen p q ve e  değerlerini girdiğinizden emin olunuz.",
					"Hata", JOptionPane.WARNING_MESSAGE);
			return;
		}
		p = new BigInteger(ptextarea.getText().trim());
		q = new BigInteger(qtextarea.getText().trim());
		e = new BigInteger(etextfield.getText().trim());
		n = p.multiply(q);
		fi = p.subtract(one).multiply(q.subtract(one));
		fitextarea.setText(fi.toString());
		ntextarea.setText(n.toString());
		publictextfield.setText("{" + n.toString() + "," + e + "}");
		privatetextfield.setText("{" + n + "," + DHesapla(fi, e) + "}");

	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		e = new BigInteger(etextfield.getText());
		srctextarea.setText(new BigInteger(desttextarea.getText()).modPow(
				DHesapla(fi, e), n).toString());

	}

	private BigInteger DHesapla(BigInteger fi, BigInteger e) {
		BigInteger a1, a2, a3, b1, b2, b3, t1, t2, t3, q;

		a1 = one;
		a2 = zero;
		a3 = fi;

		b1 = zero;
		b2 = one;
		b3 = e;

		while (!b3.equals(one)) {
			q = a3.divide(b3);// bölüm 3

			t1 = a1.subtract(q.multiply(b1)); // 1 - (3*0)
			t2 = a2.subtract(q.multiply(b2)); // 0 - (3*0)
			t3 = a3.subtract(q.multiply(b3)); // 160 - kalan

			a1 = b1; // 0
			a2 = b2; // 0
			a3 = b3; // 0

			b1 = t1; // 0
			b2 = t2; // 0
			b3 = t3; // 0

			b1 = t1;// 1
			b2 = t2;// -1
			b3 = t3; // 0
		}
		if (b2.signum() < 0) {
			b2 = b2.add(fi);
		}

		return b2;
	}

	private BigInteger Task(BigInteger fi, BigInteger e) {
		if (e.equals(one)) {
			return one;
		}
		kalan = fi.remainder(e);
		temp = Task(e, kalan);
		return kalan;
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		BigInteger pow = new BigInteger(srctextarea.getText().trim());
		BigInteger temp = new BigInteger(srctextarea.getText().trim());
		BigInteger one = new BigInteger("1");
		while (!((e = e.subtract(one)).equals(zero))) {
			pow = pow.multiply(temp);
		}
		desttextarea.setText(pow.remainder(n).toString());
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		ptextarea.setText("");
		qtextarea.setText("");
		etextfield.setText("");
		srctextarea.setText("");
		desttextarea.setText("");
		publictextfield.setText("");
		privatetextfield.setText("");
		ntextarea.setText("");
		fitextarea.setText("");
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		etextfield.setText(fi.subtract(one).toString());
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		srctextarea.setText(""); // TODO add your handling code here:
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		desttextarea.setText(""); // TODO add your handling code here:
	}

}

