package pl.simplecoding.kotlin.episode02

import java.time.LocalDateTime

/**
 * @author Artur Czopek
 * @page https://simplecoding.pl/kotlin-02-podstawy
 * @video https://youtu.be/84ghZhZLNJA
 */

data class Call(
        val from: PhoneContact,
        val to: PhoneContact,
        val date: LocalDateTime = LocalDateTime.now()
)

object CallsRegister {

    init {
        println("Calls register has been created")
    }

    val calls: MutableList<Call> by lazy {
        println("This is first lazy list call!")
        mutableListOf<Call>()
    }

    fun displayCalls() {
        calls
                .forEach { println("Date: ${it.date}; from: ${it.from.number}; to ${it.to.number}") }
    }
}