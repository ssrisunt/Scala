object WhileDoWhileLoop {
  def main(args: Array[String]) {
    var x = 0;
    
    //While Loop
    while (x < 10) {
      println("The value of x is : " + x );
      x+=1; // x=x+1, Here x++ does not work in Scala
    }
     
    // Do-while Loop
    
    var y = 0;
    do {
      println("The value of y is : " + y);
      y+=1;
    } while (y < 10);
  }
  
}
