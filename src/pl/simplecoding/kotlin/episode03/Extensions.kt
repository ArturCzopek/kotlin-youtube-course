package pl.simplecoding.kotlin.episode03

/**
 * @author Artur Czopek
 * @page https://simplecoding.pl/kotlin-03-funkcje
 * @video https://youtu.be/pgFmM60OjlA
 */

fun CallsRegister.addCall(from: PhoneContact, to: PhoneContact) {
    this.calls += from * to
}

infix fun PhoneContact.callTo(to: PhoneContact) {
    when {
        this.country != null && to.country != null -> {
            when {
                this.country == to.country -> println("domestic call")
                else -> println("International call from ${this.country} to ${to.country}")
            }
        }
        to.country == null -> println("Cannot identify where to call")
        else -> println("Cannot identify caller country")
    }
    CallsRegister.addCall(this, to)
}