package com.scene2d.part1;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;

public class SceneOne extends ApplicationAdapter {
    
    public class MyActor extends Actor {
        Texture texture = new Texture(Gdx.files.internal("jet.png"));
        public boolean started = false;
        
        public MyActor() {
            setBounds(this.getX(), this.getY(), texture.getWidth(), texture.getHeight());
            addListener(new InputListener(){
                @Override
                public boolean touchDown(InputEvent event, float x, float y,
                        int pointer, int button) {
                    ((MyActor)event.getTarget()).started = true;
                    return true;
                }
            });
        }
        
        @Override
        public void draw(Batch batch, float parentAlpha) {
            batch.draw(texture, this.getX(), this.getY());
        }
        
        @Override
        public void act(float delta) {
            if (started) {
                this.setX(this.getX()+5f);
            }
        }
    }
    
	private Stage stage;
	
	@Override
	public void create () {
		this.stage = new Stage();
		Gdx.input.setInputProcessor(this.stage);
		
		MyActor myActor = new MyActor();
		myActor.setTouchable(Touchable.enabled);
		stage.addActor(myActor);
	}
	
	@Override
	public void dispose() {
	    this.stage.dispose();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
	}
}
