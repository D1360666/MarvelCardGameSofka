package com.sofka.cardgame.marvel.domain.game.values;

import co.com.sofka.domain.generic.ValueObject;

public class Status implements ValueObject<String> {
    private final String created;
    private final String initialized;
    private final String finalizated;
    private final String value;

    public Status(String created, String initialized, String finalizated, String value) {
        this.created = created;
        this.initialized = initialized;
        this.finalizated = finalizated;
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
