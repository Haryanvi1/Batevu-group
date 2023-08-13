/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Owner
 */

public class CardMatching {

    public boolean isMatch(Card card1, Card card2) {
        // Implement your card matching logic here
        // Return true if the cards match, otherwise false
        return card1.toString().equals(card2.toString());
    }
}