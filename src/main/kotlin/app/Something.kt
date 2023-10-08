package app

abstract class Something {
    open val description: String = "no description yet"

    open fun description(): String = description

    abstract fun cost(): Int
}