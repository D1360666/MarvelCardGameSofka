package com.sofka.cardgame.marvel.domain.game.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.Set;

public class Deck implements ValueObject<Set<Card>> {
    private final Set<Card> value;

    public Deck(Set<Card> value) {
        this.value = value;
    }


    @Override
    public Set<Card> value() {
        return this.value;
    }
}
