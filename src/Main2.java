public class Main2 {
    public static void main(String[] args) {
        int x = 50000; //сумма пополнения
        int y = 150; //начальный счёт
        int z = x / 100;
        int xx = x+z+y; //баланс при выполнении условий
        int yy = x+y; //баланс без бонусов
        String XX = "Спасибо за пополнение, на ваш Л/С начисленно ";
        String XXX = "Ваш баланс: ";
        String ZZ = " бонусных рублей";
        String YY = "Спасибо за пополнение баланса, в будущем вы сможете выгоднее пополнить свой баланс.";
        String QQ = "При сумме пополнения от 1000 рублей мы начисляем бонусы нашим клиентам. 100р = 1 бонусный рубль";
        if (x >= 1000)
        {

            System.out.println(XX + z + ZZ);
            System.out.println(XXX + xx );
        }
        else {
            System.out.println(YY);
            System.out.println(QQ);
            System.out.println(XXX + yy);
        }


    }
}