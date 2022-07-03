package com.company.Command;

public class GameStartCommand implements Command{
    private Game game;

    public GameStartCommand(Game game){
        this.game = game;
    }

    @Override
    public void play() {
        game.start();
    }
}
