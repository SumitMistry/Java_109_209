import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;


public class ParticleField extends JPanel 
{
    private boolean running = true;
    private java.util.List<Particle> particles = new java.util.ArrayList<Particle>(); // try to ask again prof..
    
    public ParticleField(int n, int width, int height) 
    {
        this.setPreferredSize(new Dimension(width, height));
        for(int i=0; i<n; i++)
        {
            particles.add(new Particle(width,height));
        }
        Thread thread = new Thread( new Runnable() 
        {
            @Override public void run() 
            {
                
                while(running) 
                {
                    try{Thread.sleep(20);}
                   catch (InterruptedException e) { 
                       Thread.currentThread().interrupt();
                                        }
                    for (Particle element : particles) {
                            element.move();
                            repaint();
                            }
                       
        
                          
                 }
                    
            }
        } ); 
        thread.start();
        
    }
    @Override public void paintComponent(Graphics g)
    {
        super.paintComponent(g); // start new component  freshly
        for (Particle element : particles) //enhanced for agan google
        {
        
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(2.0f));
        g2.setPaint(Color.BLACK);
        g2.draw(new Rectangle.Double(element.getX(),element.getY(),3,3));
        }
    }
    public void terminate()
    {
        this.running= false;
    }
}
