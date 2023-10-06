package app

class Sportbike : Something() {
    override val description: String = javaClass.simpleName

    override fun cost(): Int = 250_000
}