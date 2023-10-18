package de.telran.baibak.iryna.cw5;

public class BankAccount {
    private int balance;
    private int number;

    public BankAccount(int balance, int number) {
        this.balance = balance;
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", number=" + number +
                '}';
    }

    @Override
    public BankAccount clone() throws CloneNotSupportedException {
        return (BankAccount) super.clone();
    }
}
