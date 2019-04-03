
public class Rectangle
{
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getPerimeter() {
        return 2 * (width + height);
    }
    
    public void string() {
        int h = height;
        height = width;
        width = h;
    }
    
}