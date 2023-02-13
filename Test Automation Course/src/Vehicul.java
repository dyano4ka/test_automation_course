public class Vehicul {
    protected String culoare = "Rosu";
    protected String nrRoti = "4";
    public void afiseazaDetaliiVehicul () {
        System.out.println(culoare + nrRoti);
    }
}
class Masina extends Vehicul {
    private String marca = "Ferrari";
    public static void main(String[] args) {
        Masina myMasinaRapida = new Masina();
        myMasinaRapida.afiseazaDetaliiVehicul();
        System.out.println(myMasinaRapida.culoare + " " + myMasinaRapida.marca);
    }
}

