package aoc24

import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    
    @Test
    fun `test getGreeting returns Hello World`() {
        val expected = "Hello World!"
        val actual = getGreeting()
        assertEquals(expected, actual)
    }
    
    @Test
    fun `test greeting is not empty`() {
        val greeting = getGreeting()
        assert(greeting.isNotEmpty()) { "Greeting should not be empty" }
    }
}
