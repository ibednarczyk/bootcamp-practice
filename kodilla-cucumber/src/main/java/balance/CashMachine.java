package balance;

public class CashMachine {
    private CashMachineSlot slot;

    public CashMachine(CashMachineSlot slot) {
        this.slot = slot;
    }

    public void withdraw (Account account, int amount) {
        if (account.getBalance() >= amount && amount > 0){
            slot.dispense(amount);
        }
        account.debit(amount);
    }

    public String displayBalance (Account account) {
        return "Your account's balance: $" + account.getBalance();
    }

    public String checkOperation (Account account, int amount) {
        if (amount <= 0) {
            return "Please, enter correct amount";

        } else if (account.getBalance() < amount) {
            return "You have insufficient funds in your account";

        } return "Successful withdrawal. Please, choose next operation";

    }
}
