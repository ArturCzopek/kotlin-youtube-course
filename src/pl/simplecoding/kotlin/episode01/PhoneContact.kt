package pl.simplecoding.kotlin.episode01

/**
 * @author Artur Czopek
 * @page https://simplecoding.pl
 * @video https://www.youtube.com/watch?v=_uXAj7gwv7w
 */

data class PhoneContact(
     val firstName: String,
     val lastName: String,
     var number: String,
     var country: String? = null
)