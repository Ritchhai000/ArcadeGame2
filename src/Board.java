import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Board extends JPanel  implements ActionListener {

    Player player;
    Timer timer;

    Game game;

    ArrayList<Shape> enemies = new ArrayList<>();

    final int NUMENEMIES = 5;

    public Board(Game game){

        setPreferredSize(new Dimension(800, 400));
        setBackground(Color.BLACK);
        player = new Player(game, this);
    }

    public void setup(){

        player.setPos(100, 200);

        for(int i = 0; i < NUMENEMIES; i++) {

            for (int j = 0; j < NUMENEMIES; j++)

                enemies.add(new Enemy)
        }
        timer = new Timer(1000/60, this);
        timer.start();
    }

    public void paintComponent(Graphics p){

        super.paintComponent(p);
        player.paint(p);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        player.move();
        repaint();
    }
}
