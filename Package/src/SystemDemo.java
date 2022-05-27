public class SystemDemo {
    public static void main(String[] args) {

        for(int i = 0; i < 3; i++)
            new Garbage(i);
        System.gc();
    }
}

class Garbage {
    public int no;

    public Garbage(int no){
        this.no = no;
        System.out.printf("Garbage(%d) 셍성\n", no );


    }

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Garbage(%d) 수거\n", no );
    }
}