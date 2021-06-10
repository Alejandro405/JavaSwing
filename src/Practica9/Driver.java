

import Practica9.Panel;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class Driver extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//To Complete
	}
	
	public static void createFrame() {
		try {
			JFrame mainFrame = new JFrame(Panel.messages.getString("title"));
			//setBounds defines frame dimensios. Do not call pack method.
			mainFrame.setBounds(100, 100, 450, 300);
			//Complete
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}