package pl.simplecoding.kotlin.episode03

/**
 * @author Artur Czopek
 * @page https://simplecoding.pl/kotlin-03-funkcje
 * @video https://youtu.be/pgFmM60OjlA
 */

val add = {x: Int, y: Int -> x + y}

val minus: (Int, Int) -> Int = {x, y ->
    println("Minus")
    x - y
}

val upperConverter = { message: String -> message.toUpperCase() }
val lowerConverter: (String) -> String = { it.toLowerCase() }
val starConverter: (String) -> String = { "*** $it ***" }
val noChangeConverter: (String) -> String = { it }
