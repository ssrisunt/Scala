object ScalaFunctions {
  // Syntax of writing a function
 // def FunctionName(Argument1 : Datatype1, Argument2 : Datatype2) : Datatype of returned value = {
    //}
  
  // Declaring function in different ways
  
  // 1. Mentioning the returned datatype, return keyword
  def add(x : Int, y : Int) : Int = {
    return x + y;
  }
  
  // 2. Avoid writing keyword return as whatever will be the last line, it will be considered the return value 
  def subtract(x : Int, y : Int) : Int = {
    return x - y;
  }
  
  // 3. If we have a function which is very short then we can write it in one line avoiding the curly braces
  def multiply(x : Int, y : Int) : Int = x * y;
  
  // 4. If the returned data type is certain then we can avoid that too
  def divide(x : Int, y : Int) = x / y;
  
  
  // Creating a object and defining a function inside the object
  object Math {
    def add(x : Int, y : Int) : Int = {
    return x + y;
  }
    def square(x : Int) = x * x; // It is taking only one argument
  }
  
  def main(args: Array[String]) {
    println(add(20,30));
    println(subtract(20,30));
    println(multiply(20,30));
    println(divide(20,30));
    // for accessing the function inside the object, using object.functionName
    // No need to create a new instance as it is object, for class we will require it
    println(Math.add(20,30)); 
    
    // We can print either using below
    println(Math.square(20));
    // Or using below, function which takes only one argument, it can work as below
    println(Math square 30); // Similar to as we use for loop like 1 to 10 or 1 until 10

  }
}
