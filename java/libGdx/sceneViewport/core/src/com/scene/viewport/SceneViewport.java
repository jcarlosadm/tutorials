package com.scene.viewport;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class SceneViewport extends ApplicationAdapter {
	Actor background = null;
	Texture texture;
	
	Stage stage = null;
	
	float translateTotal = 0;
	
	class Background extends Actor {
	    Texture texture;
	    
	    public Background(Stage stage, Texture texture) {
            
	        this.texture = texture;
	        
            stage.getViewport().setWorldSize(this.texture.getWidth(), 
                    this.texture.getHeight());
            stage.getViewport().setCamera(stage.getCamera());
            stage.getCamera().position.set(this.texture.getWidth()/2
                    - stage.getCamera().viewportWidth/2, stage.getCamera().viewportHeight/2, 0);
        }
	    
	    @Override
	    public void draw(Batch batch, float parentAlpha) {
	        // TODO Auto-generated method stub
	        super.draw(batch, parentAlpha);
	        
	        //System.out.println(this.getStage().getCamera().position.x 
	          //      - Gdx.graphics.getWidth()/2);
	        //System.out.println(this.getStage().getViewport().getWorldHeight());
	        //float x = this.getStage().getViewport().getScreenX();
	        //float y = this.getStage().getViewport().getScreenY();
	        batch.draw(this.texture, 0, 0);
	    }
	}
	
	@Override
	public void create () {
		this.stage = new Stage(new ScreenViewport());
		
		this.texture = new Texture(Gdx.files.internal("background.png"));
		this.background = new Background(this.stage, this.texture);
		this.stage.addActor(background);
	}
	
	@Override
	public void dispose() {
	    // TODO Auto-generated method stub
	    super.dispose();
	    this.stage.dispose();
	}
	
	@Override
	public void resize(int width, int height) {
	    // TODO Auto-generated method stub
	    //super.resize(width, height);
	    
	    this.stage.getViewport().update(width, height);
	}
	
	@Override
	public void render () {
	    this.stage.getCamera().update();
	    
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		Camera camera = this.stage.getCamera();
		if (camera.position.x - camera.viewportWidth/2 >= 0f) {
            camera.translate(-1f, 0, 0);
        }
		
		//this.stage.getCamera().translate(1f, 0, 0);
		
		this.stage.draw();
	}
}
