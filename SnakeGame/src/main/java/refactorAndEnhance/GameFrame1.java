package refactorAndEnhance;
import javax.swing.JFrame;

public class GameFrame1 extends JFrame {
    public GameFrame1()  {

        this.add(new GamePanel1());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}