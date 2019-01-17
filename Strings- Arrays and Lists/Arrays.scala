// Scala - Arrays
/*
 * Array is a data structure which can store fixed size sequential elements of same data-type.
 *
 */
import Array._

object Arrays {
  val myarray: Array[Int] = new Array[Int](4);
  val myarray2 = new Array[Int](5);
  val myarray3 = new Array[String](5);
  val myarray4 = new Array[Boolean](5);
  val myarray5 = new Array[Double](5);

  val myarray6 = Array(1, 2, 3, 4, 5);

  def main(args: Array[String]) {
    myarray(0) = 10;
    myarray(1) = 20;
    myarray(2) = 30;
    myarray(3) = 40;
    // It will not print correctly
    println(myarray);

    // It will print in the desired format
    for (x <- myarray) {
      println(x);
    }

    // Another way to print the array
    for (i <- 0 to (myarray.length - 1)) {
      println(myarray(i));
    }

    // If we do not assign any value to array it will take the default value

    for (x <- myarray2) {
      println(x);
    }

    for (x <- myarray3) {
      println(x);
    }

    for (x <- myarray4) {
      println(x);
    }

    for (x <- myarray5) {
      println(x);
    }

    // Checking the length of the array
    println(myarray6.length)

    val result = concat(myarray, myarray6);
    for (x <- result) {
      println(x);
    }
  }
}
