1. Write a program to create a MAP with empname and deptname. Print details of all employees working in the same department, as “Mr. Joshi”.


class Employee(var ename:String,var dept:String)
{
def display()
{
println("---------------------------");
println("Name:"+ename);
println("Department Name:"+dept)
}
}
object Slip1
{
def main(args:Array[String])
{
val e1=new Employee("Vishnu","finance");
val e2=new Employee("Sumit","finance");
val e3= new Employee("Paresh","Marketing");
val e4 =new Employee("Tushar","Marketing");
var e5=new Employee("Akshay","Marketing");
var m1:Map[Int,Employee]=Map(1->e1,2->e2,3->e3,4->e4,5->e5);
for((k,v)<-m1)
{
if(v.dept.equalsIgnoreCase("marketing"))
v.display()
}
}
}
