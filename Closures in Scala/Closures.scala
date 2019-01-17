// Scala - Closures
/*
 * A closure is a function which uses one or more variables declared outside the function.
 * There are two types of closures:-
 * 1. Impure closure:- When the data-type of the variable is var, that means it can be changed from outside or inside the closure.
 * 2. Pure closure:- When the data-type of the variable is val, the value can not be changed, the result of the closure will 
 * 									 always be same whenever we pass the same value.
 */
object Closures {
  
  // Variable number is also termed as free variable as the function does not know the value of the variable number
  var number = 10;
  
  // It is closure as number variable is declared outside the function.
  val add = (x: Int) => x + number;
  
  var number1 = 50;
  val add1 = (x: Int) => {
    number1 = x + number1;
    number1;
  }
  
  def main(args: Array[String]) {
    
    // Changing the value of the number variable inside the main function will also change its value
    number = 100;
    
    // Closure takes the last valid state of the variable which is declared outside the closure.
    println(add(20));
    
    //number1 = 500;
    
    // This closure call will change the value of the variable number1, the changes made inside the closure are passed back to the 
    // variable
    println(add1(200));
    println(number1);
  }
}
