package com.basic.graphics;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;

public class BasicGraphics extends ApplicationAdapter {
	private SpriteBatch batch;
	private TextureAtlas textureAtlas;
	private Sprite sprite;
	private int currentFrame = 1;
	private String currentAtlasKey = new String("0001");
	
	@Override
	public void create () {
	    System.out.println("width: "+Gdx.graphics.getWidth());
	    System.out.println("height: "+Gdx.graphics.getHeight());
	    
		batch = new SpriteBatch();
		
		textureAtlas = new TextureAtlas(Gdx.files.internal("data/spritesheet.atlas"));
		AtlasRegion region = textureAtlas.findRegion("0001");
		
		sprite = new Sprite(region);
		sprite.setPosition(120, 100);
		sprite.scale(2.5f);
		Timer.schedule(new Task() {
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                currentFrame++;
                if (currentFrame > 20) {
                    currentFrame = 1;
                }
                
                currentAtlasKey = String.format("%04d", currentFrame);
                sprite.setRegion(textureAtlas.findRegion(currentAtlasKey));
            }
        }, 0,1/30.0f);
	}
	
	@Override
	public void dispose() {
	    batch.dispose();
	    textureAtlas.dispose();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		
		sprite.draw(batch);
		
		batch.end();
	}
	
	@Override
	public void resize(int width, int height) {
	    // TODO Auto-generated method stub
	    super.resize(width, height);
	}
	
	@Override
	public void pause() {
	    // TODO Auto-generated method stub
	    super.pause();
	}
	
	@Override
	public void resume() {
	    // TODO Auto-generated method stub
	    super.resume();
	}
}
