package com.werwolv.main;

import com.werwolv.api.IUpdatable;
import com.werwolv.entities.Entity;

public class Camera implements IUpdatable {

    private double x, y;
    private float lerp;

    private Entity entityToFollow;

    public Camera() {
        this.x = - Game.INSTANCE.getWindowWidth() / 2;
        this.y = - Game.INSTANCE.getWindowHeight() / 2;
        this.lerp = 0.0F;
        this.setUpdateable();
    }

    public void setEntityToFollow(Entity entityToFollow) {
        this.entityToFollow = entityToFollow;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public float getLerp() {
        return lerp;
    }

    public void setLerp(float lerp) {
        this.lerp = lerp;
    }

    @Override
    public void update(long deltaTime) {
        if(entityToFollow != null) {
            this.x += (entityToFollow.getPosX() - Game.INSTANCE.getWindowWidth() / 2 - this.x) * lerp;
            this.y += (entityToFollow.getPosY() - Game.INSTANCE.getWindowHeight() / 2 - this.y) * lerp;
        }
    }
}
