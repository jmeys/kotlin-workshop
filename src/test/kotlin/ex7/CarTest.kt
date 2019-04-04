package ex7

import org.junit.Test

import org.junit.Assert.*

class CarTest {

    @Test
    fun `2 cars with the same specs are equal`() {
        val car1 = Car("VW", "Passat", 2018, "grey")
        val car2 = Car("VW", "Passat", 2018, "grey")

        assertEquals(car1, car2)
    }
}
