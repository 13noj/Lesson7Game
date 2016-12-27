package jp.techacademy.hirotoshi.yoshioka.jumpactiongame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import jp.techacademy.hirotoshi.yoshioka.jumpactiongame.JumpActionGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new JumpActionGame(), config);
	}
}
