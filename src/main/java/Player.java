import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public int cardCount() {
        return this.hand.size();
    }

    public void pickCardFromDeck(Deck deck) {
        Card card = deck.removeChosenCardForPlayer();
        this.hand.add(card);
    }

    public int cardValueFromEnum() {
        return this.hand.get(0).getRank().getValue();
    }

    public int cardValueFromEnumTwoCards() {
        return (this.hand.get(0).getRank().getValue() + this.hand.get(1).getRank().getValue());
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }


}
