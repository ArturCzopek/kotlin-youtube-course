package pl.simplecoding.kotlin.episode02

/**
 * @author Artur Czopek
 * @page https://simplecoding.pl/kotlin-02-podstawy
 * @video https://youtu.be/84ghZhZLNJA
 */

fun main(args: Array<String>) {
    val firstContact = PhoneContact("Artur", "Simplecoding", "123123", "Poland")
    val contactWithoutCountry = PhoneContact("Anna", "Bella", "86732")


    val contactInDiffOrder = PhoneContact(
            country = "Poland",
            firstName = "Michael",
            lastName = "Scofield",
            number = "9889728943"
    )

    val contactFromCongo = PhoneContact("Abba", "Tsalalala", "999777", "Congo")

    val contacts = listOf(firstContact, contactWithoutCountry, contactInDiffOrder, contactFromCongo)

    val phoneBook = PhoneBook(contacts)

    println("Contacts in phone book:")
    phoneBook.forEach { println(it) }

    println("Calls: ${CallsRegister.calls.size}")

    println("First call, adding directly to register")
    CallsRegister.addCall(contactInDiffOrder, contactFromCongo)
    CallsRegister.displayCalls()

    println("Second call, adding by calling from contact")
    contactWithoutCountry callTo firstContact
    CallsRegister.displayCalls()

    println("Third call, another to Congo")
    firstContact.callTo(contactFromCongo)
    CallsRegister.displayCalls()

    phoneBook -= firstContact
    println("Contacts in phone book:")
    phoneBook.forEach { println(it) }

    phoneBook += firstContact
    println("Contacts in phone book:")
    phoneBook.forEach { println(it) }
}


// simplecoding.pl