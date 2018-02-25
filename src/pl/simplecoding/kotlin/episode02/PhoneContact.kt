package pl.simplecoding.kotlin.episode02

/**
 * @author Artur Czopek
 * @page https://simplecoding.pl/kotlin-02-podstawy
 * @video https://youtu.be/84ghZhZLNJA
 */

data class PhoneContact(
     val firstName: String,
     val lastName: String,
     var number: String,
     var country: String? = null
)