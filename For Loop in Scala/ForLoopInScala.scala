# ctrl+shift+f -> to format the code in Eclipse IDE
object ForLoopInScala {
  def main(args: Array[String]) {
    //Start of for loop as statement
    // to includes the last value also
    for (i <- 1 to 5) {
      println("The value of i using to is : " + i);
    }
    //Alternate way to write for to
    for (i <- 1.to(5)) {
      println("The value of i using to is : " + i);
    }

    // Until excludes the last value

    for (i <- 1 until 6) {
      println("The value of i using until is : " + i);
    }
    //Alternate way to write for until
    for (i <- 1.until(6)) {
      println("The value of i using until is : " + i);
    }

    //Multiple ranges inside the for loop
    for (i <- 1 to 5; j <- 1 to 3) {
      println("The value of i and j using until is : " + i + " and " + j);
    }

    // For loop to iterate over the list
    val lst = List(10, 20, 30, 45, 65, 78, 65);

    for (i <- lst) {
      println("The value of i using list is : " + i);
    }
    // For filtering out the output
    for (i <- lst; if i > 30) {
      println("The value of i using filter is : " + i);
    }
    //End of for loop as statement
    
    
    //Start of for loop as an expression, Use Curly braces and keyword yield
    val res = for {i <- lst; if i > 30} yield {
      i * i 
    }
    println("The result using single line exp is : " + res);

    // Or below will also work, removing ; and writing all statement in new line
    val res1 = for {
      i <- lst
      if i > 30
      } yield {
      i * i 
    }
    println("The result using multi line exp is : " + res1);
    //End of for loop as an expression
  }
}
