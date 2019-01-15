object AnonymousDefaultFunction {
  // Default Value Function
  object Math {
    def add(x: Int = 5, y: Int = 15): Int = {
      return x + y;
    }
    def square(x: Int) = x * x;
    
    // We can also use operator syntax for function declaration which is not function overloading but scala allows it to do
    def +(x: Int = 5, y: Int = 15): Int = {
      return x + y;
    } 
    def **(x: Int) = x * x;  
    
  }
  
  /*
   * Declaring a function which does not return, In cases where function does not return anything we use the keyword Unit,
   * It is equivalent to void in some other language.
   */
  def print(x: Int, y: Int): Unit = {
    println(x+y);
  }

  def main(args: Array[String]) {

    println(Math.add(10, 20));

    //Not passing any value, it will take the default value
    println(Math.add());

    /* Passing only one parameter value, it will replace by the first default value.
    * There is no way to directly give the second value of the parameter.
    * Will have to give like (10,20) all the values
    */
    println(Math.add(7));
    println(Math.add(10, 20));

    //Can directly give the argument without parentheses if only one argument is there in the function
    println(Math square 5);
    
    println(Math.square(5));
    
    //Using Operator as a function name
    
    println(Math.+(10, 20));
    println(Math.**(10));
    println(Math ** 100);
    
    print(10,20)
    
    
    
    /*
     *In Scala, Functions are treated as first class citizens, that means we can assign a function to a variable and this we can
     *do using Anonymous Function. 
     * 
    */ 
    
    // add is a variable here
    var add = (x : Int, y : Int) => x + y;
    println(add(10,2));
    
  }
}
