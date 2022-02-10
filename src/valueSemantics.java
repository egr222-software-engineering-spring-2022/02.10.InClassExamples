public class valueSemantics {
    public static void main(String[] args) {
        // use the IntelliJ debugger to step through and confirm what variables are set to
        int x = 5;
        int y = x;     // x = 5, y = 5
        y = 17;        // x = 5, y = 17
        x = 8;

        System.out.println(x + " " + y);
    }
}