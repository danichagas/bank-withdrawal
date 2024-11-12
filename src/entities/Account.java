package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account() {
    }

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(int value) {
        this.balance += value;
    }

    public void withdraw(int value) {
        this.balance -= value - 5;
    }
}