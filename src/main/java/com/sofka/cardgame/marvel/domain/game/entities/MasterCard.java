package com.sofka.cardgame.marvel.domain.game.entities;

import co.com.sofka.domain.generic.Entity;

public class MasterCard extends Entity<MasterCardId> {
    private Url url;
    private Name name;
    private Power power;

    public MasterCard(MasterCardId entityId, Url url, Name name, Power power) {
        super(entityId);
        this.url = url;
        this.name = name;
        this.power = power;
    }

    //Getters
    public Url getUrl() {
        return url;
    }

    public Name getName() {
        return name;
    }

    public Power getPower() {
        return power;
    }
}
