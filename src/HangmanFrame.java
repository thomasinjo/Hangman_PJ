
import java.awt.Component;
import java.awt.MenuBar;
import javax.swing.Box;
import javax.swing.JFrame;

public class HangmanFrame {
	
	HangmanPanel panel;
	
	public HangmanFrame(){
                MenuBar a=new MenuBar();
            
		panel = new HangmanPanel();
		JFrame jf = new JFrame();
		jf.setTitle("Hangman");
		jf.setSize(715,530);
		jf.add(panel);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	





}
