import kotlinx.coroutines.*

fun main() = runBlocking {
    doWorld()
    println("Done")
}


suspend fun doWorld() = coroutineScope {
    launch {
        delay(2000L)
        println("World 2")
    }
    launch {
        delay(1000L)
        println("World 1")
    }
    println("Hello")
}