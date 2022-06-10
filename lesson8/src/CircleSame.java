import javafx.scene.shape.Circle;

import java.util.Objects;

public class CircleSame {
    public static void main(String[] args) {
        Circle3 c1 = new Circle3(3);
        Circle3 c2 = new Circle3(3);

        if(c1.equals(c2))
            System.out.println("c1과 c2는 같다.");
        else
            System.out.println("c1과 c2는 다르다.");
    }
}

class Circle3{
    int num;

    public Circle3(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle3 circle3 = (Circle3) o;
        return num == circle3.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}