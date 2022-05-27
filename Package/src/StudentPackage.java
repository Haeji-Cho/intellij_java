public class StudentPackage {
    public static void main(String[] args) {
        System.out.println(new Student1("김삿갓"));
    }
}


class Student1{
    String name;

    public Student1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("학생[%s]", name);
    }
}