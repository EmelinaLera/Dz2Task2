public class Task2 {
    public static void main(String[] args) {
        int balance = 500;
        int deposit = 3000;
        int totalAmount = balance + deposit;
        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;

        }
        System.out.println(bonus);

        System.out.println(totalAmount);

    }
}
