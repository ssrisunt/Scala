import java.util.Date
object PartiallyAppliedFunctions {
  
  //Defining a log function outside the main method
  def log(date: Date, message: String) {
      println(date + "         " + message);
    }
  
  
  def main (args: Array[String]) {

    //This is fully applied function
    val sum = (a: Int, b: Int, c: Int) => a+b+c
    println("Fully Applied sum is - " + sum(1,2,3));
    
    /*
     *For partially applied function, we don't give all the parameter value once, we define some wildcard for that value
     *and assign it when we are calling the function
     */
    val f = sum(10, 20, _ : Int)
    
    //passing only the third value and calling only f function which will call sum function with all the three values
    println("Partially Applied sum is - " + f(30))
    
    // Applying one argument and passing two arguments as a wildcard
    val f2 = sum(100, _ : Int, _ : Int)
    
    println("Sum for two partially applied is - " + f2(200,300))
    
    
    //Now creating a partial function out of the log function
    
    val date = new Date;
    
    /*
     * Here we have variable newLog which is new function, we are applying log function here and applying one argument date and
     * secong argument is the wildcard here
     */
    
    val newLog = log(date, _ : String);
    
    //Calling newLog and giving the message here 
    newLog("Message 1");
    newLog("Message 2");
    newLog("Message 3");
    newLog("Message 4");
    newLog("Message 5");
    
  }
}
