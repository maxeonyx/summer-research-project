import org.checkerframework.dataflow.qual.*;

public class ShouldBePureLib {

    public static final ShouldBePureLib lib = new ShouldBePureLib();

    public @Pure String getMessageSound() {
        return pureMethod();
    }

    public String pureMethod() {
        return "Message from Purity-checked java.";
    }

}
