package app

abstract class Personalize : Something() {
    protected abstract val thing: Something

    override fun description(): String {
        return thing.description() + ", " + personalizationDescription
    }

    protected abstract val personalizationDescription: String
}