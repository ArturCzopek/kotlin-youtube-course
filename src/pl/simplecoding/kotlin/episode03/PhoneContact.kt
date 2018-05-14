package pl.simplecoding.kotlin.episode03

/**
 * @author Artur Czopek
 * @page https://simplecoding.pl/kotlin-03-funkcje
 * @video https://youtu.be/pgFmM60OjlA
 */

data class PhoneContact(
     val firstName: String,
     val lastName: String,
     var number: String,
     var country: String? = null,
     private val textConverter: (String) -> String = noChangeConverter
) {
    init {
        require(firstName.length > 3) { "Name not valid! Length: ${firstName.length}"}
    }

    fun displayContact() = println(textConverter("$firstName $lastName; $number, ${country.let { it }}"))
}
