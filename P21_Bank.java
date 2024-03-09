class BankAccount {
    String accNo;
    String owner;
    double balance;

    public BankAccount() {

    }

    public BankAccount(String accNo, String owner, double balance) {
        this.accNo = accNo;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        double balance = this.getBalance();
        if (amount > 0) {
            this.setBalance(balance + amount);
            System.out.println("Amount " + amount + " deposited in account number: " + this.getAccNo());
        } else {
            System.out.println("No amount to be deposited.");
        }
    }

    public void withdraw(double amount) {
        double balance = this.getBalance();
        if (amount >= balance) {
            System.out.println("Insufficient Balance");
        } else {
            this.setBalance(balance - amount);
            System.out.println("Successfully Withdrawn!");
        }
    }

    public void withdraw(double amount, double balance) {
        if (amount >= balance) {
            System.out.println("Insufficient Balance");
        } else {
            this.setBalance(balance - amount);
            System.out.println("Successfully Withdrawn!");
        }
    }
}

class SavingsAccount extends BankAccount {
    private int interestRate;
    private double minAmount;

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount() {
        super();
        this.interestRate = 0;
        this.minAmount = 0;
    }

    public SavingsAccount(String accNo, String owner, double balance, int minAmount, int interestRate) {
        super(accNo, owner, balance);
        this.interestRate = interestRate;
        this.minAmount = minAmount;
    }

    public void withdraw(double amount) {
        double currentBalance = this.getBalance();
        if (amount >= currentBalance) {
            System.out.println("Insufficient Balance");
        } else {
            this.setBalance(currentBalance - amount);
            System.out.println("Successfully Withdrawn!");
        }
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;
    private double overdraftedAmount;

    public double getOverdraftedAmount() {
        return overdraftedAmount;
    }

    public void setOverdraftedAmount(double overdraftedAmount) {
        this.overdraftedAmount = overdraftedAmount;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(String accNo, String owner, double balance, double limit) {
        super(accNo, owner, balance);
        this.overdraftLimit = limit;
        this.overdraftedAmount = 0;
    }

    public void withdraw(double amount) {
        double availableBalance = (this.getBalance() + this.getOverdraftLimit()) - this.overdraftedAmount;
        if (amount > this.getBalance()) {
            if (amount <= availableBalance) {
                super.withdraw(amount, availableBalance);
                this.overdraftedAmount = amount;
            } else {
                super.withdraw(amount);
            }
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            if (this.overdraftedAmount > 0) {
                double over = this.getOverdraftedAmount();
                if (amount > over) {
                    super.deposit((amount - over));
                    this.setOverdraftedAmount(0);
                } else {
                    this.setOverdraftedAmount(over - amount);
                }
            } else {
                super.deposit(amount);
            }
        } else {
            System.out.println("No amount to be deposited.");
        }
    }
}

public class P21_Bank {
    public static void main(String Args[]) {
        // ** creating a normal account
        BankAccount acc1 = new BankAccount();
        acc1.setAccNo("10245678903456789");
        acc1.setOwner("Nikhil");
        acc1.deposit(500);
        System.out.println("current balance in " + acc1.getAccNo() + "is: " + acc1.getBalance());
        // ** creating a savings account
        SavingsAccount acc2 = new SavingsAccount("20245678903456789", "Mohit", 300, 10, 3);
        acc2.withdraw(300);
        System.out.println("\n current balance in " + acc2.getAccNo() + " is :" + acc2.getBalance());
        // ** creating a checking account
        CheckingAccount acc3 = new CheckingAccount("30245678903456789", "Hari",1000, 50000);
        acc3.deposit(1000);
        acc3.withdraw(50000);
        System.out.println("\n Current Balance in " + acc3.getAccNo() + " is : " + acc3.getBalance() + " and overdrafted amount is " + acc3.getOverdraftedAmount());
        acc3.deposit(60000);
        System.out.println("\n Current Balance in " + acc3.getAccNo() + " is : " + acc3.getBalance() + " and overdrafted amount is " + acc3.getOverdraftedAmount());
    }
}