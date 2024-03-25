import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Tile extends JPanel {
    BufferedImage texture;
    Rectangle borders;
    int height;
    int width;

    public Tile(String imagePath, Rectangle borders, int width, int height){
        this.borders = borders;
        this.width = width;
        this.height = height;
        try {
            var inImage = ImageIO.read(new File(imagePath));
            MediaTracker mt = new MediaTracker(this);
            mt.addImage(inImage, 1);
            try {
                mt.waitForAll();
            } catch (Exception e) {
                System.out.println("Image not found.");
            }
            this.texture = inImage.getSubimage(0,0,width,height);

        }catch (IOException ex) {
            // handle exception...
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        int x = 0, y = 0;
        for (int i = 0; i < borders.height / height + 1; i++) {
            for (int j = 0; j < borders.width / width + 1; j++) {
                g.drawImage(texture, x,y,this);
                x += width;
            }
            y += height;
            x = 0;
        }
        g.dispose();
        super.paintComponent(g);
    }
}