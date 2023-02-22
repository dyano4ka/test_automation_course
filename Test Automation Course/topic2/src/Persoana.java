public class Persoana {
    private String Nume;
    public String Prenume;
    public Integer Virsta;
    protected Float Greutate;

    public String getNume() {
        return Nume;
    }
    public void setNume(String newNume) {
        this.Nume = newNume;
    }

    public void Prenume(String newPrenume) {
        this.Prenume = newPrenume;
    }

    public void Virsta(String newVirsta) {
        this.Virsta = Integer.valueOf(newVirsta);
    }
}