package lab13edition2;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class COLORChangerTEST2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				COLORCHANGER2 frame = new COLORCHANGER2();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		}
);

	}

}