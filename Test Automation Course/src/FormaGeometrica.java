// Abstract class
abstract class FormaGeometrica {
    // Abstract method (does not have a body)
    public abstract void calculArie();
}

// Subclass (inherit from Animal)
class Triunghi extends FormaGeometrica {
    public void calculArie() {
        // The body of animalSound() is provided here
        System.out.println("AriaTriunghiului este: 53");
    }
    }


class Patrat extends FormaGeometrica {
    public void calculArie() {
        // The body of animalSound() is provided here
        System.out.println("AriaPatratului este: 44");
    }
}
