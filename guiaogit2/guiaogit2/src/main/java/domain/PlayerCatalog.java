package domain;

import java.util.HashMap;
import java.util.Map;

public class PlayerCatalog {

    private Map<String, ChessPlayer> players;

    public PlayerCatalog() {
        this.players = new HashMap<>();
    }

    public void addPlayer(String name, String email) throws DuplicatedPlayerException {
        
        if (players.containsKey(email)) {
            throw new DuplicatedPlayerException("Jogador com o email " + email + " já existe.");
        }

        ChessPlayer newPlayer = new ChessPlayer(name, email);
        players.put(email, newPlayer);
    }

    public ChessPlayer getPlayer(String email) {
        return players.get(email);
    }



}
