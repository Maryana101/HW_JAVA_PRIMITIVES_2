public class Main {
    public static void main(String[] args) {

        float startBill = 100;
        float incomePay = 1100; //платеж
        int BONUS_TAX = 100; //бонусная ставка
        float finalBill;
        int bonus = 0; //бонусное начисление

        if (incomePay > 1000) {
            bonus = (int) incomePay / BONUS_TAX;
            finalBill = startBill + incomePay + bonus;

        } else {
            finalBill = startBill + incomePay;
        }

        System.out.println("Оплата выполнена. Баланс: " + finalBill + " руб. Начислено бонусов: " + bonus);

    }
}