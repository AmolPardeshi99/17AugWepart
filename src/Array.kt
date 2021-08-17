fun main() {
    val array = arrayOf(1,2,5,8,4,0,5)
    var small = array[0]
    for (i in array.indices) if (array[i]<small) small= array[i]

    println("lowest score is $small")
}