package horstmann.volume01.chapter7;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class SizedFrameTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				 SizedFrame frame = new  SizedFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//frame.setLocationByPlatform(true);
				
				frame.setVisible(true);
			}
		});
	}

}
