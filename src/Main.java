public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int adding = 1100;
        if (adding < 1099) {
            int total = balance + adding;
            System.out.println("Ваш баланс равен : " + total + ", Вам начислено бонусных балов: 0 ");
        }
        if (adding >= 1100) {
            int bonus = adding / 100;
            int totalAll = balance + adding + bonus;
            System.out.println("Ваш баланс равен : " + totalAll + ", Вам начислено бонусных баллов : " + bonus);
        }
    }
}