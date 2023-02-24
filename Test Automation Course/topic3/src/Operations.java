public class Operations {
    static void printAritmeticOperations() {
        int a = 2;
        int b = 3;
        System.out.println("Impartirea:" + b / a);
        System.out.println("Adunarea:" + b + a);

    }

    static void printLogicOperations() {
        boolean a = true;
        boolean b = false;
        System.out.println("And:" + (a && b));
        System.out.println("Or:" + (a || b));
    }

    static void printRelationOperations() {
        int a = 10;
        int b = 20;
        System.out.println("A mai mare ca B:" + (a > b));
        System.out.println("A mai mic sau egal cu B:" + (a <= b));


    }

    static void useForandWhile() {
        int a = 5;
        while (a < 7) {
            System.out.println("Valoarea lui A este:" + a);
            a++;
            System.out.print("\n");
        }
    }
}
