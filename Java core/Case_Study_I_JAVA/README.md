# 🏦 Java Banking Automation CASE-Study I 
*A complete console-based banking simulation using OOP concepts, inheritance, polymorphism, abstract classes, and arrays.*

---

## 📌 Overview  
This project is a simple yet fully functional **Banking System in Java** designed as an academic case study.  
It demonstrates the use of:

- Abstract classes  
- Method overriding  
- Polymorphism  
- Inheritance  
- Arrays  
- Validation logic  
- Simple console-based UI  
- Transaction tracking  
- End-of-day reporting  

The system manages different types of bank accounts, performs deposits/withdrawals, applies interest, validates account rules, and maintains a full transaction history.

---

## 🧱 Features  

### ✔ **Account Types**
The system supports four account types:

1. **Savings Account**  
   - Minimum balance: ₹10,000  
   - 4% interest  

2. **Salary Account**  
   - Must have activity at least once every 2 months  
   - Automatically freezes if inactive  
   - 3% interest  

3. **Current Account**  
   - Supports overdraft  
   - No interest  
   - Validates overdraft limits  

4. **Loan Account**  
   - Starts with a negative balance (loan amount)  
   - Interest increases the loan  
   - Loan payments reduce negative balance  

---

## 🧾 **Transaction System**
For every deposit or withdrawal, a transaction record is created:

- Transaction ID  
- Account Number  
- Amount  
- Type (Deposit / Withdraw)

Two reports are available:
- **Transaction Report** – shows all transactions  
- **End-of-Day Bank Report** – shows account status + totals  

---

## 🧪 **Validation System**

Two validation modes:

### ✔ Validate ONE specific account  
### ✔ Validate ALL accounts  

Validation rules vary per account type:
- Savings → minimum balance  
- Salary → inactivity freeze  
- Current → overdraft check  
- Loan → loan paid status  

---

## 🗂️ **Classes Used**

### **1️⃣ Account (Abstract)**
Base class containing:
- Account number  
- Holder name  
- Balance  
- deposit()  
- withdraw()  
- calculateInterest()  
- validate() → overridden in subclasses  
- toString()  

### **2️⃣ SavingsAccount**  
### **3️⃣ SalaryAccount**  
### **4️⃣ CurrentAccount**  
### **5️⃣ LoanAccount**  

Each overrides:
- calculateInterest()  
- validate()  

### **6️⃣ Transaction**  
Stores transaction details.

### **7️⃣ Bank**  
Handles:
- Account storage  
- Transactions  
- Deposits / Withdrawals  
- Reports  
- Validation  
- Array resizing  

### **8️⃣ Main (BankApplication)**  
Simple console menu 

---
