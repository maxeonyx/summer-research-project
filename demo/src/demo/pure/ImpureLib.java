package demo.pure;

public class ImpureLib {

    public static final ImpureLib lib = new ImpureLib();

    public String getMessage() {
        System.out.println("SIDE EFFECT");
        return "Message from Purity-checked java.";
    }

}
