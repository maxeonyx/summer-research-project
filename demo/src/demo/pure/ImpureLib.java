package demo.pure;

import org.checkerframework.dataflow.qual.Pure;

public class ImpureLib {

    // There's no clear way to check the purity of static initializers.
    // However static initializers must be run to instantiate a class.
    // We might be forced to annotate importing pure libraries with
    // an initializer effect.
    // The impact can be kept low by initializing a library in one go.
    public static final ImpureLib lib = new ImpureLib();

    @Pure
    public ImpureLib() {
        System.out.println("Impure constructor!");
    }

    public String getMessage() {
        System.out.println("SIDE EFFECT");
        return "Message from Purity-checked java.";
    }

}
