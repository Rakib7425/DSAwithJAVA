// your class code goes here
class VipCustomer{
    public String name;
    public double creditLimit;
    public String email;

    public VipCustomer(){
        this("XYZ",10.0,"xyz@abc.com");
    }

    public VipCustomer(String name,double creditLimit){
        this(name,creditLimit,"xyz@abc.com");
    }

    public VipCustomer(String name,double creditLimit, String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }

    public String getName(){
        return this.name;
    }

    public double getCreditLimit(){
        return this.creditLimit;
    }
    public String getEmail(){
        return this.email;
    }
    
}
/*
 * package OOPS;

class VipCustomer{
    String name;
    double creditLimit;
    String email;

    VipCustomer(){
        this("XYZ",10.0,"xyz@abc. com");
    }

    VipCustomer(String name,double creditLimit){
        this(name,creditLimit,"xyz@abc. com");
    }

    VipCustomer(String name,double creditLimit, String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }

    public String getName(){
        return this.name;
    }

    public double getCreditLimit(){
        return this.creditLimit;
    }
    public String getEmail(){
        return this.email;
    }

    public static void main(String[] args) {
        VipCustomer obj1=new VipCustomer();
        VipCustomer obj2=new VipCustomer("Soumya",200000.0);
        VipCustomer obj3=new VipCustomer("Rakibul",250000.0);
        System.out.println(obj1.getEmail());
        System.out.println(obj2.getName());
        System.out.println(obj3.getCreditLimit());

    }
}
 */

/*
 * Vip Customer
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Create a new class VipCustomer
 * it should have 3 fields name, creditLimit(double), and email address, there
 * default value is as {name:"XYZ", creditLimit:"10", email:"xyz@abc. com"}
 * respectively means ordering of parameter should be same.
 * E.g constructor(name,creditLimit,email);
 * 
 * create 3 constructors
 * 1st constructor empty should call the constructor with 3 parameters with
 * default values
 * 2nd constructor should pass on the 2 values it receives as name and
 * creditLimit respectively and, add a default value for the 3rd
 * 3rd constructor should save all fields.
 * create getters only for this name getName, getCreditLimit and getEmail and
 * confirm it works.
 * 
 * Note: each methods and variables should of public type
 * Input
 * You don't have to take any input, You only have to write class VipCustomer.
 * Output
 * Output will be printed by tester, "Correct" if your code is perfectly fine
 * otherwise "Wrong".
 * Example
 * Sample Input:
 * class VipCustomer{
 * // if your code works fine for the tester
 * }
 * 
 * Sample Output:
 * Correct
 */