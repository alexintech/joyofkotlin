package com.joyofkotlin.makingprogramssafer.listing01

import org.junit.Assert.assertEquals
import org.junit.Test

class DonutShopTest {

    @Test
    fun testBuyDonuts() {
        val creditCard = CreditCard()
        buyDonut(creditCard)
        buyDonut(creditCard)
        assertEquals(Donut.price * 2, creditCard.total)
    }

}