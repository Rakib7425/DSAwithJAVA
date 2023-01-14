// your code goes here
class BankAccount {
    public int balance;// 300
    public String name;

    BankAccount(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public void depositFund(int fund) {
        balance = balance + fund;
    }

    public boolean withdrawFund(int fund) { // !350
        if (fund <= balance) {
            balance = balance - fund;
            return true;
        }
        return false;
    }
}


/*
 * Bank Account
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Create a new class for a bank account (BankAccount)
 * Create fields for the balance(balance), customer name(name).
 * Create constructor with two parameter as balance and name
 * Create two additional methods
 * 1. To allow the customer to deposit funds named depositFund() with one
 * parameter as fund to be added (this should increment the balance field).
 * 2. To allow the customer to withdraw funds named withdrawFund() with one
 * parameter as fund to be withdrawn from account and should return boolean as
 * if withdraw went successful else false. This should deduct from the balance
 * field, but not allow
 * the withdrawal to complete if their are insufficient funds.
 * Note: Each methods and variable should be public
 * Input
 * You don't have to take any input, You only have to write class BankAccount.
 * Output
 * Output will be printed by tester, "Correct" if your code is perfectly fine
 * otherwise "Wrong".
 * Example
 * Sample Input:
 * class BankAccount{
 * // if your code works fine for the testert
 * }
 * 
 * Sample Output:
 * Correct
 */