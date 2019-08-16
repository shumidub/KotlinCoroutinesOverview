import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
runBlocking {
//sampleStart
suspend fun longComputation() : Int{
  delay(2000L)
  return 42
}   
  
println("Start")
GlobalScope.launch(Dispatchers.Default) {
  println("Launch coroutine")
  val result = longComputation()
   
  println("Result is $result")
}

println("Thread is run forward")
//sampleEnd                 
}
}
