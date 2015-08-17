package com.scene.management;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.badlogic.gdx.scenes.scene2d.actions.ParallelAction;
import com.badlogic.gdx.scenes.scene2d.actions.RotateToAction;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

public class SceneManagement extends ApplicationAdapter {
	private Stage stage;
	private Group group;
	
	@Override
	public void create () {
		stage = new Stage(new ExtendViewport(Gdx.graphics.getWidth(), 
		        Gdx.graphics.getHeight()));
		final TextureRegion jetTexture = new TextureRegion(
		        new Texture(Gdx.files.internal("jet.png")));
		final TextureRegion flameTexture = new TextureRegion(
		        new Texture(Gdx.files.internal("flame.png")));
		
		final Actor jet = new Actor(){
		    @Override
		    public void draw(Batch batch, float parentAlpha) {
		        batch.draw(jetTexture, getX(), getY(), getOriginX(), getOriginY(), 
		                getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
		    }
		};
		jet.setBounds(jet.getX(), jet.getY(), jetTexture.getRegionWidth(), 
		        jetTexture.getRegionHeight());
		
		final Actor flame = new Actor(){
		    @Override
		    public void draw(Batch batch, float parentAlpha) {
		        batch.draw(flameTexture, getX(), getY(), getOriginX(), getOriginY(), 
		                getWidth(), getHeight(),getScaleX(), getScaleY(), getRotation());
		    }
		};
		
		flame.setBounds(0, 0, flameTexture.getRegionWidth(), 
		        flameTexture.getRegionHeight());
		flame.setPosition(jet.getWidth()-25, 25);
		
		group = new Group();
		group.addActor(jet);
		group.addActor(flame);
		
		ParallelAction paAction = new ParallelAction();
		MoveToAction moveToAction = new MoveToAction();
		moveToAction.setPosition(200, 0);
		moveToAction.setDuration(5f);
		RotateToAction rotateToAction = new RotateToAction();
		rotateToAction.setRotation(90);
		rotateToAction.setDuration(5f);
		paAction.addAction(moveToAction);
		paAction.addAction(rotateToAction);
		
		group.addAction(paAction);
		
		stage.addActor(group);
	}
	
	@Override
	public void dispose() {
	    stage.dispose();
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
	}
}
