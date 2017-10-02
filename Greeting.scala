/*
*	Exercise of parametrized arrays with types
**/

val greeting = new Array[String](3)
greeting(0) = "Hello"
greeting(1) = ", "
greeting(2) = "World!!\n"

for( greet <- greeting) {
	print(greet)
}
//===================================================

val numNames = Array("zero","one","two")

val numNames2 = Array.apply("three","four","five")

println(numNames(1))
println(numNames2(1))


/*
* Exercise using lists
**/

val oneTwoThree = List(1,2,3)

//List concatination
val oneTwo = List(1,2)
val threeFour = List(3,4)
val oneTwoThreeFour = oneTwo ::: threeFour

println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus,  " + oneTwoThreeFour + " is a new list.")