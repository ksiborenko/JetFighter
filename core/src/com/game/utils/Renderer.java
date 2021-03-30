package com.game.utils;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.game.objects.Plane;

public class Renderer {

    private Plane plane;

    public Renderer(Plane plane) {
        this.plane = plane;
    }

    public void render(ShapeRenderer renderer) {
        renderer.begin(ShapeRenderer.ShapeType.Line);
        renderer.rect(this.plane.getXPosition(), this.plane.getYPosition(), this.plane.getWidth(), this.plane.getHeight());
        renderer.end();
    }
}
