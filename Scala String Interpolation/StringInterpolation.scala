

object StringInterpolation {
  def main(args: Array[String])
  {
    val name = "Smith"
    val age = 28
    val age_decimal = 29.5
    
    // There are different ways of string interpolation
    
    // 1. By concatenation 
    println(name + " is " + age + " years old")
    
    println(name + " is " + age_decimal + " years old")
    
    // 2. s string interpolation, It is not type safe like here we are using both string and int 
    println(s"$name is $age years old")
    
    println(s"$name is $age_decimal years old")
    
    // 3. f string interpolation, It is type safe, For constructing string in a type safe manner, we use this.
    // Need to specify the type using %s for string, %d for int and %f for double/float after the $variable_name for its type.
    println(f"$name%s is $age%d years old")
    
    println(f"$name%s is $age_decimal%f years old")
    
    // 4. Raw interpolation directly prints the whole string ignoring the special meaning of the characters.
    println(s"Hello \nWorld") // String Interpolation
    
    println(raw"Hello \nWorld") // Raw Interpolation
  }
}
