package com.gurpreet.mymario;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gurpreet.mymario.Screens.PlayScreen;

public class MyMario extends Game {
	public static final int V_Width = 400;
	public static final int V_Height = 208;
	public SpriteBatch batch;

	@Override
	public void create () {
		 batch = new SpriteBatch();
		setScreen(new PlayScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
