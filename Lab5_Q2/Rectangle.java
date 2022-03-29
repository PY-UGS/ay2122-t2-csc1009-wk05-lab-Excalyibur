package Lab5_Q2;

public class Rectangle extends Shape {
    public Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }


    @Override
    public double area() {
        double area = super.dim1 * super.dim2;
        return area;
    }
}
