package BankAutomation;

// Account class start
public abstract class Account {

    String accNumber;
    String holderName;
    double balance;

    // default constructor
    Account() {
        this.accNumber = "";
        this.holderName = "";
        this.balance = 0.0;
    }

    // parameterized constructor
    Account(String accNumber, String holderName, double balance) {
        this.accNumber = accNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // getters
    String getAccNumber() {
        return this.accNumber;
    }

    String getHolderName() {
        return this.holderName;
    }

    double getBalance() {
        return this.balance;
    }

    // setters
    void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    // deposit
    void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // withdraw
    void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Cannot withdraw! Insufficient balance.");
        }
    }

    //interest
    void calculateInterest() {
        // overridden in subclasses
    }

    abstract String validate();

    // toString override
    @Override
    public String toString() {
        return "Account Number: " + this.accNumber +
               ", Holder Name: " + this.holderName +
               ", Balance: " + this.balance;
    }
}
// Account class end

//SavingsAccount class start
class SavingsAccount extends Account {

 final double MIN_BALANCE = 10000;

 // default constructor
 SavingsAccount() {
     super();
 }

 // parameterized constructor
 SavingsAccount(String accNumber, String holderName, double balance) {
     super(accNumber, holderName, balance);
 }

 // getters (if needed)
 double getMinBalance() {
     return this.MIN_BALANCE;
 }

 // setters (not needed because MIN_BALANCE is final)

 // calculate interest (example: 4%)
 @Override
 void calculateInterest() {
     double interest = this.balance * 0.04; // 4% interest
     this.balance += interest;
     System.out.println("Interest added (Savings): " + interest);
 }

 // validate minimum balance rule
 @Override
 String validate() {
     if (this.balance < MIN_BALANCE) {
         return "Below Minimum Balance";
     }
     return "OK";
 }


 // toString override (optional)
 @Override
 public String toString() {
     return "SavingsAccount -> " + super.toString();
 }
}
//SavingsAccount class end

//SalaryAccount class start
class SalaryAccount extends Account {

 int monthsInactive;
 boolean frozen;

 // default constructor
 SalaryAccount() {
     super();
     this.monthsInactive = 0;
     this.frozen = false;
 }

 // parameterized constructor
 SalaryAccount(String accNumber, String holderName, double balance) {
     super(accNumber, holderName, balance);
     this.monthsInactive = 0;
     this.frozen = false;
 }

 // getters
 int getMonthsInactive() {
     return this.monthsInactive;
 }

 boolean isFrozen() {
     return this.frozen;
 }

 // setters
 void setMonthsInactive(int monthsInactive) {
     this.monthsInactive = monthsInactive;
 }

 void setFrozen(boolean frozen) {
     this.frozen = frozen;
 }

 // calculate interest (3% example)
 @Override
 void calculateInterest() {
     if (!this.frozen) {
         double interest = this.balance * 0.03; // 3%
         this.balance += interest;
         System.out.println("Interest added (Salary): " + interest);
     } else {
         System.out.println("No interest added. Account frozen.");
     }
 }

 // validate inactivity and freeze logic
 @Override
 String validate() {
     if (this.monthsInactive >= 2) {
         this.frozen = true;
         return "Frozen (No activity for 2 months)";
     }
     return "OK";
 }


 // update inactivity
 void incrementInactiveMonths() {
     this.monthsInactive++;
 }

 void unfreeze() {
     this.frozen = false;
     this.monthsInactive = 0;
 }

 @Override
 public String toString() {
     return "SalaryAccount -> " + super.toString() +
            ", Frozen: " + this.frozen +
            ", Months Inactive: " + this.monthsInactive;
 }
}
//SalaryAccount class end

//CurrentAccount class start
class CurrentAccount extends Account {

 double overdraftLimit;

 // default constructor
 CurrentAccount() {
     super();
     this.overdraftLimit = 0.0;
 }

 // parameterized constructor
 CurrentAccount(String accNumber, String holderName, double balance, double overdraftLimit) {
     super(accNumber, holderName, balance);
     this.overdraftLimit = overdraftLimit;
 }

 // getters
 double getOverdraftLimit() {
     return this.overdraftLimit;
 }

 // setters
 void setOverdraftLimit(double overdraftLimit) {
     this.overdraftLimit = overdraftLimit;
 }

 // withdraw with overdraft logic
 @Override
 void withdraw(double amount) {
     if (amount <= 0) {
         System.out.println("Invalid amount!");
         return;
     }

     // balance + overdraftLimit = maximum allowed withdrawal
     if (amount <= this.balance + this.overdraftLimit) {
         this.balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Overdraft limit exceeded!");
     }
 }

 // current accounts usually have no interest
 @Override
 void calculateInterest() {
     System.out.println("No interest for Current Accounts.");
 }

 // validate overdraft usage
 @Override
 String validate() {
     if (this.balance < -this.overdraftLimit) {
         return "Overdraft Limit Exceeded";
     }
     return "OK";
 }


 boolean isOverdraftUsed() {
     return this.balance < 0;
 }

 @Override
 public String toString() {
     return "CurrentAccount -> " + super.toString() +
            ", OverdraftLimit: " + this.overdraftLimit;
 }
}
//CurrentAccount class end

//LoanAccount class start
class LoanAccount extends Account {

 double loanAmount;

 // default constructor
 LoanAccount() {
     super();
     this.loanAmount = 0.0;
     this.balance = 0.0;  // no loan initially
 }

 // parameterized constructor
 LoanAccount(String accNumber, String holderName, double loanAmount) {
     super(accNumber, holderName, -loanAmount); // balance becomes negative
     this.loanAmount = loanAmount;
 }

 // getters
 double getLoanAmount() {
     return this.loanAmount;
 }

 // setters
 void setLoanAmount(double loanAmount) {
     this.loanAmount = loanAmount;
     this.balance = -loanAmount; // update balance accordingly
 }

 // apply interest on loan (example: 10% interest)
 @Override
 void calculateInterest() {
     double interest = Math.abs(this.balance) * 0.10; // 10%
     this.balance -= interest; // becomes more negative
     System.out.println("Interest added on Loan: " + interest);
 }

 // validate if loan is paid off
 @Override
 String validate() {
     if (this.balance >= 0) {
         return "Loan Fully Paid";
     }
     return "Loan Active";
 }


 // extra method: make loan payment
 void makePayment(double amount) {
     if (amount > 0) {
         this.balance += amount; // balance less negative
         System.out.println("Payment made: " + amount);
     }
 }

 boolean isLoanCleared() {
     return this.balance >= 0;
 }

 @Override
 public String toString() {
     return "LoanAccount -> " + super.toString() +
            ", Original Loan Amount: " + this.loanAmount;
 }
}
//LoanAccount class end





