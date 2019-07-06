package com.joyofkotlin.makingprogramssafer.listing05

data class Payment(val creditCard: CreditCard, val amount: Int) {

    fun combine(payment: Payment): Payment =
        if (creditCard == payment.creditCard)
            Payment(creditCard, amount + payment.amount)
        else
            throw IllegalArgumentException("Cards don't match.")

    companion object {
        fun groupByCard(payments: List<Payment>): List<Payment> =
            payments.groupBy { it.creditCard }
                    .values
                    .map { it.reduce(Payment::combine) }
    }
}