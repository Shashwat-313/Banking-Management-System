class ATM {
    private int accno;
    private int balance;

    public ATM(int accno) {
        this.accno = accno;
        this.balance = 0;
    }

    void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance += amount;
            System.out.println("Amount deposited successfully");
        }
    }

    void withdraw(int amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid amount or insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
        }
    }

    void checkBalance() {
        System.out.println("Account No: " + accno);
        System.out.println("Current Balance: " + balance);
    }
}
