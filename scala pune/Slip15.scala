// Define a class SavingAccount (accNo, name, balance, minBalance).Define appropriate constructors and operations withdraw(), deposit(),viewBalance(). Create an array of SavingAccount.objects and perform operations and display them.

class SavingAccount(var acno:Int,var name:String,var balance:Int,var
minbalance:Int)
{
def withdraw()
{
println("Enter Amount:");
var n1=scala.io.StdIn.readInt();
balance=balance-n1;
if(balance<minbalance)
{
println("TRANSACTION FAILED:");
balance=balance+n1;
}
else
println("TRANSACTION SUCCESSFULL");
}
def deposite()
{
println("Enter Amount:");
var n1=scala.io.StdIn.readInt();
balance=balance+n1;
}
def viewbalance()
{
println("Account Number:"+acno);
println("Name:"+name);
println("Balance:"+balance);
println("Minimum Balance:"+minbalance);
}
}
object Slip15
{
def main(args:Array[String])
{
val s1=new Array[SavingAccount](5)
var ch=0;
s1(0)=new SavingAccount(1,"Akshay Borse",20000,10000);
s1(1)=new SavingAccount(2,"Sumit Amritkar",30000,15000);
s1(2)=new SavingAccount(3,"Vishnu Khatale",40000,6000);
s1(3)=new SavingAccount(4,"Ganesh Darade",50000,3000);
s1(4)=new SavingAccount(5,"Tushar Amrutkar",55000,10000);
println("Enter Account Number:");
var ac=scala.io.StdIn.readInt();
for(i<-0 to 4)
{
if(s1(i).acno==ac)
{
println("Account number Exsists");
println("1.Cash Withdraw:");
println("2.Cash Deposite:");
println("3.View Balance:");
println("4.Exit");
while(ch!=5)
{
println("Enter Your Choice:");
var
ch=scala.io.StdIn.readInt();
ch match
{
case
1=>s1(i).withdraw();
case
2=>s1(i).deposite();
case
3=>s1(i).viewbalance();
case
4=>System.exit(1);
}
}
}
}
println()
}
}
