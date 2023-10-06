package app

class Inlaid(override val thing: Something) : Personalize() {
    override val personalizationDescription: String = "inlaid with diamonds and rubies"

    private fun calculateInlaidingCost(previousCost: Int): Int = previousCost / 10

    override fun cost(): Int = thing.cost() + calculateInlaidingCost(thing.cost())
}