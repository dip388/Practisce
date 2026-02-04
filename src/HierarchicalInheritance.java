import org.w3c.dom.css.Rect;

class Shape {
    void draw() { System.out.println("Drawing a shape"); }
}

class Circle extends Shape {
    void area() { System.out.println("Area = πr^2"); }
}

class Rectangle extends Shape {
    void area() { System.out.println("Area = l * b"); }
}


public class HierarchicalInheritance {
    static void main(String[] args) {
        Circle c=new Circle();
        c.draw();
        c.area();

        Rectangle r=new Rectangle();
        r.draw();
        r.area();
    }
}
