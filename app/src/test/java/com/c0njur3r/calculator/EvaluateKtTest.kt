package com.c0njur3r.calculator

import junit.framework.TestCase
import org.junit.Test

class EvaluateKtTest : TestCase() {
    @Test
    fun testEvaluate() {
        assertEquals("2.0", evaluate("1 + 1"))
        assertEquals((99+99).toDouble().toString(), evaluate("99 + 99"))
        assertEquals("1.0", evaluate("100 - 99"))
    }
}