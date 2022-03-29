import org.w3c.dom.css.Rect;

public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle(){

    }

    public Rectangle(double width, double height){
        setWidth(width);
        setHeight(height);
    }
    public Rectangle(double width, double height, String color, boolean filled){
        setWidth(width);
        setHeight(height);
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return height*width;
    }

    public double getPerimeter(){
        return height*2+width*2;
    }
}
