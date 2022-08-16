package com.sofka.cardgame.marvel.domain.game.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Score implements ValueObject<Integer> {
    private final Integer value;

    public Score(Integer value) {
        this.value = Objects.requireNonNull(value);
    }
    @Override
    public Integer value() {
        return this.value;
    }
}

