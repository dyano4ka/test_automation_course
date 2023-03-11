public class Main {
    public static void main(String[] args) throws Exception {
        ContPersoana myObj = new ContPersoana(2, "Anelle", 14d);
        System.out.println(myObj);

        int result = ContPersoana.sustragereDeBani("Ana", 44d, 5d);
        System.out.println(result);

        int result2 = ContPersoana.transferCatrePersoana("Elena", 34d, 45d);
        System.out.println(result2);
    }
}