# Scala

CHAPTER 1. INTRODUCTION
***********************

The Scala Programming language:- 
*******************************

* "Scala is an acronym for SCA-lable LA-nguage" (SCALA).
* Scala is a  modern multi - paradigm programming language designed to express common programming patterns in a concise, elegant and 
type-safe way.
* Scala is written by Martin Odersky at EPFL.

Features:-
********

* Statically typed - Variable has a type and it can hold values only of that type. Hence, Type error is caught at compile time only,
not on run-time.
* Scala uses type interfacing, i.e. it figures out the type, So we don't have to mention it expicitly.
* Scala runs on JVM and it is fully inter-operable with Java.
* Object Oriented
* Functional 
* Dynamic features
* Scala blends object-oriented and functional programming in a statically typed language.
* As fast as Java programs, and has an edge for the shorter length of code.
* Write less and Achieve more.
* Scala has fewer errors like no null pointer exception issue in Scala.
* More flexible, Can write multiple classes in a single file.

Why Scala ?
*********

Scala is Practical.

* It can be used as a replacement for Java.
* Mixed Scala/Java projects.
* Can use already existing Java libraries.
* Can use existing Java tools (Ant, Maven, JUnit, etc.)
* Can use SBT which is used for writting Scala Application
* Decent IDE support (IntelliJ, Eclipse, NetBeans)


CHAPTER 2. SBT
**************

What is SBT ?

* sbt (Scala Build Tool, formerly Simple Build Tool) is an open source build tool for Scala and Java projects, similar to Java's 
Maven and Ant.
* SBT is a modern build tool. While it is written in Scala and provides many Scala conveneiences, it is a general purpose build tool.
* sbt is the de facto build tool in the Scala.

Why SBT ?

* Native support for compiling Scala code.
* Uses Apache Ivy for dependency management
* Only-update-on-request model
* Full Scala language support for creating tasks
* Support for mixed Java/Scala projects
* Launch REPL(Read-Eval-Print-Loop) in project context.

CHAPTER 3. SBT Installation
***************************

Step1:-Download the jdk and set the path of both jre and jdk and JAVA_HOME
Step2:-Download the sbt, and check whether the path is set or not.
Step3:-Run the below command in command prompt:-
> mkdir scala_samples
> cd scala_samples
> mkdir sbt_proj
> cd sbt_proj
> C:\Users\rajatpancholi1008\scala_samples\sbt_proj
> sbt
> exit 
(to come out of the shell)
* It will launch the sbt and will download all the required binaries for the scala project

CHAPTER 4. Data types and Variables
***********************************
Scala is not an interpreted language, it is compiled language. In REPL also, it will eventually convert it into the class and it will
show the result.

mkdir C:\Users\rajatpancholi1008\scala_samples\variables

cd C:\Users\rajatpancholi1008\scala_samples\variables

> sbt console

scala shell will get open

* Data types in scala:-

1. Boolean - true or false
2. Byte - 8 bit signed value
3. Short - 16 bit signed value
4. Char - 16 bit unsigned Unicode character
5. Int - 32 bit signed value
6. Long - 64 bit signed value
7. Float - 32 bit IEEE 754 single-precision float
8. Double - 64 bit IEEE 754 double-precision float
9. String - A sequence of characters

Some Advanced Data Types:-

1. Unit - Corresponds to no value
2. Null - null or empty reference
3. Nothing - subtype of every other type; includes no
4. Any - The supertype of any type; any object is of
5. AnyRef - The supertype of any reference type


* Declaring variables in scala:-

1. var -> it is mutable i.e. we can change the value declared later but not the data type.
2. val -> it is immutable, we can not modify the values once assigned.

scala> var a : Int = 12
a: Int = 12

var - it is a keyword
a - it is a variable name
: - it is separator
Int - it is the datatype
12 - it is the value


scala> a+30
res0: Int = 42

scala> a+258
res1: Int = 270


scala> val b : Int = 60
b: Int = 60

scala> a = 35
a: Int = 35

scala> b = 25
<console>:12: error: reassignment to val
       b = 25

Note:- value a got changed as it was var but b not changed as it was val.

