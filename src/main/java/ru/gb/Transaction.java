package ru.gb;

public class Transaction {
    public static void transfer(Account fromAccount, Account toAccount, double amount)
            throws InsufficientFundsException {
        try {
            fromAccount.withdrawalCash(amount);
            System.out.println("Перевод осуществлен успешно.");
            toAccount.refillBalance(amount);
        }
        catch (InsufficientFundsException | IllegalAccessException e) {
            throw new InsufficientFundsException(e.getMessage());
        }
    }
}
