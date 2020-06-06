fun main() {
    val num = 120
    when (num) {
        in 1..10 -> println("Number lies b/w 1-10")
        in 11..20 -> println("Number lies b/w 11-20")
        in 21..30 -> println("Number lies b/w 21-30")
        in 31..40 -> println("Number lies b/w 31-40")
        in 41..50 -> println("Number lies b/w 41-50")
        in 51..60 -> println("Number lies b/w 51-60")
        in 61..70 -> println("Number lies b/w 61-70")
        in 71..80 -> println("Number lies b/w 71-80")
        in 81..90 -> println("Number lies b/w 81-90")
        in 91..100 -> println("Number lies b/w 91-100")

        else -> println("Number is greater than 100")

    }
}