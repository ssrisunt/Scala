// Scala - Lists
/*
 * While Arrays are mutable but Lists are immutable in nature.
 * We can append the list at the beginning or the end  
 */
object Lists {
  val mylist: List[Int] = List(1,2,3,4,5);
  val names: List[String] = List("Smith", "Harry", "Peter"); 
  def main(args: Array[String]) {
    println(mylist);
    println(names);
    
    // Cons is used to prepend here
    println(0 :: 1 :: mylist);
    
    // Nil will give you empty list
    println(Nil);
    
    println(1 :: 3 :: 5 :: Nil);
    
    // Methods associated with the list
    
    // to get the first value
    println(mylist.head);
    
    // to get the remaining value after the head
    println(mylist.tail);
    
    // Checking whether list is empty or not
    println(names.isEmpty);
    
    // Reversing the order of the list
    println(mylist.reverse);
    
    // Creating a uniform list which contains only the same type of elements
    println(List.fill(5)(10));
    
    // To get max out of the list
    println(mylist.max);
    println(names.max);
    
    
    // Iterating over the list using foreach method
    mylist.foreach(println)
    // To find the sum
    var sum: Int = 0;
    mylist.foreach(sum += _);
    println(sum);
    
    // Iterating over the list using for loop
    for (name <- names) {
      println(name);
    }
    
    // Printing the value using index 
    println(names(0));
    

  }
}
