
class Account {
    /*
      Write the remaining part of the class
    */
    constructor(accountName, balance) {
        this.accountName = accountName;
        this.balance = balance;
        Account.totalAccounts++; // Increment the totalAccounts static variable
        Account.totalBalance += balance; // Add the balance to the totalBalance static variable
    }

    static totalAccounts = 0; // Static variable to keep track of the total number of accounts
    static totalBalance = 0; // Static variable to keep track of the total balance of all accounts

    static returnTotalAccounts() {
        return Account.totalAccounts; // Return the total number of accounts
    }

    static returnTotalBalance() {
        return Account.totalBalance; // Return the total balance of all accounts
    }
}

// let user1 = new Account("newton1102", 1000);
// let user2 = new Account("newton2231", 2000);
// let user3 = new Account("newton1212", 500);

// let totalAccounts = Account.returnTotalAccounts();
// let totalBalance = Account.returnTotalBalance();

// console.log(totalAccounts); // 3
// console.log(totalBalance); // 3500

/**
 * 
 * JS Static Methods
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Complete the given JS Class and also its static methods. Static member can be accessed before any objects of its class are created, and without reference to any object
The static methods works as follows
returnTotalAccounts : return the total number of accounts created using this class
returnTotalBalance : returns the total balance of all accounts created using this class


Note: Input and Output are handled by the judge
Input
The class Account constructor takes 2 arguments
accountName(string), balance(number)


Both the static methods returnTotalAccounts and returnTotalBalance doesn't take any arguments
Output
The method returnTotalAccounts returns totalAccounts(Number)
The method returnTotalBalance returns totalBalance(Number)
Example
let user1 = new Account("newton1102", 1000)
let user2 = new Account("newton2231", 2000)
let user3 = new Account("newton1212", 500)

let totalAccounts = account.returnTotalAccounts()
let totalBal = account.returnTotalBalance()

console.log(totalAccounts)
cosole.log(totalBal)
//3
//3500

 */