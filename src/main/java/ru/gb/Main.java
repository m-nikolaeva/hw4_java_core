package ru.gb;

public class Main {
    public static void main(String[] args) {
        try{
//            Создание счета с балансом 10000
            Account acc1 = new Account(10000);
//            Создание счета с балансом 5000
            Account acc2 = new Account(5000);
//            Создание счета с балансом -5000
//            Account acc3 = new Account(-5000);

//            Снятие со счета 7000
            acc1.withdrawalCash(7000);
            System.out.println();

//            Пополнение счета на 20000
            acc1.refillBalance(20000);
            System.out.println();

//            Перевод со счета на счет 5000
            Transaction.transfer(acc1, acc2, 5000);
            System.out.println();

//            Перевод со счета на счет -5000
//            Transaction.transfer(acc1, acc2, -5000);

//            Попытка перевода с карты на карту при недостатке средств
            Transaction.transfer(acc1, acc2, 20000);
        }
        catch (IllegalAccessException | InsufficientFundsException e) {
            System.out.println("Внимание! " + e.getMessage());
        }
    }
}