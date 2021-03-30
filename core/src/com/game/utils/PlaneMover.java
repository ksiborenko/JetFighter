package com.game.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.game.objects.Plane;

public class PlaneMover {

    private final Plane playerOne;

    public PlaneMover(Plane playerOne) {
        this.playerOne = playerOne;
    }

    public void move() {
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            this.playerOne.move(0, 1);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            this.playerOne.move(0, -1);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            this.playerOne.move(-1, 0);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            this.playerOne.move(1, 0);
        }
    }
}
