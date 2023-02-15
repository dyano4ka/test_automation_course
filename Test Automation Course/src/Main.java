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

/* MOSTENIREA - please edit! */

class Main {
    public static void main(String[] args) {
        Masina myMasinaRapida = new Masina();
        myMasinaRapida.afiseazaDetaliiVehicul();
        myMasinaRapida.getInfo();
    }
}

/* POLIMORFISM
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
 */

/* ABSTRACTIA
class Main {
    public static void main(String[] args) {
        Triunghi myTriunghi = new Triunghi();
        Patrat myPatrat = new Patrat();
        myTriunghi.calculArie();
        myPatrat.calculArie();

    }
}
 */