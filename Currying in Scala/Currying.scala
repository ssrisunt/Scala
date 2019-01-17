// Scala - Currying
/*
 * Currying is the technique or the process of transforming a function that takes multiple arguments into a function 
 * that takes a single argument.
 */

object Currying {
  
  // Here the function takes two arguments
  def add(x: Int, y:Int) = x + y
  
  // Currying example
  def add2(x: Int) = (y: Int) => x + y;
  
  // Scala currying representation
  def add3 (x: Int) (y: Int) = x + y; 
  
  def main(args: Array[String]) {
    println(add(10,20));
    
    println(add2(100)(200));
    // Using partially applied function concepts here, it will work perfectly fine here
    val sum50 = add2(50);
    println(sum50(100));
    
    // Using partially applied function in scala currying representation, will have to add underscore("_") for the extra parameters
    val sum100 = add3(100)_;
    println(sum100(200));
  }
}
