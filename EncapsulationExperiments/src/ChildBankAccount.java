public class ChildBankAccount {
    private double balance;
    private double maxBalance;

    public void ChildBankAccount(double maxBalance) {
            balance = 0.0;
            this.maxBalance = maxBalance;
     }

    public boolean depositMoney(double value) {
        double sum = balance + value;
        if(sum < 0 || value > 0) {
            return  true;
        } else {
            return false;
        }
    }


}
