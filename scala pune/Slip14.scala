//5.Write a program to create two sets of strings and find common strings between them. Merge sets after removing common strings. Display resultant set.(create sets:10M find common elements:5M merge removing common :1

object Slip5 {
def main(args:Array[String]) {
var str1:Set[String]=Set("Hello","good","Morning");
var str2:Set[String]=Set("Hello","good","night");
var str3=str1.diff(str2);
println(str1);
println(str2);
println(str3);
var str4=str2.diff(str1);
println(str4);
str3++=str4;
println(str3)
}
}
