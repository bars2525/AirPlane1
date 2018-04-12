package com.aleksandr.game.view;

import com.aleksandr.game.model.Plane;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen implements Screen
{
    private Texture planeTexture;
    private SpriteBatch batch;
    private Plane plane;
    @Override
    public void show()
    {
        planeTexture = new Texture(Gdx.files.internal("plane.png"));
        batch = new SpriteBatch();
        plane = new Plane(planeTexture, 120, 350, 73, 88);
    }

    @Override
    public void render(float delta)
    {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();

        plane.draw(batch);

        batch.end();


    }

    @Override
    public void resize(int width, int height)
    {


    }

    @Override
    public void pause()
    {


    }

    @Override
    public void resume() {

    }

    @Override
    public void hide()
    {


    }

    @Override
    public void dispose()
    {
        planeTexture.dispose();
        batch.dispose();


    }
}
