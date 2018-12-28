

object AnonymousDefaultFunction {
  // Default Value Function
  object Math {
    def add (x: Int = 5, y:Int = 15) : Int = {
      return x+y;
    }
    def square (x: Int) = x*x;
  }
  
  def main(args: Array[String]) {
    
    println(Math.add(10,20));
    
    //Not passing any value, it will take the default value
    println(Math.add());
    
    //Passing only one parameter value, it will replace by the first default value 
    println(Math.add(7));
    
    println(Math square 5);
  }
}
