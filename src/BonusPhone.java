public class BonusPhone {
    public static void main(String[] args) {

        int balance = 250;
        int amount = 2500;
        int bonus = amount / 100;
        int summary = balance + amount;

        if (amount >= 1000) {
            System.out.println("Бонусов начислено " + bonus);
            System.out.println("Текущий баланс " + (summary + bonus));
        } else {
            System.out.println("Текущий баланс " + summary);
            System.out.println("Баллов начислено : " + 0);

        }
    }
}





