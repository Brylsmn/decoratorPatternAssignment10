public class GSave implements BankAccountDecorator{
    private BankAccount bankAccount;

    public GSave(BankAccount decoratedAccount) {
        this.bankAccount = decoratedAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String showAccountType() {
        return "GSave";
    }

    public double getInterestRate() {
        return 0.025;
    }

    public double getBalance() {
        return bankAccount.getBalance();
    }

    public String showBenefits() {
        return bankAccount.showBenefits() + ", GCash Transfer";
    }

    public double computeBalanceWithInterest() {
        double newBalance = bankAccount.getBalance() * (1 + getInterestRate());
        return newBalance;
    }

    public String showInfo() {
        return bankAccount.showInfo();
    }
}
