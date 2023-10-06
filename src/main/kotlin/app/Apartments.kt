package app

class Apartments : Something() {
    override val description: String = javaClass.simpleName

    override fun cost(): Int = 2_000_000
}