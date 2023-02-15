public class Vehicul {
    protected String culoare = "Rosu";
    protected String nrRoti = "4";

    String newline = System.lineSeparator();
    public void afiseazaDetaliiVehicul () {
        System.out.println("Culoarea:" + culoare + newline+ "Numar Roti:" + nrRoti);
    }
}
class Masina extends Vehicul {
    private String marca = "Ferrari";
    public void getInfo () {
        System.out.println("Marca:" + marca);
    }
}

