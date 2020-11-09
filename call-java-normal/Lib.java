public class Lib {

    public static final Lib lib = new Lib();

    public Lib() {}

    public String getMessage() {
        return "Message from Java.";
    }

    public static void main(String[] args) {
        System.out.println(new Lib().getMessage());
    }

}
