package pl.simplecoding.kotlin.episode01

/**
 * @author Artur Czopek
 * @page https://simplecoding.pl
 * @video https://www.youtube.com/watch?v=_uXAj7gwv7w
 */

fun main(args: Array<String>) {
    val firstContact = PhoneContact("Artur", "Simplecoding", "123123", "Poland")
    val contactWithoutCountry = PhoneContact("Anna", "Bella", "86732")

    contactWithoutCountry.number = "11111111"

    val contactInDiffOrder = PhoneContact(
            country = "Poland",
            firstName = "Michael",
            lastName = "Scofield",
            number = "9889728943"
    )

    val contactFromCongo = PhoneContact("Abba", "Tsalalala", "999777", "Congo")

    val contacts = listOf(firstContact, contactWithoutCountry, contactInDiffOrder, contactFromCongo)

    // Artur Simplecoding

    contacts
            .map { contact -> "${contact.firstName} ${contact.lastName}" }
            .forEach { mappedContact -> println(mappedContact) }

    println("Filtered contacts:")

    contacts
            .filter { "Poland".equals(it.country, ignoreCase = true) }
            .forEach { println("${it.firstName} ${it.lastName}") }

    println("Grouped contacts:")

    val groupedContacts = contacts.groupBy { it.country }

    groupedContacts
            .forEach { key, value -> println("Key: $key -> $value") }
}

// simplecoding.pl