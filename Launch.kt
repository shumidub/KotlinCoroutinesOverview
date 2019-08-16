import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
//sampleStart
suspend fun longComputation() : Int{
  delay(500L)
  return 47
}   
  
println("Start")
GlobalScope.launch(Dispatchers.Default) {
  println("Launch coroutine")
  val result = longComputation()
   
  println("Result is $result")
}

println("Thread is run forward")
//sampleEnd
Thread.sleep(1000L)  
}
