public class Main {
    public static void main(String[] args) {
        try {
            ContulPersoanei myObj = new ContulPersoanei();
            myObj.setContulPersoanei(Integer.valueOf("36473D"));
            System.out.println("ID-ul contului este:" + " " + myObj.getContulPersoanei());
        } catch (Exception e) {
            System.out.println("Something went wrong - please check the ID");
        }
    }
}
