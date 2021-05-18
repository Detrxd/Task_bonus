public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 1100;
        if (b < 1099) {
            int total = a + b;
            System.out.println("Ваш баланс равен : " + total + ", Вам начислено бонусных балов: 0 ");
        }
        if (b >= 1100) {
            int bonus = b / 100;
            int total_2 = a + b + bonus;
            System.out.println("Ваш баланс равен : " + total_2 + ", Вам начислено бонусных баллов : " + bonus);
        }
    }
}