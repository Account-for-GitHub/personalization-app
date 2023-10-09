import app.*

fun main() {
    listOf("apartments", "sportbike", "book").forEach {
        val thing = ThingsFactory.createThing(it)!!
        val personalizedThing = PastedOver(Inlaid(Painted(thing)))
        showInfo(thing, personalizedThing)
    }
}

fun showInfo(originalThing: Something, personalizedThing: Something) {
    val name = originalThing.javaClass.simpleName
    println("---------------")
    println("$name cost before any personalization: ${originalThing.cost()}")
    println("$name after personalization: " + personalizedThing.description())
    println("$name cost after personalization: " + personalizedThing.cost())
}