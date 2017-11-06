import java.util.*

/**
 * Created by Asus on 06.11.2017.
 */
class Deck {

    val cards = Array(52,  { Card(it%13, getSuit(it))
    })
    var cardsInDeck: MutableList<Card> = cards.toMutableList()

    fun drawCard():Card = cardsInDeck.removeAt(0)

    fun reset() {
        cardsInDeck = cards.toMutableList()
        Collections.shuffle(cardsInDeck);
    }

    private fun  getSuit(i: Int) = when(i/13) {
            0 -> "Clubs"
            1 -> "Diamonds"
            2 -> "Hearts"
            else -> "Spades"
        }
}
