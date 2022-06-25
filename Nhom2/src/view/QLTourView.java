package view;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DiaDiem;
import model.QLTourModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QLTourView extends JFrame {

	private JPanel contentPane;
	QLTourModel model;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLTourView frame = new QLTourView();
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
	public QLTourView() {
		this.model = new QLTourModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1066, 901);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuOpen);
		
		JMenuItem menuClose = new JMenuItem("Close");
		menuClose.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuClose);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuAbout);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("About Me");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuAbout.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tra c\u1EE9u Tour du l\u1ECBch", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THAM QUAN C\u00C1C TR\u01AF\u1EDCNG \u0110\u1EA0I H\u1ECCC TR\u00CAN \u0110\u1ECAA B\u00C0N H\u00C0 N\u1ED8I");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel.setBounds(165, 11, 713, 55);
		contentPane.add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(32, 96, 980, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Ch\u1ECDn c\u00E1c \u0111\u1ECBa \u0111i\u1EC3m \u0111i qua:");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(32, 109, 180, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("T\u00F9y ch\u1ECDn:");
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(809, 109, 89, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(32, 336, 980, 2);
		contentPane.add(separator_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\u0110i\u1EC3m xu\u1EA5t ph\u00E1t:");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(666, 155, 121, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		JComboBox cboDiemXuatPhat = new JComboBox();
		ArrayList<DiaDiem> listDiaDiem = DiaDiem.getDSDiaDiem();
		for(DiaDiem diaDiem:listDiaDiem) {
			cboDiemXuatPhat.addItem(diaDiem.getTenDiaDiem());
		}
		cboDiemXuatPhat.setBounds(783, 153, 216, 29);
		contentPane.add(cboDiemXuatPhat);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("B\u1EA1n c\u00F3 mu\u1ED1n xem g\u1EE3i \u00FD h\u00E0nh tr\u00ECnh kh\u00F4ng?");
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(666, 216, 299, 20);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JButton btnThemTour = new JButton("Yes");
		btnThemTour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnThemTour.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnThemTour.setBounds(742, 259, 89, 35);
		contentPane.add(btnThemTour);
		
		JButton btnCancel = new JButton("No");
		btnCancel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnCancel.setBounds(857, 259, 89, 35);
		contentPane.add(btnCancel);
		
		JCheckBox chbDHCongNghiep = new JCheckBox("\u0110H C\u00F4ng Nghi\u1EC7p");
		chbDHCongNghiep.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chbDHCongNghiep.setBounds(32, 136, 121, 23);
		contentPane.add(chbDHCongNghiep);
		
		JCheckBox chbBaoChi = new JCheckBox("HV B\u00E1o Ch\u00ED");
		chbBaoChi.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chbBaoChi.setBounds(32, 174, 121, 23);
		contentPane.add(chbBaoChi);
		
		JCheckBox chbBachKhoa = new JCheckBox("\u0110H B\u00E1ch Khoa");
		chbBachKhoa.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chbBachKhoa.setBounds(32, 216, 121, 23);
		contentPane.add(chbBachKhoa);
		
		JCheckBox chbFPT = new JCheckBox("\u0110H FPT");
		chbFPT.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chbFPT.setBounds(32, 262, 121, 23);
		contentPane.add(chbFPT);
		
		JCheckBox chbThuongMai = new JCheckBox("\u0110H Th\u01B0\u01A1ng M\u1EA1i");
		chbThuongMai.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chbThuongMai.setBounds(180, 136, 121, 23);
		contentPane.add(chbThuongMai);
		
		JCheckBox chQuocGia = new JCheckBox("\u0110H Qu\u1ED1c Gia");
		chQuocGia.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chQuocGia.setBounds(336, 136, 121, 23);
		contentPane.add(chQuocGia);
		
		JCheckBox chbSuPham = new JCheckBox("\u0110H S\u01B0 Ph\u1EA1m");
		chbSuPham.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chbSuPham.setBounds(484, 137, 121, 23);
		contentPane.add(chbSuPham);
		
		JCheckBox chbNganHang = new JCheckBox("HV Ng\u00E2n H\u00E0ng");
		chbNganHang.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chbNganHang.setBounds(180, 175, 121, 23);
		contentPane.add(chbNganHang);
		
		JCheckBox chbXayDung = new JCheckBox("\u0110H X\u00E2y D\u1EF1ng");
		chbXayDung.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chbXayDung.setBounds(180, 217, 121, 23);
		contentPane.add(chbXayDung);
		
		JCheckBox chbRMIT = new JCheckBox("\u0110H RMIT");
		chbRMIT.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chbRMIT.setBounds(180, 263, 121, 23);
		contentPane.add(chbRMIT);
		
		JCheckBox chbNongNghiep = new JCheckBox("HV N\u00F4ng Nghi\u1EC7p");
		chbNongNghiep.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chbNongNghiep.setBounds(336, 175, 121, 23);
		contentPane.add(chbNongNghiep);
		
		JCheckBox chbKTQD = new JCheckBox("\u0110H KTQD");
		chbKTQD.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chbKTQD.setBounds(336, 217, 121, 23);
		contentPane.add(chbKTQD);
		
		JCheckBox chbY = new JCheckBox("\u0110H Y");
		chbY.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chbY.setBounds(336, 263, 121, 23);
		contentPane.add(chbY);
		
		JCheckBox chbGTVT = new JCheckBox("\u0110H GTVT");
		chbGTVT.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chbGTVT.setBounds(484, 176, 121, 23);
		contentPane.add(chbGTVT);
		
		JCheckBox chbLuat = new JCheckBox("\u0110H Lu\u1EADt");
		chbLuat.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chbLuat.setBounds(484, 217, 121, 23);
		contentPane.add(chbLuat);
		
		JCheckBox chbKHTN = new JCheckBox("\u0110H KHTN");
		chbKHTN.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chbKHTN.setBounds(484, 263, 121, 23);
		contentPane.add(chbKHTN);
		
		
		
		
		JLabel lblNewLabel_1_2 = new JLabel("B\u1EA3ng qu\u1EA3n l\u00FD Tour:");
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(32, 349, 180, 20);
		contentPane.add(lblNewLabel_1_2);
		
		table = new JTable();
		table.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Tour", "H\u00E0nh tr\u00ECnh", "S\u1ED1 \u0111\u1ECBa \u0111i\u1EC3m", "T\u1ED5ng chi ph\u00ED"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(32, 380, 980, 337);
		contentPane.add(scrollPane);
		
		JButton btnDatTour = new JButton("\u0110\u1EB7t Tour");
		btnDatTour.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnDatTour.setBounds(341, 747, 106, 41);
		contentPane.add(btnDatTour);
		
		JButton btnXoaTour = new JButton("X\u00F3a");
		btnXoaTour.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnXoaTour.setBounds(466, 747, 106, 41);
		contentPane.add(btnXoaTour);
		
		JButton btnCapNhap = new JButton("C\u1EADp Nh\u1EADp");
		btnCapNhap.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnCapNhap.setBounds(593, 747, 115, 41);
		contentPane.add(btnCapNhap);
		
		this.setVisible(true);
	}
}
