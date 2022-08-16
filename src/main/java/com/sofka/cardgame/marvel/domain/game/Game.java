package com.sofka.cardgame.marvel.domain.game;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.cardgame.marvel.domain.game.entities.Board;
import com.sofka.cardgame.marvel.domain.game.entities.Player;
import com.sofka.cardgame.marvel.domain.game.values.GameId;
import com.sofka.cardgame.marvel.domain.game.values.Status;

import java.util.Set;

public class Game extends AggregateEvent<GameId> {
    protected Board board;
    protected Set<Player> playerSet;
    protected Status status;
    protected Player winner;


    public Game(GameId entityId, Board board, Set<Player> playerSet, Status status) {
        super(entityId);
        appendChange(new GameCreated(name)).apply();
    }

    private Game(GameId gameId) {
        super(gameId);
        subscribe(new GameChange(this));
    }

    public static Game from(GameId gameId, List<DomainEvent> domainEvents) {
        Game game = new Game(gameId);
        domainEvents.forEach(game::applyEvent);
        return game;
    }

    //Getters and Setters
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Set<Player> getPlayerSet() {
        return playerSet;
    }

    public void setPlayerSet(Set<Player> playerSet) {
        this.playerSet = playerSet;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Winner getWinner() {
        return winner;
    }

    public void setWinner(Winner winner) {
        this.winner = winner;
    }
}
