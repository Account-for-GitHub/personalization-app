import app.*

fun main(){
    val apartments = Apartments()
    val personalizationOfApartments = PastedOver(Inlaid(Painted(apartments)))
    showInfo(apartments, personalizationOfApartments)

    val sportbike = Sportbike()
    val personalizationOfSportbike = PastedOver(Inlaid(Painted(sportbike)))
    showInfo(sportbike, personalizationOfSportbike)

    val book = Book()
    val personalizationOfBook = PastedOver(Inlaid(Painted(book)))
    showInfo(book, personalizationOfBook)
}

fun showInfo(originalThing: Something, personalizedThing: Something){
    val name = originalThing.javaClass.simpleName
    println("---------------")
    println("$name cost before any personalization: ${originalThing.cost()}")
    println("$name after personalization: " + personalizedThing.description())
    println("$name cost after personalization: " + personalizedThing.cost())
}