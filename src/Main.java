public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13676; //стоимость билета
        int mile = 20; //бонусная миля
        int bonus = ticketPrice / mile;
        String account = "Милей на вашем счёте: ";
        String ready = account + bonus;
        System.out.println(ready);
    }
}
