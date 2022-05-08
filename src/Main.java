public class Main {
    public static void main(String[] args) {
        int firstAccount = 5000;
        int addedAmmount = 2400;
        int bonus = addedAmmount / 100;
        int result;
        if (addedAmmount > 1000) {
            result = firstAccount + addedAmmount + bonus;
        } else {
            result = firstAccount + addedAmmount;
        }
        System.out.println("Итоговая сумма:" + result);
    }

}
