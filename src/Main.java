import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main {
    static JFrame getFrame(int width, int height){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(0,
                0,
                width,
                height);
        return jFrame;
    }
    public static void main(String[] args) {
        JFrame window = getFrame(800, 600);
        window.setContentPane(new Tile("resources/grass.jpg", window.getBounds(), 50,50));
        window.setVisible(true);
        window.show();
    }
}