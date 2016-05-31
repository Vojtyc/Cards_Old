public class Main {

    public static void main(String... args){
        Deck deck = new Deck();

        deck.printShortState("Sorted Deck:");
        deck.shuffle();
        deck.printShortState("\nShuffled Deck:");
        deck.getTopCard("First Card:");
        deck.printFullState();
        deck.getTopCard("Second Card:");
        deck.printFullState();
        deck.comparsion();
        deck.printShortState("\nOther Cards:");

    }
}
// new coment