import java.util.ArrayList;

public class ShapeBuilder {

ArrayList<Shape> Shapes = new ArrayList<>();

public void addShape(Shape s) {
    Shapes.add(s);
}

public double getTotalArea() {
    double total = 0;
    for (Shape s : Shapes) {
        total += s.getArea();
    }
    return total;
}

    public static void main(String[] args) {

    ShapeBuilder builder = new ShapeBuilder();

        Square s1 = new Square(4);
        Circle c1 = new Circle(2);

        System.out.println(s1.getArea());
        System.out.println(c1.getArea());

        builder.addShape(s1);
        builder.addShape(c1);

        System.out.println("Det samlede areal: "+builder.getTotalArea());

    }



}
