import java.util.Random;

public class CardDeck {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        
        return deck;
    }

    // Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        int n = deck.length;
        
        for (int i = 0; i < n; i++) {
            // Generate a random index between i and n-1
            int randomCardNumber = i + rand.nextInt(n - i);
            
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        
        return deck;
    }

    // Method to distribute the deck of cards to x number of players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        // Check if it's possible to distribute the cards evenly
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("Cards cannot be distributed evenly.");
            return null;
        }
        
        int cardsPerPlayer = numOfCards / numOfPlayers;
        String[][] players = new String[numOfPlayers][cardsPerPlayer];
        
        int cardIndex = 0;
        
        // Distribute cards to each player
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < players[i].length; j++) {
                System.out.print(players[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Initialize the deck
        String[] deck = initializeDeck();
        
        // Shuffle the deck
        deck = shuffleDeck(deck);
        
        // Specify the number of players
        int numOfPlayers = 4; // Example: 4 players
        int numOfCards = deck.length;
        
        // Distribute the cards
        String[][] players = distributeCards(deck, numOfCards, numOfPlayers);
        
        if (players != null) {
            // Print each player's cards
            printPlayersCards(players);
        }
    }
}