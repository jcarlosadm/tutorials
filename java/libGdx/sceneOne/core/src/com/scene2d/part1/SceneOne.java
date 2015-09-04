package com.scene2d.part1;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
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
            
            this.setOrigin(texture.getWidth()/2, texture.getHeight()/2);
            this.rotateBy(30);
            
            float radians = (float) Math.toRadians(this.getRotation());
            float centerX = this.getX() + this.getOriginX();
            float centerY = this.getY() + this.getOriginY();
            float increment = -2f;
            float finalX = centerX + increment*((float) Math.cos(radians));
            float finalY = centerY + increment*((float) Math.sin(radians));
            System.out.println("xi: "+centerX);
            System.out.println("xf: "+finalX);
            System.out.println("yi: "+centerY);
            System.out.println("yf: "+finalY);
            
            // speedX * sin(radians) * (-1)
            // speedY * cos(radians)
        }
        
        private float calcYf(float xi, float xf, float yi, float degrees) {
            double radians = Math.toRadians(degrees);
            float m = (float)Math.tan(radians);
            return (m*(xf-xi) + yi);

        }
        
        @Override
        public void draw(Batch batch, float parentAlpha) {
            
            batch.draw(new TextureRegion(texture), this.getX(), this.getY(), this.getOriginX(), 
                    this.getOriginY(), this.getWidth(), this.getHeight(), this.getScaleX(), 
                    this.getScaleY(), this.getRotation());
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
