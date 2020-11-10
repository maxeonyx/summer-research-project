import org.checkerframework.dataflow.qual.*;

public class PureLib {

    public static final PureLib lib = new PureLib();

    public @Pure String getMessage() {
        return "Message from Purity-checked java.";
    }

}
