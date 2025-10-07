package violationLSP;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Bicycle();
        v.accelerate(); // LSP violated: throws exception
    }
}
