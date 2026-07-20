import java.util.*;

class Card {
    private String symbol;
    private int number;

    public Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }
}

public class CardCollection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<String> symbols = new HashSet<>();
        TreeMap<String, Card> cards = new TreeMap<>();

        int count = 0;

        while (symbols.size() < 4) {

            System.out.println("Enter a card :");

            String symbol = sc.next();
            int number = sc.nextInt();

            count++;

            if (!symbols.contains(symbol)) {
                symbols.add(symbol);
                cards.put(symbol, new Card(symbol, number));
            }
        }

        System.out.println("Four symbols gathered in " + count + " cards.");
        System.out.println("Cards in Set are :");

        for (Card card : cards.values()) {
            System.out.println(card.getSymbol() + " " + card.getNumber());
        }

        sc.close();
    }
}