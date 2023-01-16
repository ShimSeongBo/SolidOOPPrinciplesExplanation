package interfacesegregation;

public interface Shape {
    double area();
}

interface Shape3D extends Shape {
    double volume();
}

class Cube implements Shape3D {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
