public final class CardUtil {

    private static final Rank HIGHEST_RANK = Rank.ACE;
    private static final Suit HIGHEST_SUIT = Suit.SPADES;

    private CardUtil() {}

    public static boolean isHighestCard(Card card) {
        return (card.getRank() == HIGHEST_RANK && card.getSuit() == HIGHEST_SUIT);
    }
    
    public class CardUtilTest{
        public static void main(String[] args) {
            Card card1 = new Card(Rank.ACE, Suit.SPADES);
            Card card2 = new Card(Rank.JACK, Suit.CLUBS);

            System.out.println(isHighestCard(card1));
            System.out.println(isHighestCard(card2));
        }
    }
}