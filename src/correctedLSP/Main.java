package correctedLSP;

public class Main {
    public static void main(String[] args) {
        Movable m1 = new Car();
        Movable m2 = new Bicycle();

        m1.move(); // The car accelerates using the engine.
        m2.move(); // The bicycle moves by pedaling.
    }
}
