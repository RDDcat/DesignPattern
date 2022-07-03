package com.company.Command.Clients;

import com.company.Command.Button;
import com.company.Command.Game;
import com.company.Command.GameEndCommand;
import com.company.Command.GameStartCommand;

public class Client1 {
    public static void main(String[] args) {
        Button button1 = new Button(new GameStartCommand(new Game()));
        Button button2 = new Button(new GameEndCommand(new Game()));
        button1.press();
        button2.press();
    }
}
