package Q02;

public class MetalElement extends Element {
    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    public void describeElement() {
        System.out.println("Metal Element: " + getSymbol() + " Atomic Number: " + getAtomicNumber() +
                " Atomic Weight: " + getAtomicWeight());
        System.out.println("Properties: Good conductor of electricity");
    }
}

