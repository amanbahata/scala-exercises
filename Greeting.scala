/*
*	Exercise of parametrized arrays with types
**/

val greeting = new Array[String](3)
greeting(0) = "Hello"
greeting(1) = ", "
greeting(2) = "World!!"

for( greet <- greeting) {
	print(greet)
}