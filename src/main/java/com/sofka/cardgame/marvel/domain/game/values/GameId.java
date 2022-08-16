package com.sofka.cardgame.marvel.domain.game.values;

import co.com.sofka.domain.generic.Identity;

public class GameId extends Identity {
    public GameId(){}
    public GameId(String id){
        super(id);
    }
    public static GameId of(String id) {
        return new GameId(id);
    }
}
