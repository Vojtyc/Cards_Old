import java.util.*;

public class Deck {

    List<String> suits;
    List<String> rank ;
    ArrayList<Card> deck;
    List<Card> comp = new ArrayList<Card>();
    Map<String, String> names;
    Card card;
    Card card1, card2;
    int r, s;

    public Deck(){
        suits = new ArrayList<>();
        suits.add("♠");
        suits.add("♥");
        suits.add("♦");
        suits.add("♣");

        rank = new ArrayList<>();
        rank.add("2");
        rank.add("3");
        rank.add("4");
        rank.add("5");
        rank.add("6");
        rank.add("7");
        rank.add("8");
        rank.add("9");
        rank.add("10");
        rank.add("J");
        rank.add("Q");
        rank.add("K");
        rank.add("A");

        deck = new ArrayList<Card>();
        for (r=0; r < rank.size(); r++){
            for (s=0; s < suits.size(); s++){
                deck.add(new Card(rank.get(r)+suits.get(s)));
            }
        }

        names = new HashMap<>();
        names.put("2", "Two");
        names.put("3", "Three");
        names.put("4", "Four");
        names.put("5", "Five");
        names.put("6", "Six");
        names.put("7", "Seven");
        names.put("8", "Eight");
        names.put("9", "Nine");
        names.put("10", "Ten");
        names.put("J", "Jack");
        names.put("Q", "Queen");
        names.put("K", "King");
        names.put("A", "Ace");
        names.put("♠", "Spades");
        names.put("♥", "Hearts");
        names.put("♦", "Diamonds");
        names.put("♣", "Clubs");
    }

    public void printFullState(){
        System.out.print(" - (" + names.get(card.getRank()) + " of " + names.get(card.getSuit()) + ");");
    }

    public void printShortState(String mess){
        System.out.println(mess);
        for (Card d: deck) {
            System.out.print(d.desc + " ");
        }
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public void getTopCard (String mess2){
        System.out.print("\n" + mess2);
        System.out.print("\n" + deck.get(0).desc);
        card = deck.get(0);
        comp.add(card);
        deck.remove(0);

    }

    public void comparsion(){

        card1 = comp.get(0);
        card2 = comp.get(1);

        System.out.print("\nCard comparsion:");
        if (rank.indexOf(card1.getRank()) > rank.indexOf(card2.getRank())){
            System.out.print("\nThe First card rank (" + card1.getRank() + ") is HIGHER than the Second card rank (" + card2.getRank() + ").");
        } else if (rank.indexOf(card1.getRank()) < rank.indexOf(card2.getRank())){
            System.out.print("\nThe First card rank (" + card1.getRank() + ") is LOWER than the Second card rank (" + card2.getRank() + ").");
        } else if (rank.indexOf(card1.getRank()) == rank.indexOf(card2.getRank())){
            System.out.print("\nThe First card rank (" + card1.getRank() + ") is the SAME as the Second card rank (" + card2.getRank() + ").");
        }

        if (suits.indexOf(card1.getSuit()) > suits.indexOf(card2.getSuit())) {
            System.out.print("\n" + "The First card suit (" + card1.getSuit() + ") is HIGHER than the Second card suit (" + card2.getSuit() + ")." );
        } else if (suits.indexOf(card1.getSuit()) < suits.indexOf(card2.getSuit())) {
            System.out.print("\n" + "The First card suit (" + card1.getSuit() + ") is LOWER than the Second card suit (" + card2.getSuit() + ")." );
        } else if (suits.indexOf(card1.getSuit()) == suits.indexOf(card2.getSuit())) {
            System.out.print("\n" + "The First card suit (" + card1.getSuit() + ") is the SAME as the Second card suit (" + card2.getSuit() + ")." );
        }

    }
}
