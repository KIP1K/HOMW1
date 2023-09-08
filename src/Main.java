public class Main {
    public static void main(String[] args) {
        int TicketPrice = 13676; //стоимость билета
        int Mile = 20; //бонусная миля
        int Bonus = TicketPrice / Mile;
        String Account = "Милей на вашем счёте: ";
        String Ready = Account + Bonus;
        System.out.println(Ready);
    }
}
