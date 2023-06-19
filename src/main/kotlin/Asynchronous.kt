import kotlinx.coroutines.*

fun main() {
    println("Program started")
    runBlocking {
        val deferredResult = async { getResult() }


        println("Do some other work...")


        val result = deferredResult.await()


        println("Result: $result")
    }
    println("Program ended")
}

suspend fun getResult(): Int {
    delay(2000)
    return 42
}
