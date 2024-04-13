public class Main {
    public static void main(String[] args) {
        int initialamount = 100;
        int addedAmount = 2000;
        int bonus = addedAmount / 100;
        long totalSum = initialamount + addedAmount + bonus;

        System.out.println("Уважаемый клиент! Спасибо, что Вы с нами всё это время!" +
                "За пополнение на счёт от 1000 рублей Вам начислятся приятные бонусы!" +
                "А куда их тратить - решать только Вам!");

        System.out.println("Сумма на Вашем счёте: " + totalSum);

        System.out.println("Сумма начисленных бонусных баллов: " + bonus);
    }
}
