package com.sofka.cardgame.marvel.domain.game.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.cardgame.marvel.domain.game.values.BoardId;
import com.sofka.cardgame.marvel.domain.game.values.Card;
import com.sofka.cardgame.marvel.domain.game.values.Round;
import com.sofka.cardgame.marvel.domain.game.values.Time;

import java.util.Set;

public class Board extends Entity<BoardId> {
    private Set<Card> cardSet;
    private Time time;
    private Round round;

    public Board(BoardId entityId, Set<Card> cardSet, Time time, Round round) {
        super(entityId);
        this.cardSet = cardSet;
        this.time = time;
        this.round = round;
    }

    //Getters
    public Set<Card> getCardSet() {
        return cardSet;
    }

    public Time getTime() {
        return time;
    }

    public Round getRound() {
        return round;
    }
}
