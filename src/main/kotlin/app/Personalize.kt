package app

abstract class Personalize : Something() {
    protected abstract val thing: Something

    override fun achieveDescription(): String = thing.achieveDescription() + ", " + personalizationDescription

    override val description: String = "some personalization"

    protected abstract val personalizationDescription: String
}