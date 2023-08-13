/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Owner
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PlayerRegistration {

    private ArrayList<Player> players;
    private Map<String, Player> playerMap;

    public PlayerRegistration() {
        players = new ArrayList<>();
        playerMap = new HashMap<>();
    }

    public void registerPlayer(Player player) {
        players.add(player);
        playerMap.put(player.getName(), player);
    }

    public ArrayList<Player> getRegisteredPlayers() {
        return players;
    }

    public Player getPlayerByName(String playerName) {
        return playerMap.get(playerName);
    }
}