import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Lissajous extends JPanel implements ActionListener
{
    ActionListener listener;
    JTextField a = new JTextField("5"); 
    JTextField b = new JTextField("2");
    JTextField delta = new JTextField("0.7");
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private int size;
    
    public Lissajous(int size)
    {
        this.size=size;
        this.setPreferredSize(new Dimension(size,size));
        this.add(a);
        this.add(b);
        this.add(delta);
        
        a.addActionListener(this);
        b.addActionListener(this);
        delta.addActionListener(this);
      
    }  
    public void actionPerformed(ActionEvent e)
        {  repaint(); } //REFRESH 
        
       
    @Override public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(3.0f));
        g2.setPaint(Color.BLACK);
        
       
   
        for(double t=0; t<(Double.parseDouble(a.getText())+Double.parseDouble(b.getText()))*Math.PI; t=t+0.01)
        {
            
            x1 = size/2 + 2*size/5 * Math.sin(Double.parseDouble(a.getText()) * t + Double.parseDouble(delta.getText()));
            y1 = size/2 + 2*size/5 * Math.cos(Double.parseDouble(b.getText()) * t);
            
            x2 = size/2 + 2*size/5 * Math.sin(Double.parseDouble(a.getText()) * t+0.01 + Double.parseDouble(delta.getText()));
            y2 = size/2 + 2*size/5 * Math.cos(Double.parseDouble(b.getText()) * t+0.01);
            
            g2.draw(new Line2D.Double(x2, y2, x1, y1));//2 first ..and then..1..right..
            
        }
      
    }
    
}
