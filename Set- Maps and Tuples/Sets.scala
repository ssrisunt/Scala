// Scala - Sets
/*
 * It is a collection of different elements of same data-type, Set can not have duplicate
 * values inside them, all must be unique. In the list we can have the duplicates.
 * 
 * Sets can be of 2 kinds - Mutable sets and Immutable sets.
 * Difference is that the Object itself inside the immutable sets can not be changed
 * 
 * Sets in scala are not ordered
 */
object Sets {
  // Set operation will remove the duplicates even if it is present
  // The below set is immutable
  val myImmutableSet: Set[Int] = Set(1,2,3,4,5,5,4);
  val names: Set[String] = Set("Tom", "Jerry", "Smith", "Tom");
  
  // Concatenate two sets
  val set1: Set[Int] = Set(1,2,3,4,5,5,4);
  val set2: Set[Int] = Set(6,7,8,6,7,5,9);

  // By default all the sets are immutable
  
  // For mutable set we need to define like below
  var myMutableSet: scala.collection.mutable.Set[Int] = scala.collection.mutable.Set(1,2,3,4,5,5,4);
  
  // Or We can also give like below
  var myMutableSet1 = scala.collection.mutable.Set(1,2,3,4,5,5,4,3);
  
  def main(args: Array[String]) {
    
    // The output of the sets in scala are not ordered that means we can not index sets
    println(myImmutableSet + 10);
    println(myImmutableSet);
    // It checks whether the value 2 is present in the set or not and returns boolean
    println(myImmutableSet(2));
    
    
    //Different methods applied on sets
    println(myImmutableSet.head); // It will give first element
    println(myImmutableSet.tail); // It will give all elements except first element
    println(myImmutableSet.isEmpty); // It will return boolean value
    
    // Concatenating two sets - two ways, only unique values from both the sets will be displayed
    println(set1 ++ set2);
    println(set1.++(set2));
    
    // Intersection of both the sets - two ways, only common records from both the sets
    println(set1.&(set2));
    println(set1.intersect(set2));
    
    println(myImmutableSet.max);
    println(myImmutableSet.min);
    
    // Set with for loop
    set1.foreach(println);
    
    // Another way of using for loop
    for (name <- names) {
      println(name);
    }
    
    println(names);
    println(myMutableSet);
    println(myMutableSet1);
  }
}
