package com.sofka.cardgame.marvel.domain.game.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.cardgame.marvel.domain.game.values.*;

public class Player extends Entity<PlayerId> {
    private Nickname nickname;
    private Email email;
    private Score score;
    private Deck deck;

    public Player(PlayerId playerId, Nickname nickname, Email email, Score score, Deck deck) {
        super(playerId);
        this.nickname = nickname;
        this.email = email;
        this.score = score;
        this.deck = deck;
    }

    //Getters
    public Nickname getNickname() {
        return nickname;
    }

    public Email getEmail() {
        return email;
    }

    public Score getScore() {
        return score;
    }

    public Deck getDeck() {
        return deck;
    }
}
