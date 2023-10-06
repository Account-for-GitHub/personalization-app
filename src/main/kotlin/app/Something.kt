package app

abstract class Something {
    protected abstract val description: String

    open fun achieveDescription(): String = description

    abstract fun cost(): Int
}