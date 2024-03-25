import javax.swing.*;
import java.awt.*;
public class Main {
    static JFrame getFrame(int width, int height) {
        JFrame var2 = new JFrame();
        var2.setVisible(true);
        var2.setDefaultCloseOperation(3);
        var2.setBounds(0, 0, width, height);
        return var2;
    }

    public static void main(String[] var0) {
        JFrame var1 = getFrame(800, 600);
        var1.setContentPane(new Tile("resources/grass.jpg", var1.getBounds(), 50, 50));
        var1.setVisible(true);
    }
}