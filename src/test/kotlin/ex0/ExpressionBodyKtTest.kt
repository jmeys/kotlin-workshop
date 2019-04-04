package ex0

import org.junit.Test

import org.junit.Assert.*

class ExpressionBodyKtTest {

    @Test
    fun maxOf() {
        assertEquals(5, maximumOf(5, 2))
        assertEquals(5, maximumOf(2, 5))
        assertEquals(0, maximumOf(0, 0))
        assertEquals(5, maximumOf(5, -5))
    }
}
