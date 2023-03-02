public class Methods {

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else if (end < start) {
            System.out.println("Nr sunt introduse in ordinea gresita");
            return 0;
        } else {
            return end;
        }
    }
}