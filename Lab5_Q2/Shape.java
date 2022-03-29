package Lab5_Q2;

abstract class Shape {
    public int dim1;
    public int dim2;
    public Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}
