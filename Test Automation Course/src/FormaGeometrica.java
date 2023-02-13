abstract class FormaGeometrica {
    public abstract void calculArie();
}

class Triunghi extends FormaGeometrica {
    public void calculArie() {
        System.out.println("AriaTriunghiului este: 53");
    }
    }

class Patrat extends FormaGeometrica {
    public void calculArie() {
        System.out.println("AriaPatratului este: 44");
    }
}
