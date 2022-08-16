package com.sofka.cardgame.marvel.domain.game.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nickname implements ValueObject<String> {
    private final String value;

    public Nickname(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException(("Nickname can't be empty"));
        }
        if(this.value.length()>20) {
            throw new IllegalArgumentException(("Nickame can't be longer than 20 characters"));
        }
    }

    @Override
    public String value() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nickname nickname = (Nickname) o;
        return Objects.equals(value, nickname.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
