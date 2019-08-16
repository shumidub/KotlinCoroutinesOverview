import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

fun main(args: Array<String>) {

//sampleStart
println("Start")
GlobalScope.launch(Dispatchers.Default) {
  println("Launch coroutine")
  val result = longComputation()
   
  println("Result is $result")
}

println("Thread is run forward")

suspend fun longComputation() : Int{
  delay(2000L)
  return 42
}
//sampleEnd                 

}


