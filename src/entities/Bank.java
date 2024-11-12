package entities;

public class Bank {
    private int number;
    private String holder;
    private double deposit;

    public Bank() {
    }

    public Bank(int number, String holder, double deposit) {
        this.number = number;
        this.holder = holder;
        this.deposit = deposit;
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

    public double getDeposit() {
        return deposit;
    }

}
