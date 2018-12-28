object MatchExpressions {
  def main(args: Array[String]) {
    val age = 30;
    // Statement
    age match {
      case 10 => println(age);
      case 15 => println(age);
      case 20 => println(age);
      case 25 => println(age);
      case 30 => println(age);
      
      case _ => println("Default"); //Default case
    }
    
    // Expression
    val result = age match {
      case 10 => age;
      case 15 => age;
      case 20 => age;
      case 25 => age;
      case 30 => age;
      
      case _ => "Default"; //Default case
    }
    println("result = " + result);
    
    //Evaluating multiple cases and printing the same result
    val i = 5;
    i match {
      case 1 | 3 | 5 | 7 | 9 => println("odd");
      case 2 | 4 | 6 | 8 | 10 => println("even");
    }
  }
}
