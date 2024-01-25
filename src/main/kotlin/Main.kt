import java.util.*

fun main() {
    println("Enter the day of the week:")
    val dayOfWeek = readlnOrNull()?.lowercase(Locale.getDefault()) ?: ""

    val message = when (dayOfWeek) {
        "monday" -> "It's the start of the week."
        "tuesday", "wednesday" -> "It's the middle of the week."
        in listOf("thursday", "friday") -> "The weekend is almost here."
        "saturday", "sunday" -> "It's the weekend!"
        else -> "Invalid day"
    }

    println(message)
}
