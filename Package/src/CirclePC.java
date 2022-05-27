import javafx.scene.shape.Circle;

import java.util.Objects;

public class CirclePC {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(3);
        Circle2 c2 = new Circle2(3);

        if(c1.equals(c2))
            System.out.println("c1과 c2는 같다");
        else
            System.out.println("c1은 c2와 다르다");

    }
}
class Circle2{
    int radius;

    public Circle2(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        Circle2 circle2 = (Circle2) o;
        return radius == circle2.radius;
    }


    @Override
    public String toString() {
        return "Circle("+ radius + ')';
    }
}
