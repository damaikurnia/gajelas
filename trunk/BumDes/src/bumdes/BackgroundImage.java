/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bumdes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author basisd03
 */
public class BackgroundImage extends JPanel {
    private Image image;
 
    public BackgroundImage (String file) {
        image = new ImageIcon(getClass().getResource(file)).getImage();
    }
 
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }
}
