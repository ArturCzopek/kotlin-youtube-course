package pl.simplecoding.kotlin.episode01

/**
 * @author Artur Czopek
 * @page https://simplecoding.pl
 * @video https://www.youtube.com/watch?v=_uXAj7gwv7w
 */

fun main(args: Array<String>) {
    println("Hello, Kotlin!")

    var mutable = 1
    println(mutable)

    mutable = 2
    println(mutable)

//    mutable = "Hello"

//    mutable = null

    var nullable: Any?

    nullable = 1.0
    println(nullable)

    nullable = "Nullable string"
    println(nullable)

    nullable = null
    println(nullable)

    val immutable: Int
    immutable = 3
    println(immutable)

//    immutable = 5
}