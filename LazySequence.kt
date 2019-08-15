// kotlin std lib 
// package kotlin.sequences
// For Builds a sequence lazily yielding values one by one
// On same thread

suspend fun SequenceScope<Int>.printAndYield(result : Int){
  println("Sent: $result")
  yield(result)
}

val fibonacci : Sequence<Int> = sequence {
    printAndYield(1) // first Fibonacci number
    var current = 1
    var next = 1
    while (true) {
        printAndYield(next) // next Fibonacci number
        val tmp = current + next
        current = next
        next = tmp
    }
}

fibonacci.take(10).forEach { println("Recived: $it") }
