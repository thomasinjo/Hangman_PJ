
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class HangmanFrame {
	
	HangmanPanel panel;
	
	public HangmanFrame(){
		panel = new HangmanPanel();
		JFrame jf = new JFrame();
		jf.setTitle("Hangman");
                jf.setJMenuBar(initJMenuBar());
		jf.setSize(715,530);
		jf.add(panel);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	 private JMenuBar initJMenuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        
        JMenu Files = new JMenu("Files");
        
        JMenuItem newGame = new JMenuItem("New game");
        JMenuItem exit = new JMenuItem("Exit");
        
        JMenuItem help = new JMenuItem("Help");
        
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int again = javax.swing.JOptionPane.showConfirmDialog(null, 
                        "Are you sure you want to start new game?",
                        "Question?", javax.swing.JOptionPane.YES_NO_OPTION, 
                                            javax.swing.JOptionPane.WARNING_MESSAGE);
                //if(again == javax.swing.JOptionPane.YES_OPTION) 
                    //panel.startNewGame();
            }

            
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int again;
                again = javax.swing.JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?",
                                            "Question?", javax.swing.JOptionPane.YES_NO_OPTION, 
                                            javax.swing.JOptionPane.WARNING_MESSAGE);
                if(again == javax.swing.JOptionPane.YES_OPTION)
                    System.exit(0);
            }        
        });
        
        help.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
      //            new HighScore(panel);
            }
        });
        
        Files.add(newGame);
        Files.add(exit);
        menuBar.add(Files);
        menuBar.add(help);
        
        return menuBar;
    }





}
