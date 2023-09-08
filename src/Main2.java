public class Main2 {
    public static void main(String[] args) {
        int DepositAmount = 50000; //сумма пополнения
        int Deposit = 150; //начальный счёт
        int Bonus = DepositAmount / 100;
        int BalanceBonus = DepositAmount + Bonus + Deposit; //баланс при выполнении условий
        int Balance = DepositAmount + Deposit; //баланс без бонусов
        String Thanks1000 = "Спасибо за пополнение, на ваш Л/С начисленно ";
        String YourBalace = "Ваш баланс: ";
        String BonusRuble = " бонусных рублей";
        String ThanksFor = "Спасибо за пополнение баланса, в будущем вы сможете выгоднее пополнить свой баланс.";
        String InfoBonus = "При сумме пополнения от 1000 рублей мы начисляем бонусы нашим клиентам. 100р = 1 бонусный рубль";
        if (DepositAmount >= 1000) {

            System.out.println(Thanks1000 + Bonus + BonusRuble);
            System.out.println(YourBalace + BalanceBonus);
        } else {
            System.out.println(ThanksFor);
            System.out.println(InfoBonus);
            System.out.println(YourBalace + Balance);
        }


    }
}