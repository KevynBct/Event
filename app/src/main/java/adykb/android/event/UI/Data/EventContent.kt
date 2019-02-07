package adykb.android.event.UI.Data

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object EventContent {

    val ITEMS: MutableList<Event> = ArrayList()

    val ITEM_MAP: MutableMap<String, Event> = HashMap()

    private fun addItem(item: Event) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createEventItem(position: Int, name: String, description: String, posX: Double, posY: Double): Event {
        return Event(position.toString(), name, description, posX, posY)
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }
}
