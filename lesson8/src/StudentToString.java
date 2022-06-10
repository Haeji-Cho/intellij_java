public class StudentToString{
    public static void main(String[] args) {
        System.out.println(new St("김삿갓"));
        System.out.println(new St("홍길동"));
    }
}

class St{
    String name;

    public St(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "학생[" + name + "]";
    }
}
