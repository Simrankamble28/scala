//SLIP NO 11
//Design an abstract class Employee with computeSal() as an abstract function. Create two subclasses Worker and Manager. Salary of worker should be calculated on hourly basis of work and Salary of Manager should be calculated on monthly basis with additional incentives. Create five objects each of Worker and Manager class, and display their details//


abstract class Employee
{
def computeSalary():Int;
}
class manager(var mno:Int,var mname:String,var month:Int) extends Employee
{
def computeSalary():Int=
{
var salary=month*30000;
return salary;
}
def display()
{
println("---------------------------------------------------------------------");
println("Manager No:"+mno);
println("Manager Name:"+mname);
println("Salary:"+computeSalary());
}
}
class worker(var wno:Int,var wname:String,var hr:Int) extends Employee
{
def computeSalary():Int=
{
var salary=hr*300;
return salary;
}
def display()
{
println("-------------------------------------------------------------------------");
println("Worker No:"+wno);
println("Worker Name:"+wname);
println("Salary:"+computeSalary());
}
}
object slip11
{
def main(args:Array[String])
{
var manager1=new manager(1,"Akshay Borse",4);
var manager2=new manager(2,"Sumit Amritkar",3);
var manager3=new manager(3," Vishnu Khatale",2);
var manager4=new manager(4,"Roshan Adke",5);
var manager5=new manager(5,"Tushar Amrutkar",9);
var worker1=new worker(1,"Ganesh Darade",12);
var worker2=new worker(2,"Viraj Gadekar",16);
var worker3=new worker(3," Abhi Chavhan",10);
var worker4=new worker(4,"Kalpesh Deshmukh",5);
var worker5=new worker(5,"Abhijit Rakibe",4);
println("-----------------------MANAGER------------------------");
manager1.display();
manager2.display();
manager3.display();
manager4.display();
manager5.display();
println("-----------------------WORKER-------------------");
worker1.display();
worker2.display();
worker3.display();
worker4.display();
worker5.display();
}
}


Output-

-----------------------MANAGER------------------------
---------------------------------------------------------------------
Manager No:1
Manager Name:Akshay Borse
Salary:120000
---------------------------------------------------------------------
Manager No:2
Manager Name:Sumit Amritkar
Salary:90000
---------------------------------------------------------------------
Manager No:3
Manager Name: Vishnu Khatale
Salary:60000
---------------------------------------------------------------------
Manager No:4
Manager Name:Roshan Adke
Salary:150000
---------------------------------------------------------------------
Manager No:5
Manager Name:Tushar Amrutkar
Salary:270000
-----------------------WORKER-------------------
-------------------------------------------------------------------------
Worker No:1
Worker Name:Ganesh Darade
Salary:3600
-------------------------------------------------------------------------
Worker No:2
Worker Name:Viraj Gadekar
Salary:4800
-------------------------------------------------------------------------
Worker No:3
Worker Name: Abhi Chavhan
Salary:3000
-------------------------------------------------------------------------
Worker No:4
Worker Name:Kalpesh Deshmukh
Salary:1500
-------------------------------------------------------------------------
Worker No:5
Worker Name:Abhijit Rakibe
Salary:1200
