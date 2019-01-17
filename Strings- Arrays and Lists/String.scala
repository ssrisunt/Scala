// Scala - String
/*
 * These are the sequence of characters 
 * 
 * String formatting can be done by 2 ways:- printf and format method
 */

object String {
  val num1 = 75;
  val num2 = 100.25;
  val str1 : String = "Hello World";
  val str2 : String = " this is Scala";
  
  def main(args: Array[String]) {
    println(str1.length());
    println(str1.concat(str2));
    println(str1 + str2);
    
    // printf method, as it returns unit, it is better to use it directly instead of putting it in variable and then printing it
    val result = printf("(%d - %f - %s)", num1, num2, str1);
    println(result);
    
    // Using it directly, preferred way then the above
    printf("(%d - %f - %s)", num1, num2, str1);
    
    // format method
    println("(%d - %f - %s)".format(num1, num2, str1));
  }
  
}
