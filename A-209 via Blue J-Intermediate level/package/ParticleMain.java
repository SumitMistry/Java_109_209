import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Random;
import java.util.ArrayList;


public class ParticleMain  {

public static void main(String[] args) {
        
        ParticleField itp = new ParticleField(2000, 800, 800);
                
           
        JFrame f = new JFrame("Particle");
        
        f.addWindowListener(new WindowAdapter() {
            
                public void windowClosing(WindowEvent we) {
                    
                    itp.terminate();
                     
                    f.dispose();
                    
                }
            });
        f.setLayout(new FlowLayout());
        f.add(itp);
        f.pack();
        f.setVisible(true);
    }
}
