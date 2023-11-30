package ru.gb;

public class Account {
    private double balance;

    public Account(double initialBalance) throws IllegalAccessException {
        if (initialBalance < 0){
            throw new IllegalAccessException("Начальный баланс счета не может быть отрицательным.");
        }
        this.balance = initialBalance;
    }

    public void refillBalance(double amount) throws IllegalAccessException {
        if (amount < 0) {
            throw new IllegalAccessException("Сумма не может быть отрицательной.");
        }
        this.balance += amount;
        System.out.println("Пополнение счета на сумму " + amount + ". Текущий баланс: " + balance);
    }

    public void withdrawalCash(double amount) throws IllegalAccessException, InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalAccessException("Сумма не может быть отрицательной.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств. Текущий баланс: " + balance);
        }
        this.balance -= amount;
        System.out.println("Снятие суммы в размере: " + amount + ". Текущий баланс: " + balance);
    }
}
