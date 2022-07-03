package com.company.Command;

public class GameEndCommand implements Command{
    private Game game;

    public GameEndCommand(Game game){
        this.game = game;
    }

    @Override
    public void play() {
        game.end();
    }
}
