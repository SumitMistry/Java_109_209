import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
import java.awt.geom.Arc2D.Double;


public class Head extends JPanel  {
  
    private boolean mouseInside;
   
    public Head() 
    {
        
        this.setPreferredSize(new Dimension(500, 500));
        
        //as per given wue set utility met
        this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.addMouseListener(new MyMouseListener());
              
        
    }
    
      public class MyMouseListener extends MouseAdapter   
    {
              
        @Override public void mouseEntered(MouseEvent e)
        {
            mouseInside= true;
            repaint();
        }
        
        @Override public void mouseExited(MouseEvent e)
        {
            mouseInside= false;
            repaint();
        }
    }
    
    
    @Override public void paintComponent(Graphics g)
    {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setStroke(new BasicStroke(9.0f));
    g2.setPaint(Color.BLUE);    
    g2.draw(new Ellipse2D.Double(50,50,125,125));
    g2.draw(new Ellipse2D.Double(225,50,125,125));
    
    if(mouseInside) 
    {
    g2.fill(new Ellipse2D.Double(100,100,25,25));
    g2.fill(new Ellipse2D.Double(275,100,25,25));
     }
     
    Path2D.Double path = new Path2D.Double();
    path.moveTo(200,165);
    path.lineTo(230,250);
    path.lineTo(170,250);
    path.lineTo(200,165);
    Area area = new Area(path);
    g2.draw(area);
    g2.drawArc(100, 275, 200, 75, 0, -180);
   
    
    }
    
    
  
}

