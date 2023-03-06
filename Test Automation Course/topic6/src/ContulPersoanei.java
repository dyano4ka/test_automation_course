public class ContulPersoanei {
    private Integer id;
    private String sumaCurenta;
    private String numePersoana;

    public ContulPersoanei() {
    }

    public Integer getContulPersoanei() {
        return this.id;
    }

    public String getSumaCurenta() {
        return this.sumaCurenta;
    }

    public String getNumePersoana() {
        return this.numePersoana;
    }

    public void setContulPersoanei(Integer newContulPersoanei) {
        this.id = newContulPersoanei;
    }

    public void setSumaCurenta(String newSumaCurenta) {
        this.sumaCurenta = newSumaCurenta;
    }

    public void setNumePersoana(String newNumePersoana) {
        this.numePersoana = newNumePersoana;
    }
}