package com.game.controllers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.game.App;
import com.game.objects.Plane;
import com.game.utils.Renderer;

public class GameController implements Screen {


    private App app;
    private Plane plane;
    private Renderer renderer;

    public GameController(App app) {
        this.app = app;
        this.plane = new Plane(10, 10, 10, 10);
        this.renderer = new Renderer(this.plane);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        this.renderer.render(this.app.renderer);


    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
