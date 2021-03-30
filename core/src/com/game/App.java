package com.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.game.controllers.GameController;

public class App extends Game {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;

    public ShapeRenderer renderer;

    @Override
    public void create() {
    	this.renderer = new ShapeRenderer();
        this.setScreen(new GameController(this));

    }

    @Override
    public void render() {
        super.render();

    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
