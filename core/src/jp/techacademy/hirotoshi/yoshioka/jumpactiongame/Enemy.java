package jp.techacademy.hirotoshi.yoshioka.jumpactiongame;

/**
 * Created by Hirotoshi Yoshioka on 12/26/2016.
 */

import com.badlogic.gdx.graphics.Texture;

public class Enemy extends GameObject {
    // 横幅、高さ
    public static final float ENEMY_WIDTH = 1f;
    public static final float ENEMY_HEIGHT = 1f;
    public static final float ENEMY_VELOCITY = 2.0f;

    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT);
        velocity.x = ENEMY_VELOCITY;
    }

    public void update(float deltaTime) {
            setX(getX() + velocity.x * deltaTime);

            if (getX() < ENEMY_WIDTH / 3) {
                velocity.x = -velocity.x;
                setX(ENEMY_WIDTH / 3);
            }
            if (getX() > GameScreen.WORLD_WIDTH - ENEMY_WIDTH / 3) {
                velocity.x = -velocity.x;
                setX(GameScreen.WORLD_WIDTH - ENEMY_WIDTH / 3);
            }
    }
}