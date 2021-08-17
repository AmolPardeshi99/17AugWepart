import java.util.*

fun main() {
    val num = 10
    var sum = 0;
    for (i in num downTo 0) {
        if (i % 3 == 0) sum += i
    }
    println(sum)
}