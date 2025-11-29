package BankAutomation;

import java.util.Scanner;

// ========================= MAIN START ==========================

public class BankApplication {

	public static void main(String[] args) {

		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);

		boolean running = true;

		while (running) {

			// MAIN MENU
			System.out.println("        BANK MAIN MENU        ");
			System.out.println("==============================");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Apply Interest");
			System.out.println("5. Validate Accounts");
			System.out.println("6. Validate one Account");
			System.out.println("7. End Of Day Bank Report");
			System.out.println("8. Transaction Report");
			System.out.println("9. Exit");
			System.out.println("==============================");

			System.out.print("Enter choice: ");
			int choice = sc.nextInt();

			// -------- MENU CONTROL ----------
			if (choice == 1) {

				// CREATE ACCOUNT
				System.out.println("\nChoose Account Type:");
				System.out.println("1. Savings Account");
				System.out.println("2. Salary Account");
				System.out.println("3. Current Account");
				System.out.println("4. Loan Account");
				System.out.print("Enter type: ");
				int type = sc.nextInt();

				sc.nextLine(); // fix input

				System.out.print("Enter Account Number: ");
				String accNo = sc.nextLine();

				System.out.print("Enter Holder Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Initial Balance: ");
				double bal = sc.nextDouble();

				Account acc = null;

				if (type == 1) {
					acc = new SavingsAccount(accNo, name, bal);
				} else if (type == 2) {
					acc = new SalaryAccount(accNo, name, bal);
				} else if (type == 3) {
					System.out.print("Enter Overdraft Limit: ");
					double limit = sc.nextDouble();
					acc = new CurrentAccount(accNo, name, bal, limit);
				} else if (type == 4) {
					System.out.print("Enter Loan Amount: ");
					double loan = sc.nextDouble();
					acc = new LoanAccount(accNo, name, loan);
				} else {
					System.out.println("Invalid account type!");
					continue;
				}

				bank.addAccount(acc);
				System.out.println("Account created successfully!");

			} else if (choice == 2) {

				// DEPOSIT
				sc.nextLine();
				System.out.print("Enter Account Number: ");
				String accNo = sc.nextLine();

				System.out.print("Enter Deposit Amount: ");
				double amt = sc.nextDouble();

				bank.depositToAccount(accNo, amt);

			} else if (choice == 3) {

				// WITHDRAW
				sc.nextLine();
				System.out.print("Enter Account Number: ");
				String accNo = sc.nextLine();

				System.out.print("Enter Withdraw Amount: ");
				double amt = sc.nextDouble();

				bank.withdrawFromAccount(accNo, amt);

			} else if (choice == 4) {

				// APPLY INTEREST
				bank.applyInterestToAll();

			} else if (choice == 5) {

				sc.nextLine();
				System.out.print("Enter Account Number to Validate: ");
				String accNo = sc.nextLine();

				bank.validateOneAccount(accNo);

			} else if (choice == 6) {

				bank.validateAllAccounts();

			} else if (choice == 7) {

				// END OF DAY BANK REPORT
				bank.printEndOfDayReport();

			} else if (choice == 8) {

				// TRANSACTION REPORT
				bank.printTransactionReport();

			} else if (choice == 9) {

				running = false;
				System.out.println("Exiting Program...");

			} else {

				System.out.println("Invalid choice! Please try again.");

			}
		}

		sc.close();
	}
}

// ========================== MAIN END ===========================
