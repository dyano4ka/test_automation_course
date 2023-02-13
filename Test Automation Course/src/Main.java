public class Main {
    public static void main(String[] args) {
        ContBancar myObj = new ContBancar();
        myObj.setNumarCont("Xl2343");
        myObj.setSold("12345");

        System.out.println ("Numar Cont:"+ myObj.getnumarCont());
        System.out.println("Sold:"+ myObj.getsold());
    }
}