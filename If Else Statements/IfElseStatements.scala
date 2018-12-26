object IfElseStatements {
  def main(arga: Array[String]) {
    val x = 100;
    val y = 200;
    val z = 300;
    var res = "";
    // Start of if else statement
    
    // Used and Operator &&
    if (x == 100 && y ==200) {
      //println("x == 100");
      res = "x == 100 and y == 200";
    } else {
      //println("x != 100");
      res = "x != 100";
    }

    println(res);

    // End of if else statement

    // *********************************************

    // Start of if else expression
    
    // Used or operator ||
    val res2 = if (x == 100 || z == 300) "x == 100 or z == 300" else "x != 100";
    println(res2);
    println(if (x == 100) "x == 100" else "x != 100");

    // End of if else expression
  }

}
