package com.audio.test;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class AudioTest extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Sound fireSound;
	Sound attack;
	Music battle;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		
		this.fireSound = Gdx.audio.newSound(Gdx.files.internal("fire.ogg"));
		this.attack = Gdx.audio.newSound(Gdx.files.internal("attack.ogg"));
		long id1 = this.fireSound.loop();
		long id2 = this.attack.play();
		this.fireSound.setVolume(id1, 0.6f);
		this.attack.setVolume(id2, 0.2f);
		
		this.battle = Gdx.audio.newMusic(Gdx.files.internal("battle.mp3"));
		this.battle.play();
		this.battle.setVolume(0.9f);
	}
	
	@Override
	public void dispose() {
	    // TODO Auto-generated method stub
	    super.dispose();
	    this.fireSound.dispose();
	    this.attack.dispose();
	    this.battle.dispose();
	}

	@Override
	public void render () {
	    
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
}
