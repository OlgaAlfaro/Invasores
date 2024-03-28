package com.aetxabao.invasoresfx.sprite;

import com.aetxabao.invasoresfx.util.Rect;
import javafx.scene.image.Image;

public class EnemyBarrier extends EnemyShip implements IHaveShield{
    boolean hasBarrier;

    public EnemyBarrier(Rect gameRect, Image img, int N) {
        super(gameRect, img, N);
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
