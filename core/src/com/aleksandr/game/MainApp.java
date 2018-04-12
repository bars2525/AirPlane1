package com.aleksandr.game;


import com.aleksandr.game.view.GameScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public class MainApp extends Game
{
    private Screen gameScreen;
    @Override
    public void create()
    {
        gameScreen = new GameScreen();
        setScreen(gameScreen);

    }
}
