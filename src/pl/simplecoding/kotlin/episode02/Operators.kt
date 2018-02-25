package pl.simplecoding.kotlin.episode02

/**
 * @author Artur Czopek
 * @page https://simplecoding.pl/kotlin-02-podstawy
 * @video https://youtu.be/84ghZhZLNJA
 */

operator fun CallsRegister.plusAssign(call: Call) {
    this.calls += call
}

operator fun PhoneContact.times(to: PhoneContact) = Call(this, to)