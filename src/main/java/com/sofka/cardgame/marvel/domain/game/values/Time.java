package com.sofka.cardgame.marvel.domain.game.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Time implements ValueObject<Integer> {
    private final Integer value;

    public Time(Integer value) {
        this.value = Objects.requireNonNull(value);
    }
    @Override
    public Integer value() {
        return this.value;
    }
}
