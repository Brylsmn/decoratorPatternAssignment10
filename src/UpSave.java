public class UpSave implements BankAccountDecorator{
    private BankAccount bankAccount;

    public UpSave(BankAccount decoratedAccount) {
        this.bankAccount = decoratedAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String showAccountType() {
        return "UpSave";
    }

    public double getInterestRate() {
        return 0.04;
    }

    public double getBalance() {
        return bankAccount.getBalance();
    }

    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
    }

    public double computeBalanceWithInterest() {
        double newBalance = bankAccount.getBalance() * (1 + getInterestRate());
        return newBalance;
    }

    public String showInfo() {
        return bankAccount.showInfo();
    }
}
