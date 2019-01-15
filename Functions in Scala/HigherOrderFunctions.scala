/*
 *Higher order functions are those functions which are able to take functions as argument
 *and are able to return functions as a result.
 */
object HigherOrderFunctions {

  /*
   *Declaring a function which does some arithmetic operation, we have taken here 3 arguments, first two are just some value
   *and third argument decides that which arithmetic operator we have to apply
   */

  // this is for two arguments and a function argument
  def math(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y);

  // this is for three arguments and a function argument
  def math3(x: Double, y: Double, z: Double, f: (Double, Double) => Double): Double = f(f(x, y), z);

  def main(args: Array[String]) {
    val add_result = math(50, 20, (x, y) => x + y);
    println("Addition is : " + add_result);

    val multi_result = math(50, 20, (x, y) => x * y);
    println("Multiplication is : " + multi_result);

    val min_result = math(50, 20, (x, y) => x min y);
    println("Minimum is : " + min_result);

    val max_result = math(50, 20, (x, y) => x max y);
    println("Maximum is : " + max_result);

    //Doing with 3 arguments and a function argument
    val add3_result = math3(50, 20, 30, (x, y) => x + y);
    println("Addition is : " + add3_result);

    val multi3_result = math3(50, 20, 30, (x, y) => x * y);
    println("Multiplication is : " + multi3_result);

    val min3_result = math3(50, 20, 30, (x, y) => x min y);
    println("Minimum is : " + min3_result);

    val max3_result = math3(50, 20, 30, (x, y) => x max y);
    println("Maximum is : " + max3_result);

    // In scala, we can write (x,y)=>x+y) this in more easy way, i.e. wildcard "_"(underscore) like _+_
    val result = math(50, 20, _ + _);
    println("Addition is : " + result);

    val result3 = math3(50, 20, 30, _ + _);
    println("Addition is : " + result3);

    val max_result3 = math3(50, 20, 30, _ max _);
    println("Max is : " + max_result3);
  }

}
