class SavingsAccount
{
static double annualInterestRate=.04;
private double savingsBalance;
public SavingsAccount(double balance)
{
savingsBalance = balance;
}
public double calculateMonthlyInterest()
{
return (savingsBalance*annualInterestRate)/12;
}
public static void modifyInterestRate(double rate)
{
annualInterestRate = rate;
}
public static double getannualInterestRate()
{
return annualInterestRate;
}public double getsavingsBalance()
{
return savingsBalance;
}
}
public class SavingTest
{
public static void main(String args[])
{
SavingsAccount saver1 = new SavingsAccount(200.0);
SavingsAccount saver2 = new SavingsAccount(300.0);
System.out.printf("Balance for Saver1 = %.2f\nBalance (with interest) for
Saver1 =%.2f\nInterest Rate = %.2f percent\n\n", saver1.getsavingsBalance(),
saver1.
getsavingsBalance()+saver1.calculateMonthlyInterest(),SavingsAccount.getannu
alInterestRate()*100);
System.out.printf("Balance for Saver2 = %.2f\nBalance (with interest) for
Saver2
=
%.2f\nInterest
Rate
=
%.2f
percent\n\n",saver2.getsavingsBalance(),saver2.getsavingsBalance()+saver2.cal
culateMonthlyInterest(),SavingsAccount.getannualInterestRate()*100);
System.out.println("-----------------------------------");
System.out.println("Balance details on the second year");
System.out.println();SavingsAccount.modifyInterestRate(.05);
System.out.printf("Balance for Saver1 = %.2f\nBalance (with interest) for
Saver1 =%.2f\nInterest Rate = %.2f percent\n\n", saver1.getsavingsBalance(),
saver1.
getsavingsBalance()+saver1.calculateMonthlyInterest(),SavingsAccount.getannu
alInterestRate()*100);
System.out.printf("Balance for Saver2 = %.2f\nBalance (with interest) for
Saver2
=
%.2f\nInterest
Rate
=
%.2f
percent\n\n",saver2.getsavingsBalance(),saver2.getsavingsBalance()+saver2.cal
culateMonthlyInterest(),SavingsAccount.getannualInterestRate()*100);
}
}
