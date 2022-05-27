import java.util.Objects;

public class SameDemo {
    public static void main(String[] args) {
        Same s1 = new Same("Logi");
        Same s2 = new Same("Logi");

        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
}

class Same{
    String name;

    public Same(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Same[" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
       /* if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Same same = (Same) o;
        return Objects.equals(name, same.name);*/

        if(o instanceof Same)
        {
            Same s = (Same)o;
            if(name.equals(s.name))
                return true;
        }
        return false;
    }

}
