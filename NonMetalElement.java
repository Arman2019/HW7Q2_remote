package Q02;

public class NonMetalElement extends Element {
    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    public void describeElement() {
        System.out.println("Non-Metal Element: " + getSymbol() + " Atomic Number: " + getAtomicNumber() +
                " Atomic Weight: " + getAtomicWeight());
        System.out.println("Properties: Poor conductor of electricity");
    }
}
