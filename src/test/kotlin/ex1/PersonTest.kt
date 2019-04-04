package ex1

import org.junit.Assert.assertEquals
import org.junit.Test


internal class PersonTest {

    @Test
    fun `greeting should return correct String`() {
        val p1 = Person("Me")
        val p2 = Person("You")
        assertEquals("Me greets You!", p1.greeting(p2))
    }

    @Test
    fun getName() {
        assertEquals("Jos", Person("Jos").name)
    }

    @Test
    fun `age should be 0 by default`() {
        assertEquals(0, Person("Jos").age)
    }

    @Test
    fun `age should be correctly set`() {
        assertEquals(89, Person("Jos", 89))
    }
}
