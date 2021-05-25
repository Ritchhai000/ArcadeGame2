import java.awt.*;

public class Shape {

    Color color;
    int width, height, x, y, init_x, init_y;
    double dx = 2, dy = 2;

    public Shape(Color color, int x, int y, int width, int height) {

        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        init_x = x;
        init_y = y;
    }

    public void setPos(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void paint(Graphics p) {
    }


    public void move(int minWidth, int maxWidth, int minHeight, int maxHeight, boolean horizontal, boolean vertical) {

        double nextTop = y + dy;
        double nextBottom = y + height + dy;
        double nextLeft = x + dx;
        double nextRight = x + width + dx;

        if (nextLeft <= minWidth || nextRight >= maxWidth) {

            dx *= -1;
        }

        if (nextTop <= minHeight || nextBottom >= maxHeight) {

            dy *= -1;
        }

        if (horizontal) {

            x *= dx;
        }

        if (vertical) {

            y *= dy;
        }
    }
}
