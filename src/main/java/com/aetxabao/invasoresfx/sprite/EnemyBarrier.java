package com.aetxabao.invasoresfx.sprite;

import com.aetxabao.invasoresfx.util.Rect;
import javafx.scene.image.Image;

public class EnemyBarrier extends EnemyShip implements IHaveShield{

    boolean hasBarrier;

    public EnemyBarrier(Rect gameRect, Image img, int N) {
        super(gameRect, img, N);
        hasBarrier = true;
    }

    public boolean getHasBarrier() {
        return hasBarrier;
    }

    public void setHasBarrier(boolean hasBarrier) {
        this.hasBarrier = hasBarrier;
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public boolean impact() {
        return hasBarrier = false;
    }
}
