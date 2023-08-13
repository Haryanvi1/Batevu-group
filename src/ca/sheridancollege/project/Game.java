/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */package ca.sheridancollege.project;


import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private GroupOfCards deck;
    private int wins = 0;
    private int losses = 0;

    public Game() {
        deck = new GroupOfCards(52);
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Player 1's name: ");
        player1 = new Player(scanner.next(), deck);
        System.out.print("Enter Player 2's name: ");
        player2 = new Player(scanner.next(), deck);

        boolean continuePlaying = true;
        while (continuePlaying) {
            // Example play sequence
            player1.playTurn(player2);
            player2.playTurn(player1);
            
            
            // Check for end game condition
            if (gameOver()) {
                System.out.println("Game over! Do you want to play again? (yes/no)");
                if (scanner.next().equalsIgnoreCase("no")) {
                    continuePlaying = false;
                    System.out.println("Wins: " + wins + " Losses: " + losses);
                }
                // Reset game state if continuing
                else {
                    deck = new GroupOfCards(52);
                   player1.reset(deck);
                    player2.reset(deck);
                }
            }
        }
    }
public void announceWinner(Player winner, Player loser) {
    System.out.println(winner.getName() + ", congratulations! You win!");
    System.out.println(loser.getName() + ", better luck next time!");
}

    private boolean gameOver() {
        // Implement game over logic (e.g., no cards left)
        return false;
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();
    }
}