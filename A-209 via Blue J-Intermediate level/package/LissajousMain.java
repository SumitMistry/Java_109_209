import java.awt.*;
import javax.swing.JFrame;



public class LissajousMain
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Lissajous Curve!!");
        // Tell the frame to obey the close button
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLayout(new FlowLayout());
        f.add(new Lissajous(500));
        f.pack();
        f.setVisible(true);        
    }
}
