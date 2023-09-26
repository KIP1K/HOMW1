public class Main2 {
    public static void main(String[] args) {
        int depositAmount = 50000; //сумма пополнения
        int deposit = 150; //начальный счёт
        int bonus = depositAmount / 100;
        int balanceBonus = depositAmount + bonus + deposit; //баланс при выполнении условий
        int balance = depositAmount + deposit; //баланс без бонусов
        String thanks1000 = "Спасибо за пополнение, на ваш Л/С начисленно ";
        String yourBalace = "Ваш баланс: ";
        String bonusRuble = " бонусных рублей";
        String thanksFor = "Спасибо за пополнение баланса, в будущем вы сможете выгоднее пополнить свой баланс.";
        String infoBonus = "При сумме пополнения от 1000 рублей мы начисляем бонусы нашим клиентам. 100р = 1 бонусный рубль";
        if (depositAmount >= 1000) {

            System.out.println(thanks1000 + bonus + bonusRuble);
            System.out.println(yourBalace + balanceBonus);
        } else {
            System.out.println(thanksFor);
            System.out.println(infoBonus);
            System.out.println(yourBalace + balance);
        }


    }
}