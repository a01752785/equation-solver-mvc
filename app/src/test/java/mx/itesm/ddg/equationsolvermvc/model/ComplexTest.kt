package mx.itesm.ddg.equationsolvermvc

import mx.itesm.ddg.equationsolvermvc.model.Complex

import org.junit.Test

import org.junit.Assert.*

/**
 * Author: David Damian
 * Tests for the Complex class.
 */

class ComplexTest {
    @Test
    fun testToString() {
        assertEquals("2.0", Complex(2.0, 0.0).toString())
        assertEquals("2.1 + 3.2i", Complex(2.1, 3.2).toString())
        assertEquals("-4.2 - 1.3i", Complex(-4.2, -1.3).toString())
    }
}