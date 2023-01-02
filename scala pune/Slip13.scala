//Write user defined functions to reverse the case of a given string and call the function using MAP.

object Slip13
{
def reverse(ch:Char):Char=
{
if(ch.isLower)
ch.toUpper;
else
ch.toLower;
}
def main(args:Array[String])
{
var str=" ";
println("Enter String:");
str=scala.io.StdIn.readLine();
var str2=str.map(reverse);
println(str2);
}
}
