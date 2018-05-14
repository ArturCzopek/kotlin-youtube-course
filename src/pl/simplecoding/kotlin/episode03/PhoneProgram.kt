package pl.simplecoding.kotlin.episode03

/**
 * @author Artur Czopek
 * @page https://simplecoding.pl/kotlin-03-funkcje
 * @video https://youtu.be/pgFmM60OjlA
 */

fun main(args: Array<String>) {
    val firstContact = PhoneContact("Artur", "Simplecoding", "123123", "Poland", upperConverter)
    val contactWithoutCountry = PhoneContact("Anna", "Bella", "86732", textConverter = lowerConverter)


    val contactInDiffOrder = PhoneContact(
            country = "Poland",
            firstName = "Michael",
            lastName = "Scofield",
            number = "9889728943",
            textConverter = { it.replace(" ", "_") }
    )

    val contactFromCongo = PhoneContact(
            "Abba",
            "Tsalalala",
            "999777",
            textConverter = { lowerConverter(starConverter(it)) }
    ).apply {
        country = "Congo"
    }

    val contacts = listOf(firstContact, contactWithoutCountry, contactInDiffOrder, contactFromCongo)

    val phoneBook = PhoneBook(contacts)

    println("Contacts in phone book:")
    phoneBook.forEach { it.displayContact() }

    println("Calls: ${CallsRegister.calls.size}")

    println("First call, adding directly to register")
    with(CallsRegister) {
        addCall(contactInDiffOrder, contactFromCongo)
        displayCalls()
    }

    println("Second call, adding by calling from contact")
    contactWithoutCountry callTo firstContact
    CallsRegister.displayCalls()

    println("Third call, another to Congo")
    firstContact.callTo(contactFromCongo)
    CallsRegister.displayCalls()

    phoneBook -= firstContact
    println("Contacts in phone book:")
    phoneBook.forEach { it.displayContact() }

    phoneBook += firstContact
    println("Contacts in phone book:")
    phoneBook.forEach { it.displayContact() }
}


// simplecoding.pl