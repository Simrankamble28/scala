write a program to calculate sum of prime number from 1to 100


->import scala.io.stdIn._
import scala.util.control._
object prime
{
def main(args:Array[String])
{
var n=4
var sum=0
var loop=new Breaks;
while(n<=100)
{
var i=2
var f=0
while(i<n)
{
loop.breakable{
if(n%i==0)
{
f=1;
loop.break;
}
}
i+=1
}
if(f==0)
sum=sum+n
n+=1
}
println("sum of 1 to 100 is"+sum)
}
}


Output:


sum of 1 to 100 is 1055

