package adykb.android.event.Utils

class EventDAO {

    companion object {
        fun getAllEvents() : ArrayList<Event> {
            var eventsList = arrayListOf<Event>()

            val e1 = Event(2, "64 route de Clisson 44200 Nantes", "Chez moi", 47.1912081, -1.523512500000038)
            val e2 =
                Event(3, "5 rue Jacques Brel St Herblain", "DTA Ingénierie", 47.23315969999999, -1.6290569000000232)
            val e3 = Event(4, "6 boulevard Vincent Gache", "Chez moi avant", 47.2069582, -1.5407631000000492)
            val e4 = Event(5, "11 rue du cher", "Chez moi encore avant", 47.2150889, -1.534298900000067)

            eventsList.add(e1)
            eventsList.add(e2)
            eventsList.add(e3)
            eventsList.add(e4)


            return eventsList
        }
    }
}