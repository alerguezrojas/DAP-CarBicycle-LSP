package violationLSP;

class Bicycle extends Vehicle {
    @Override
    public void accelerate() {
        throw new UnsupportedOperationException("A bicycle cannot accelerate like this.");
    }
}