import app.*

fun main(){
    val apartments = Apartments()
    val sportbike = Sportbike()
    val book = Book()

    line()
    println("Apartments cost before any personalization: ${apartments.cost()}")
    println("Sportbike cost before any personalization: ${sportbike.cost()}")
    println("Book before any personalization: ${book.cost()}")

    line()
    val personalizationOfApartments = PastedOver(Inlaid(Painted(apartments)))
    println("Apartments after personalization: " + personalizationOfApartments.achieveDescription())
    println("Apartments cost after personalization: " + personalizationOfApartments.cost())

    line()
    val personalizationOfSportbike = PastedOver(Inlaid(Painted(sportbike)))
    println("Sportbike after personalization: " + personalizationOfSportbike.achieveDescription())
    println("Sportbike cost after personalization: " + personalizationOfSportbike.cost())

    line()
    val personalizationOfBook = PastedOver(Inlaid(Painted(book)))
    println("Book after personalization: " + personalizationOfBook.achieveDescription())
    println("Book cost after personalization: " + personalizationOfBook.cost())
}

fun line() = println("---------------")