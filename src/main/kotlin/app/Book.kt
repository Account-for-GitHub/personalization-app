package app

class Book : Something() {
    override val description: String = javaClass.simpleName

    override fun cost(): Int = 1000
}