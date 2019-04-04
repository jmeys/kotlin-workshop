package ex5

import org.junit.Assert.*
import org.junit.Test

class WhenMySwitchSwitchesKtTest {

    @Test
    fun `origin of German cars`() {
        assertEquals("Germany", orginOf(Carbrand.AUDI))
        assertEquals("Germany", orginOf(Carbrand.BMW))
        assertEquals("Germany", orginOf(Carbrand.VW))
    }

    @Test
    fun `origin of US cars`() {
        assertEquals("USA", orginOf(Carbrand.CHEVROLET))
        assertEquals("USA", orginOf(Carbrand.CHRYSLER))
    }

    @Test
    fun `origin of French cars`() {
        assertEquals("French", orginOf(Carbrand.PEUGEOT))
        assertEquals("French", orginOf(Carbrand.CITROEN))
    }
}
