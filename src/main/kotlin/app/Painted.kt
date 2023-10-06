package app

class Painted(override val thing: Something) : Personalize() {
    override val personalizationDescription: String = "painted with a beautiful paint"

    private fun paintingCostCalculation(previousCost: Int): Int = previousCost / 1000

    override fun cost(): Int = thing.cost() + paintingCostCalculation(thing.cost())
}