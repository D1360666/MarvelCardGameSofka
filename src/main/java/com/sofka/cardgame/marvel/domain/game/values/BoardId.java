package com.sofka.cardgame.marvel.domain.game.values;

import co.com.sofka.domain.generic.Identity;

public class BoardId extends Identity {
    public BoardId(){}
    public BoardId(String id){
        super(id);
    }
    public static BoardId of(String id) {
        return new BoardId(id);
    }
}
