package test;

import javax.swing.UIManager;

import view.QLTourView;

public class Test {
	public static void main(String[] arg) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new QLTourView();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
