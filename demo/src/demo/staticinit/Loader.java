package demo.staticinit;

public class Loader {

    public static void main(String[] args) {
        System.out.println("Main 1");
        FunkyA val = null;
        System.out.println("Main 2");
        Object a1 = FunkyA.instance;
        System.out.println("Main 3");
        Object a2 = FunkyB.instance;
        System.out.println("Main 4");
    }

}
