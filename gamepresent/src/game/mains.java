package game;
import javax.swing.JFrame;
public class mains extends JFrame{
                       public static int m = 1;
	public mains() {
                                          add(new state1());
	}
	public static void main(String[] args) {
		mains pac = new mains();
                                             playMusic ms = new playMusic();
                                             ms.playBackground("music.wav");
		pac.setVisible(true);
		pac.setTitle("Safe pacman");
		pac.setSize(365,420);
		pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pac.setLocationRelativeTo(null);	
	}
}
