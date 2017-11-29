package pl.simplecoding.kotlin.episode01

data class PhoneContact(
     val firstName: String,
     val lastName: String,
     var number: String,
     var country: String? = null
)