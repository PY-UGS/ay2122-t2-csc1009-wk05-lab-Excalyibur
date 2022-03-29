package Lab5_Q2;

public class Ellipse extends Shape {
    public Ellipse(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        double area = Math.PI * super.dim1 * super.dim2;
        return area;
    }
}
