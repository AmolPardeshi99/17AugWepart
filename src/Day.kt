fun main() {
    var day = "Monday"
    var res = when (day) {
        "Monday" -> "Mon"
        "Tuesday" -> "Tue"
        "Wednesday" -> "Wed"
        "Thursday" -> "Thus"
        "Friday" -> "Fri"
        "Saturday" -> "Sat"
        "Sunday" -> "Sun"
        else -> "Invalid"
    }
    println(res)
}