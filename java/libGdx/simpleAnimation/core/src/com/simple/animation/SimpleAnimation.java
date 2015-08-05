package com.simple.animation;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class SimpleAnimation extends ApplicationAdapter {
	private SpriteBatch batch;
	private TextureAtlas textureAtlas;
	private Animation animation;
	private float elapsedTime = 0;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		textureAtlas = new TextureAtlas(Gdx.files.internal("data/spritesheet.atlas"));
		animation = new Animation(1/15f, textureAtlas.getRegions());
		
		/*TextureRegion[] rotateUpFrames = new TextureRegion[10];
	    
	    // Rotate Up Animation
	    // Create an array of TextureRegions
	    rotateUpFrames[0] = (textureAtlas.findRegion("0001"));
	    rotateUpFrames[1] = (textureAtlas.findRegion("0002"));
	    rotateUpFrames[2] = (textureAtlas.findRegion("0003"));
	    rotateUpFrames[3] = (textureAtlas.findRegion("0004"));
	    rotateUpFrames[4] = (textureAtlas.findRegion("0005"));
	    rotateUpFrames[5] = (textureAtlas.findRegion("0006"));
	    rotateUpFrames[6] = (textureAtlas.findRegion("0007"));
	    rotateUpFrames[7] = (textureAtlas.findRegion("0008"));
	    rotateUpFrames[8] = (textureAtlas.findRegion("0009"));
	    rotateUpFrames[9] = (textureAtlas.findRegion("0010"));

	    Animation rotateUpAnimation = new Animation(0.1f,rotateUpFrames);
	    
	    // Rotate Down Animation
	    // Or you can just pass in all of the regions to the Animation constructor
	    Animation rotateDownAnimation = new Animation(0.1f,
	            (textureAtlas.findRegion("0011")),
	            (textureAtlas.findRegion("0012")),
	            (textureAtlas.findRegion("0013")),
	            (textureAtlas.findRegion("0014")),
	            (textureAtlas.findRegion("0015")),
	            (textureAtlas.findRegion("0016")),
	            (textureAtlas.findRegion("0017")),
	            (textureAtlas.findRegion("0018")),
	            (textureAtlas.findRegion("0019")),
	            (textureAtlas.findRegion("0020")));

	    Gdx.input.setInputProcessor((InputProcessor) this);
	    */
	}
	
	@Override
	public void dispose() {
	    // TODO Auto-generated method stub
	    batch.dispose();
	    textureAtlas.dispose();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		
		elapsedTime += Gdx.graphics.getDeltaTime();
		batch.draw(animation.getKeyFrame(elapsedTime, true), 0, 0);
		
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
