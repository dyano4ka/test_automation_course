public class ContPersoana {
    private int id;
    private Double sumaCurenta;
    private String numePersoana;
    public Double sumaExtrasa;

    public Double sumaTransferata;

    public ContPersoana(int id, String numePersoana, Double sumaCurenta) throws Exception {
        this.setId(id);
        this.setNumePersoana(numePersoana);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if (id < 0)
            throw new Exception("Valorile unui ID nu pot fi negative");
        this.id = id;
    }

    public Double getSumaCurenta() {
        return sumaCurenta;
    }

    public void setSumaCurenta(Double sumaCurenta) {
        this.sumaCurenta = sumaCurenta;
    }

    public String getNumePersoana() {
        return numePersoana;
    }

    public void setNumePersoana(String numePersoana) throws RuntimeException {
        if (numePersoana.length() == 0)
            throw new RuntimeException("Numele nu poate fi gol");

        else if (numePersoana.length() < 5)
            throw new IllegalArgumentException("Numele este prea scurt");
        this.numePersoana = numePersoana;
    }

    public void setSumaExtrasa(String sumaExtrasa){
        this.sumaExtrasa = Double.valueOf(sumaExtrasa);
    }

    public void setSumaTransferata(String sumaTransferata){
        this.sumaTransferata = Double.valueOf(sumaTransferata);
    }

    public static int sustragereDeBani(String numePersoana, Double sumaCurenta, Double sumaExtrasa) throws Exception{
        if (sumaExtrasa > sumaCurenta)
            throw new RuntimeException("Eroare! Suma extrasa nu poate fi mai mare ca suma curenta");
        System.out.println("Banii sustrasi cu succes din contul:" + numePersoana + " " + "suma:" +" " + (sumaCurenta - sumaExtrasa));
        return 0;
    }

    public static int transferCatrePersoana(String numePersoana, Double sumaCurenta, Double sumaTransferata){
        System.out.println("Banii transferati cu success pe contul:" + numePersoana + " " + "suma:" +" "+ (sumaCurenta+sumaTransferata));
        return 0;
    }
}

