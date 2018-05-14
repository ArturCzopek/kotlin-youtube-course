package pl.simplecoding.kotlin.episode03

/**
 * @author Artur Czopek
 * @page https://simplecoding.pl/kotlin-03-funkcje
 * @video https://youtu.be/pgFmM60OjlA
 */

operator fun CallsRegister.plusAssign(call: Call) {
    this.calls += call
}

operator fun PhoneContact.times(to: PhoneContact) = Call(this, to).also { println("Created call by operator times") }
