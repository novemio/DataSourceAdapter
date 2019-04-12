package com.novemio.rendereradapter

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        val test = com.novemio.rendereradapter.screens.Test("milan")
        val test2 = com.novemio.rendereradapter.screens.Test("milan1")

        assertEquals(test.hashCode(),test2.hashCode())
    }

}
