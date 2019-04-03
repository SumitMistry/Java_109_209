import java.util.Random; 


public class Particle
{
    private static final Random rng = new Random();
    private double x;
    private double y;
    
    public Particle(int width, int height)
    {
        this.x= rng.nextInt(width);
        this.y= rng.nextInt(height);
    }
    public double getX()
    {
        return this.x;
    }
    public double getY()
    {
        return this.y;
    }
    public void move()
    {
        this.x = getX()+ rng.nextGaussian();//gussian functn given in method
        this.y = getY()+ rng.nextGaussian();
    }
}
