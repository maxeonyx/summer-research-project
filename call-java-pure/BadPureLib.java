import org.checkerframework.dataflow.qual.*;

public class BadPureLib {

    public static final BadPureLib lib = new BadPureLib();

    public @Pure String getMessageUnsound() {
        return effectfulMethod();
    }

    private String effectfulMethod() {
        System.out.println("SIDE EFFECT");
        return "Message from Purity-checked java.";
    }

}
