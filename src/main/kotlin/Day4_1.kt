fun main() {
    val resource = Day4_1::class.java.getResourceAsStream("Day4.input")
    var sum = 0
    val regex = "^(\\d+)-(\\d+),(\\d+)-(\\d+)$".toRegex()
    for ( line in resource.bufferedReader().lineSequence() ) {

        val groups = regex.matchEntire(line)!!.groups

        val i1 = groups[1]!!.value.toInt()
        val i2 = groups[2]!!.value.toInt()
        val j1 = groups[3]!!.value.toInt()
        val j2 = groups[4]!!.value.toInt()

        if ((i1 >= j1 && i1 <= j2) ||
                (i2 <= j2 && i2 >= j1) ||
                (j1 >= i1 && j1 <= i2) ||
                (j2 <= i2 && j2 >= i1)
                ) {
            println("Found overlapping range in " + line)
            sum++
        }

    }

    println( "Sum: " + sum)

}
class Day4_1 {}