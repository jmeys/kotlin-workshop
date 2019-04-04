package ex6

import org.junit.Test

import org.junit.Assert.*

class MixAndMatchKtTest {

    @Test
    fun `combine to green`() {
        assertEquals("green", combine(Color.YELLOW, Color.BLUE))
        assertEquals("green", combine(Color.BLUE, Color.YELLOW))
    }

    @Test
    fun `combine to orange`() {
        assertEquals("orange", combine(Color.YELLOW, Color.RED))
        assertEquals("orange", combine(Color.RED, Color.YELLOW))
    }

    @Test
    fun `combine to purple`() {
        assertEquals("purple", combine(Color.RED, Color.BLUE))
        assertEquals("purple", combine(Color.BLUE, Color.RED))
    }

    // Tests below are a bit of a dick-move
    // Make them succeed if you like :)

    @Test
    fun `combine to red`() {
        assertEquals("red", combine(Color.RED, Color.RED))
    }

    @Test
    fun `combine to blue`() {
        assertEquals("blue", combine(Color.BLUE, Color.BLUE))
    }

    @Test
    fun `combine to yellow`() {
        assertEquals("yellow", combine(Color.YELLOW, Color.YELLOW))
    }
}
