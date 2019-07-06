package com.joyofkotlin.makingprogramssafer.listing03

class Payment(val creditCard: CreditCard, val amount: Int) {

    fun combine(payment: Payment): Payment =
        if (creditCard == payment.creditCard)
            Payment(creditCard, amount + payment.amount)
        else
            throw IllegalArgumentException("Cards don't match.")
}