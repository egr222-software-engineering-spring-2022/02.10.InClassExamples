import java.awt.*;

public class Main {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(600,200);
        Graphics g = panel.getGraphics();

        panel.setBackground(Color.YELLOW);
        // lines for the V
        g.drawLine(0,0,300,200);
        g.drawLine(300,200, 600, 0);
        // Horizontal lines
        for (int i = 1 ; i <= 20; i++){
            int startX = 15 * i;
            int endX = 600 - 15 * i;
            int y = 10 * i;
            g.drawLine(startX, y, endX, y);
        }
    }
}