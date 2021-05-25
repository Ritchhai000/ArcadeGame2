import java.awt.*;

public class Player {

        Color color;
        int width = 20, height = 20, x, y, init_x, init_y;
        double dx = 2, dy = 2;

        Game game;
        Board board;

        public Player(Game game, Board board){

            this.game = game;
            this.board = board;
        }

        public void setPos(int x, int y){

            this.x = x;
            this.y = y;
        }

        public void move() {

            if (game.isUpPressed()) {

                y -= 5;

            }
            if (game.isDownPressed()) {

                y += 5;
            }
        }

        public void paint(Graphics g){

            g.setColor(Color.BLUE);
            g.fillRect(x, y, width, height);
        }
    }
