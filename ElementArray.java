package Q02;

public class ElementArray {
    public static void main(String[] args) {
        Element[] elements = new Element[4];
        elements[0] = new MetalElement("Cu", 29, 63.55);
        elements[1] = new MetalElement("Fe", 26, 55.85);
        elements[2] = new NonMetalElement("O", 8, 15.99);
        elements[3] = new NonMetalElement("N", 7, 14.01);

        for (Element e : elements) {
            e.describeElement();
            System.out.println();
        }
    }
}

