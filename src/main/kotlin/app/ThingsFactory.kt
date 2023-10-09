package app

class ThingsFactory {
    companion object {
        fun createThing(type: String): Something? {
            return when (type) {
                "apartments" -> Apartments()
                "sportbike" -> Sportbike()
                "book" -> Book()
                else -> null
            }
        }
    }
}