import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun cutRod() {
        val price = intArrayOf(1, 5, 8, 9, 10, 17, 17, 20, 24, 30)
        val result = cutRod(price);
        assertArrayEquals(intArrayOf(0, 1, 5, 8, 10, 13, 17, 18, 22, 25, 30), result.first)
        assertArrayEquals(intArrayOf(1, 2, 3, 2, 2, 6, 1, 2, 3, 10), result.second)
        printSolution(result.first, result.second)
    }
}