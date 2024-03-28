package com.aetxabao.invasoresfx.sprite;

import javafx.scene.image.Image;

public class EnemyBarrier extends AEnemy implements IHaveShield{
    boolean hasBarrier;
    public EnemyBarrier(Image img, int rows, int cols) {
        super(img, rows, cols);
        hasBarrier = true;

    }

    @Override
    public void update() {
    }

    @Override
    public boolean impact() {
        return hasBarrier = false;
    }
}
