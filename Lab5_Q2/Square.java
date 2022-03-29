package Lab5_Q2;

public class Square extends Shape {
    public Square(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        double area = super.dim1 * super.dim2;
        return area;
    }
}
