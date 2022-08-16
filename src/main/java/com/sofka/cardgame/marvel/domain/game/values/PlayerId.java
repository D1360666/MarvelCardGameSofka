package com.sofka.cardgame.marvel.domain.game.values;

import co.com.sofka.domain.generic.Identity;
import com.sofka.cardgame.marvel.domain.game.entities.Player;

public class PlayerId extends Identity {
    public PlayerId(){}
    public PlayerId(String id){
        super(id);
    }
    public static PlayerId of(String id) {
        return new PlayerId(id);
    }
}
