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
