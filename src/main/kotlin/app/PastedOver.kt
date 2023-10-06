package app

class PastedOver(override val thing: Something) : Personalize() {
    override val personalizationDescription: String = "pasted over with a lot of wonderful stickers"

    private fun calculatePastedOverCost(previousCost: Int): Int = previousCost / 100

    override fun cost(): Int = thing.cost() + calculatePastedOverCost(thing.cost())
}