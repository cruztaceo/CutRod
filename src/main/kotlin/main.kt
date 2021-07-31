import kotlin.Float.Companion.NEGATIVE_INFINITY

fun main() {
    val p = intArrayOf(1, 4, 10, 12, 15, 20, 21, 32, 31, 41, 51)
    val result = cutRod(p)

    println("Results = ${result.first.contentToString()}")
    println("Optimal Solution = ${result.second.contentToString()}")
}

fun cutRod(p: IntArray): Pair<IntArray, IntArray> {
    val n = p.size
    val r = IntArray(n + 1) { it }
    val s = IntArray(n) { it + 1 }

    r[0] = 0

    for (j in 1..n) {
        var q = NEGATIVE_INFINITY.toInt()
        for (i in 1..j) {
            if (q < p[i - 1] + r[j - i]) {
                q = p[i - 1] + r[j - i]
                s[j - 1] = i
            }
        }
        r[j] = q
    }
    return Pair(r, s)
}

fun printSolution(r: IntArray, s: IntArray){
    var n = s.size - 1
    while (n > 0){
        println(s[n])
        n -= s[n]
    }
}