package liskovsubstitution;

/**
 * 여기서 Shape 클래스는 그림의 면적을 계산하는 추상 클래스로,
 * Rectangle 클래스는 Shape 클래스를 상속받아 구현합니다.
 * 이렇게 하면 프로그램에서는 Shape 클래스를 사용하면서,
 * Rectangle 클래스를 사용할 수 있게 됩니다.
 *
 * 이렇게 하면 상위 타입인 Shape 클래스를 하위 타입인 Rectangle 클래스로 대체할 수 있어야 합니다.
 * 즉, Shape 클래스에 정의된 메서드들을 Rectangle 클래스에서도 사용가능해야 합니다.
 */

public class Shape {
    public double area() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
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

    @Override
    public double area() {
        return width * height;
    }
}
