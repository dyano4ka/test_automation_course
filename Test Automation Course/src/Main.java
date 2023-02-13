/* ENCAPSULAREA
public class Main {
    public static void main(String[] args) {
        ContBancar myObj = new ContBancar();
        myObj.setNumarCont("Xl2343");
        myObj.setSold("12345");

        System.out.println ("Numar Cont:"+ myObj.getnumarCont());
        System.out.println("Sold:"+ myObj.getsold());
    }
 */

/* MOSTENIREA - please edit!
public class Main {
    public static void main(String[] args) {
        Vehicul myObj = new Vehicul();
        myObj.culoare = myObj.culoare;
        myObj.nrRoti = myObj.nrRoti;
        System.out.println("Culoarea:" + myObj.culoare);
        System.out.println("Numar Roti:" + myObj.nrRoti);

    }
}
*/

/* POLIMORFISM */
class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPisica = new Pisica();
        Animal myCiine = new Ciine();

        myAnimal.emiteSunet();
        myPisica.emiteSunet();
        myCiine.emiteSunet();
    }
}