/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;



/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author aniket, ankit, ankit*/;


import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private GroupOfCards deck; // Reference to the deck

    public Player(String name, GroupOfCards deck) {
        this.name = name;
        this.deck = deck;
        hand = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            hand.add(deck.dealCard());
        }
    }

    public void playTurn(Player opponent) {
        System.out.println(name + "'s turn!");
        showHand();

        Scanner scanner = new Scanner(System.in);
        String requestedRank;
        boolean validRequest;

        do {
            validRequest = true;
            System.out.print("Which card rank do you want to ask for? ");
            requestedRank = scanner.next();

            // Check if the player has a card with the requested rank
            boolean hasRequestedRank = false;
            for (Card card : hand) {
                if (card.getRank().equals(requestedRank)) {
                    hasRequestedRank = true;
                    break;
                }
            }

            if (!hasRequestedRank) {
                validRequest = false;
                System.out.println("You must request a rank that you have in your hand. Try again.");
            }
        } while (!validRequest);

        // Check opponent's hand
        boolean found = false;
        for (Card card : new ArrayList<>(opponent.getHand())) {
            if (card.getRank().equals(requestedRank)) {
                found = true;
                hand.add(card);
                opponent.removeCardFromHand(card);
                break;
            }
        }

        if (found) {
            System.out.println("Card found!");
        } else {
            System.out.println("Go Fish!");
            hand.add(deck.dealCard());
        }
    }

    // Display the player's hand
    private void showHand() {
        System.out.println("Your hand:");
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    // Getters and other required methods
    public ArrayList<Card> getHand() {
        return hand;
    }

    public void removeCardFromHand(Card card) {
        hand.remove(card);
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void reset(GroupOfCards deck) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}