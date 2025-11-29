package BankAutomation;

public class Bank {

    // account storage
    Account[] accounts;
    int count;

    // transaction storage
    Transaction[] transactions;
    int txnCount;

    // daily totals
    double totalDeposits;
    double totalWithdrawals;

    // default constructor
    Bank() {
        this.accounts = new Account[100];
        this.transactions = new Transaction[200];
        this.count = 0;
        this.txnCount = 0;

        this.totalDeposits = 0.0;
        this.totalWithdrawals = 0.0;
    }

    // resize account array when full
    void resizeAccounts() {
        Account[] newArr = new Account[this.accounts.length * 2];
        for (int i = 0; i < this.accounts.length; i++) {
            newArr[i] = this.accounts[i];
        }
        this.accounts = newArr;
    }

    // resize transaction array when full
    void resizeTransactions() {
        Transaction[] newArr = new Transaction[this.transactions.length * 2];
        for (int i = 0; i < this.transactions.length; i++) {
            newArr[i] = this.transactions[i];
        }
        this.transactions = newArr;
    }

    // add a new account
    void addAccount(Account acc) {

        if (this.count == this.accounts.length) {
            resizeAccounts();
        }

        this.accounts[this.count] = acc;
        this.count++;
    }

    // find account by number
    Account findAccount(String accNo) {
        for (int i = 0; i < this.count; i++) {
            if (this.accounts[i].getAccNumber().equals(accNo)) {
                return this.accounts[i];
            }
        }
        return null;
    }

    // record a transaction
    void recordTransaction(String accNo, double amount, String type) {

        if (this.txnCount == this.transactions.length) {
            resizeTransactions();
        }

        Transaction t = new Transaction(accNo, this.txnCount + 1, amount, type);
        this.transactions[this.txnCount] = t;
        this.txnCount++;
    }

    // deposit money
    void depositToAccount(String accNo, double amount) {

        Account acc = findAccount(accNo);

        if (acc != null) {
            acc.deposit(amount);
            this.totalDeposits += amount;

            recordTransaction(accNo, amount, "Deposit");

        } else {
            System.out.println("Account not found!");
        }
    }

    // withdraw money
    void withdrawFromAccount(String accNo, double amount) {

        Account acc = findAccount(accNo);

        if (acc != null) {
            acc.withdraw(amount);
            this.totalWithdrawals += amount;

            recordTransaction(accNo, amount, "Withdraw");

        } else {
            System.out.println("Account not found!");
        }
    }

    // apply interest to every account
    void applyInterestToAll() {
        for (int i = 0; i < this.count; i++) {
            this.accounts[i].calculateInterest();
        }
    }

    
    //validate one account
    void validateOneAccount(String accNo) {

        Account acc = findAccount(accNo);

        if (acc != null) {
            String result = acc.validate();
            System.out.println(accNo + " (" + acc.getHolderName() + ") → " + result);
        } else {
            System.out.println("Account not found!");
        }
    }


    // validate all accounts
    void validateAllAccounts() {

        System.out.println("\n===== ACCOUNT VALIDATION REPORT =====");

        if (this.count == 0) {
            System.out.println("No accounts to validate.");
            return;
        }

        for (int i = 0; i < this.count; i++) {

            Account acc = this.accounts[i];
            String result = acc.validate();

            System.out.println(
                acc.getAccNumber() + " (" + acc.getHolderName() + ") → " + result
            );
        }

        System.out.println("=======================================");
    }


    // print all accounts
    void listAllAccounts() {
        if (this.count == 0) {
            System.out.println("No accounts created yet.");
        }
        for (int i = 0; i < this.count; i++) {
            System.out.println(this.accounts[i]);
        }
    }

    // REPORT 1 → ALL transactions of the day
    void printTransactionReport() {

        System.out.println("\n===== TRANSACTION REPORT =====");

        if (this.txnCount == 0) {
            System.out.println("No transactions recorded.");
        } else {
            for (int i = 0; i < this.txnCount; i++) {
                System.out.println(this.transactions[i].getRecord());
            }
        }

        System.out.println("================================");
    }

    // REPORT 2 → End-of-day bank summary
    void printEndOfDayReport() {

        System.out.println("\n===== END OF DAY BANK SUMMARY =====");

        System.out.println("Total Accounts: " + this.count);
        System.out.println("Total Deposited Today: " + this.totalDeposits);
        System.out.println("Total Withdrawn Today: " + this.totalWithdrawals);

        System.out.println("\n----- ACCOUNT DETAILS -----");
        listAllAccounts();

        System.out.println("====================================");
    }
}
// Bank class end

//Transaction class start
class Transaction {

String accountNo;
int transactionId;
double amount;
String type; 

// default constructor
Transaction() {
   this.accountNo = "";
   this.transactionId = 0;
   this.amount = 0.0;
   this.type = "";
}

// parameterized constructor
Transaction(String accountNo, int transactionId, double amount, String type) {
   this.accountNo = accountNo;
   this.transactionId = transactionId;
   this.amount = amount;
   this.type = type;
}

// getters
int getTransactionId() {
   return this.transactionId;
}

String getType() {
   return this.type;
}

double getAmount() {
   return this.amount;
}

// returns a readable record
String getRecord() {
   return "TxnID: " + this.transactionId +
          ", Account: " + this.accountNo +
          ", Type: " + this.type +
          ", Amount: " + this.amount;
}
}
//Transaction class end
