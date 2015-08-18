package com.scene.skins;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class SceneSkins extends ApplicationAdapter {
	private SpriteBatch batch;
	private Skin skin;
	private Stage stage;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		skin = new Skin(Gdx.files.internal("uiskin.json"));
		stage = new Stage();
		
		final TextButton button = new TextButton("Click me", skin, "default");
		
		button.setWidth(200f);
		button.setHeight(20f);
		button.setPosition(Gdx.graphics.getWidth()/2 -100f, Gdx.graphics.getHeight()/2 - 10f);
		
		button.addListener(new ClickListener(){
		    @Override
		    public void clicked(InputEvent event, float x, float y) {
		        // TODO Auto-generated method stub
		        button.setText("you clicked the button");
		    }
		});
		
		stage.addActor(button);
		
		Gdx.input.setInputProcessor(stage);
	}
	
	@Override
	public void dispose() {
	    // TODO Auto-generated method stub
	    batch.dispose();
	    stage.dispose();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		stage.draw();
		batch.end();
	}
}
