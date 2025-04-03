 abstract class BankAccount{
String accountNumber;
String holderName;
double balance;
public BankAccount(String accountNumber,String holderName,double balance){
this.accountNumber=accountNumber;
this.holderName=holderName;
this.balance=balance;
}
abstract double calculateInterest();
public void deposit(double amount)
{
if(amount>0){
balance+=amount;
System.out.println(amount+"deposited successfully");
} else{
	System.out.println("invalid deposit amount");
}}
public void withdraw(double amount){
	if(amount>0&&amount<=balance){
		balance-=amount;
		System.out.println(amount+"withdraw successfully");
	} else{
		System.out.println("insufficient balance or invalid");
}}
public void displayInfo(){
	System.out.println("accountNumber:"+accountNumber);
	System.out.println("holderName:"+holderName);
	System.out.println("balance:"+balance);
	System.out.println("Interest:"+calculateInterest());
}}
class SavingAccount extends BankAccount{
	
	 SavingAccount(String accountNumber,String holderName,double balance){
	 super(accountNumber,holderName,balance);
}
double calculateInterest(){
	return balance*0.04;
}}
class CurrentAccount extends BankAccount{
	
	CurrentAccount(String accountNumber,String holderName,double balance){
		super(accountNumber,holderName,balance);
	}
	double calculateInterest(){
		return balance*0.02;
}}
public class BankingSystem{
	public static void main(String[]args){
		SavingAccount SA=new SavingAccount("SA12345","ALICE",10000);
		CurrentAccount CA=new CurrentAccount("CA67890","Bob",50000);
		System.out.println("Saving Account Details:");
		SA.displayInfo();
		SA.deposit(2000);
		SA.withdraw(3000);
		System.out.println("-------");
		System.out.println("Current Account Details:");
		CA.displayInfo();
		CA.deposit(1000);
		CA.withdraw(5000);
}}

output:
Saving Account Details:
accountNumber:SA12345
holderName:ALICE
balance:10000.0
Interest:400.0
2000.0deposited successfully
3000.0withdraw successfully
-------
Current Account Details:
accountNumber:CA67890
holderName:Bob
balance:50000.0
Interest:1000.0
1000.0deposited successfully
5000.0withdraw successfully
		
