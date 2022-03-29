package Lab5_Q2;

public class Triangle extends Shape {
    public Triangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        double area = 0.5 * super.dim1 * super.dim2;
        return area;
    }
}
